
import java.net.*;
import java.io.*;

public class StartSocket {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//		FileInputStream input = new FileInputStream("address_book");  /* Attach any Input Stream to the socket Stream
		 ServerSocket   serverSocket = new ServerSocket(7000);
		 
		 Socket s1 = serverSocket.accept();
		 
		 System.out.println("connected from " + s1.getRemoteSocketAddress());
		 
		 PrintWriter out = new PrintWriter(s1.getOutputStream());
		 while(true){
			 Thread.sleep(10000);
			 out.write("I am a complan Boy \n");
			 out.flush();
			 
			 
		 }
	}

}
