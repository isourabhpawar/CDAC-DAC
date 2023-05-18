package com.app.stud;
import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
	
	
	private String rollno;
	private String fname;
	private String lname;
	private String email;
	private String address;
	private Course course;
	private Qualif qualify;
	private LocalDate dob;
	private double fees;
	private boolean isDocSubmitted;
	
	
	public Student(String rollno, String fname, String lname, String email, String address, Course course,
			Qualif qualify, LocalDate dob, double fees, boolean isDocSubmitted) {
		super();
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.course = course;
		this.qualify = qualify;
		this.dob = dob;
		this.fees = fees;
		this.isDocSubmitted = isDocSubmitted;
	}
	
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", fname=" + fname + ", email=" + email + ", course=" + course + ", dob="
				+ dob + "]";
	}



	public String getRollno() {
		return rollno;
	}



	public void setRollno(String rollno) {
		this.rollno = rollno;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public Qualif getQualify() {
		return qualify;
	}



	public void setQualify(Qualif qualify) {
		this.qualify = qualify;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public double getFees() {
		return fees;
	}



	public void setFees(double fees) {
		this.fees = fees;
	}



	public boolean isDocSubmitted() {
		return isDocSubmitted;
	}



	public void setDocSubmitted(boolean isDocSubmitted) {
		this.isDocSubmitted = isDocSubmitted;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
