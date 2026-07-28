package com.ridam.mydocs.model.element;

import com.ridam.mydocs.model.DocumentElement;

public class ImageElement implements DocumentElement{
	
	String path;
	
	public ImageElement(String path) {
		this.path=path;
	}
	@Override
	public String render() {
		// TODO Auto-generated method stub
		return "<======Image: "+path+" ======>";
	}

}
