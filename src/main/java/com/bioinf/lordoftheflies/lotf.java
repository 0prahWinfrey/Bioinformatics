package com.bioinf.lordoftheflies;

import java.io.File;

import com.bioinf.lordoftheflies.algorithm.StructureGenerator3DMax;
import com.bioinf.lordoftheflies.utility.Helper;

public class lotf {
	private Helper helper = Helper.getHelperInstance();
	public static void main( String[] args ) throws Exception{	
		String paraFile = "parameters_Matrix.txt";
		if (args != null && args.length >= 1){
			paraFile = args[0];
		}
		//check if the parameter file exists in the current directory
		File file = new File(paraFile);
		if (!file.exists()){
			throw new Exception("The parameter file " + paraFile + "cannot be found in the current directory");
		}
		
		StructureGenerator3DMax generator = new StructureGenerator3DMax(paraFile);
		try {
			generator.generateStructure();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
