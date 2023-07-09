package com.app.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.app.dto.ApiResponse;

public interface ImageHandlingService {
//upload image
	ApiResponse uploadImageToFolder(Long empId, MultipartFile file) throws IOException;
	//download image (serving the image)
	byte[] downloadImageFromFolder(Long empId) throws IOException;
	//add 2 more methods : upload n download images from db : H.W
}
