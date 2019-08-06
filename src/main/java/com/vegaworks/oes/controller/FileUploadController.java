package com.vegaworks.oes.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class FileUploadController {

	@PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
		
		 String fileName = this.saveFile(file);

		return fileName + " sucessfully saved";
	}
	
    public String saveFile(MultipartFile file) throws Exception {
        try {
        	String fileNameToSave = StringUtils.cleanPath(file.getOriginalFilename());
            Path pathToSave = Paths.get("/tmp").toAbsolutePath().normalize();

            Path targetLocation = pathToSave.resolve(fileNameToSave);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileNameToSave;
        } catch (IOException ex) {
            throw new Exception("Something went south!", ex);
        }
    }
}
