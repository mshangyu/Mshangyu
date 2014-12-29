
package FileÎÄ¼þ;

import java.io.File;

public class ChangeNameDemo {
	public static void main(String[] args) {
		File srcfile=new File("d:\\°×Ã¼´óÏÀ");
		File[] filearray=srcfile.listFiles();
		
		for (File file : filearray) {
			String name=file.getName();
			int index=name.lastIndexOf('-');
			String newName=name.substring(index+1);
			File newFile=new File(srcfile,newName);
			file.renameTo(newFile);
		}

	}

}
