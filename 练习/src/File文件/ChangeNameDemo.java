
package File�ļ�;

import java.io.File;

public class ChangeNameDemo {
	public static void main(String[] args) {
		File srcfile=new File("d:\\��ü����");
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
