package com.ridam.mydocs.model.element;

import com.ridam.mydocs.model.DocumentElement;

public class NewLineElement implements DocumentElement{
	
	
	@Override
	public String render() {
		// TODO Auto-generated method stub
		return "\n";
	}
}
