package com.ridam.mydocs.model.element;

import com.ridam.mydocs.model.DocumentElement;

public class TextElement implements DocumentElement{
	String text;
	
	public TextElement(String text) {
		this.text=text;
	}
	@Override
	public String render() {
		// TODO Auto-generated method stub
		return text;
	}
}
