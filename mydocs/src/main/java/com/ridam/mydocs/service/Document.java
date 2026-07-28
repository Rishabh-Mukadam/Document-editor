package com.ridam.mydocs.service;

import java.util.ArrayList;
import java.util.List;

import com.ridam.mydocs.model.DocumentElement;

public class Document {
	List<DocumentElement> elements=new ArrayList<DocumentElement>();
	
	public void addElement(DocumentElement element) {
		elements.add(element);
	}
	
	public String render() {
		StringBuilder sb=new StringBuilder();
		for(DocumentElement ele:elements) {
			sb.append(ele.render());
		}
		return sb.toString();
	}
}
