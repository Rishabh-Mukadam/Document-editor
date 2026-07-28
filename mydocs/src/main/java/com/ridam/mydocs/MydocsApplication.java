package com.ridam.mydocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ridam.mydocs.controller.DocEditorController;
import com.ridam.mydocs.persistance.FileStorage;
import com.ridam.mydocs.service.Document;

@SpringBootApplication
public class MydocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydocsApplication.class, args);
		DocEditorController controller=new DocEditorController(new Document(), new FileStorage());
		
		controller.addText("Hello Rishabh");
		controller.addNewLine();
		controller.addImage("imagae.png");

		controller.renderDocument();
	}

}
