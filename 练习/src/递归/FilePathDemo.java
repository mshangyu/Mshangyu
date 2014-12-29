package ตÝน้;

import java.io.File;

public class FilePathDemo {
	public static void main(String[] args) {
		File srcFile = new File("d:\\itcast");
		showFilePath(srcFile);

	}
	
	public static void showFilePath(File srcFile){
		File[] fileArray=srcFile.listFiles();
		
		for (File file : fileArray) {
			if (file.isDirectory()) {
				showFilePath(file);
			}else {
				if (file.getName().endsWith(".java")) {
					System.out.println(file.getAbsolutePath());
				}
			}
		}
		
	}
	

}
