package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.dto.ApiResponse;
import com.app.dto.AuthRequestDTO;
import com.app.entities.Employee;
import com.app.service.EmployeeService;
import com.app.service.ImageHandlingService;

@RestController // =@Controller + @ResponseBody
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
@Validated
//To Tell SC to add CORS resp header : cross origin resourse sharing  , 
//so that web browser security model allows accessing the resp.
public class EmployeeController {
	// dep : service layer i/f
	@Autowired
	private EmployeeService empService; // emp CRUD

	// dep : for image handling
	@Autowired
	private ImageHandlingService imageService;

	public EmployeeController() {
		System.out.println("in def ctor of " + getClass());
	}

	// http://localhost:8080/employees/ , method = GET
	// add a req handling method to ret list of emps
	@GetMapping
	public List<Employee> listEmps() {
		System.out.println("in list emps");
		return empService.getAllEmployees();
	}

	// http://localhost:8080/employees/ , method = POST
	// add a req handling method to save an emp
	@PostMapping
	public ResponseEntity<?> saveEmpDetails(@RequestBody Employee transientEmp) {
		System.out.println("in save " + transientEmp);// not null , id : null
		return new ResponseEntity<>(empService.addEmpDetails(transientEmp), HttpStatus.CREATED);
	}

	// http://localhost:8080/employees/10 , method = DELETE
	@DeleteMapping("/{empId}")
	public ApiResponse deleteEmpDetails(@PathVariable Long empId) {
		System.out.println("in del emp dtls " + empId);
		// invoke service layer method , get it's resp , wrap it in a DTO -->
		// marshalling --> json --sent to fron end
		return new ApiResponse(empService.deleteEmpDetails(empId));
	}

	// http://localhost:8080/employees/10 , method = GET
	// add a validation rule : empId : 1---100
	@GetMapping("/{empId}")
	public Employee getEmpDetails(
			@PathVariable @Valid @Min(value = 1, message = "emp id > 1") @Max(value = 100, message = "emp id must be < 100") long empId) {
		System.out.println("in get emp dtls " + empId);
		return empService.getEmpDetails(empId);
	}

	// http://localhost:8080/employees , method = PUT
	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee detachedEmp) {

		System.out.println("in update emp " + detachedEmp);// id : not null
		return empService.updateEmpDetails(detachedEmp);
	}

	// http://host:port/employees/signin , Method : POST
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateEmp(@RequestBody @Valid AuthRequestDTO request) {
		System.out.println("in auth emp " + request);
		return ResponseEntity.status(HttpStatus.OK).body(empService.authenticateEmp(request));
	}

	/*
	 * URL : http://host:port/employees/images method : POST 2 req params : emp id ,
	 * file
	 */
	@PostMapping(value = "/images", consumes = "multipart/form-data")
	public ResponseEntity<?> uploadEmpImage(@RequestParam Long empId, @RequestParam MultipartFile file)
			throws IOException {
		System.out.println("in img upload " + empId);
		return ResponseEntity.status(HttpStatus.CREATED).body(imageService.uploadImageToFolder(empId, file));
	}

	// http://host:port/images/{empId}
	// method : GET
	@GetMapping(value = "/images/{empId}", produces = { MediaType.IMAGE_GIF_VALUE, MediaType.IMAGE_JPEG_VALUE,
			MediaType.IMAGE_PNG_VALUE })
	public ResponseEntity<?> serveEmpImage(@PathVariable Long empId) throws IOException {
		System.out.println("in serve img " + empId);
		return ResponseEntity.ok().body(imageService.downloadImageFromFolder(empId));
	}

}
