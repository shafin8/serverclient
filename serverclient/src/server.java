import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.io.*;

public class server {

	public static void main(String[] args) {
		
		try{
ServerSocket ss = new ServerSocket(3000);
Socket s=ss.accept();
System.out.println("connected");
DataInputStream din = new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//dos.writeUTF("Welcome to socket");	} catch (Exception e){}
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String msgin ="",msgout="";
	 while(!msgin.equals("end")){
		 msgin = din.readUTF();
	System.out.println(msgin);
	msgout = br.readLine();
	dout.writeUTF(msgout);
	dout.flush();
	 } s.close();
	 } 
		
		
		catch (Exception e){}

}
}
