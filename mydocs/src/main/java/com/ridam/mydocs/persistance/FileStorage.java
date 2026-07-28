package com.ridam.mydocs.persistance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class FileStorage implements Persistence {
	@Override
	public void save(String data) {
		// TODO Auto-generated method stub
		try {
			FileWriter outputFile=new FileWriter("document.txt");
			outputFile.write(data);
			
			outputFile.close();
			System.out.println("Document saved to file: ");
		}catch(IOException e) {
			System.out.println("Error in saving to file: "+e);
		}
			
	}
}
