package sendfile;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileSend {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket sc = new Socket("10.80.162.61",5000);
		
		OutputStream os = sc.getOutputStream();
		BufferedOutputStream bor = new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bor);
		
		File f1 = new File("C:\\cute.png");
		FileInputStream fis = new FileInputStream(f1);
		
		int readsize;
		byte[] bytes = new byte[1024];
		
		while((readsize = fis.read(bytes)) != -1) {
			dos.write(bytes,0,readsize);
		}
	}

}
