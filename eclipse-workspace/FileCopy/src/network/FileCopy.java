package network;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\cute.png");
		FileInputStream fis = new FileInputStream(f1);
		
		FileOutputStream fos = new FileOutputStream("D:\\temp\\cute.png");
		
		int readsize;
		byte[] bytes = new byte[1024];
		
		while((readsize = fis.read(bytes)) != -1) {
			fos.write(bytes,0,readsize);
		}
	}
	
}
