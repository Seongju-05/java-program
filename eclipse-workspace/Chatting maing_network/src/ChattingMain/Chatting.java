package ChattingMain;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Chatting {


		public static void main(String[] args) {
			
			try {
				Socket sc = new Socket("10.80.163.185",5000);
				
				OutputStream os = sc.getOutputStream();
				PrintWriter pw = new PrintWriter(os, true);
				
				pw.println("하핳");
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
}
