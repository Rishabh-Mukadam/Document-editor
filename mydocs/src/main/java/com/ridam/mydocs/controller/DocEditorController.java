package com.ridam.mydocs.controller;

import com.ridam.mydocs.model.element.ImageElement;
import com.ridam.mydocs.model.element.NewLineElement;
import com.ridam.mydocs.model.element.TextElement;
import com.ridam.mydocs.persistance.Persistence;
import com.ridam.mydocs.service.Document;

public class DocEditorController {
	private Document document;
	private Persistence persistence;
	private String renderedDoc="";
	
	public DocEditorController(Document doc,Persistence persistence) {
		this.document=doc;
		this.persistence=persistence;
	}
	
	public void addText(String str) {
		document.addElement(new TextElement(str));
	}
	
	public void addImage(String path) {
		document.addElement(new ImageElement(path));
	}
	
	public void addNewLine() {
		document.addElement(new NewLineElement());
	}
	
	public String renderDocument() {
		renderedDoc= document.render();
		if (renderedDoc!=null) {
			System.out.println(renderedDoc);
			return renderedDoc;
		}

		System.out.println("Doc is empty");
		return "";
	}
}
