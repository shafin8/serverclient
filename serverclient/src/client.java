import java.net.*;
import java.io.*;
class client {

	public static void main(String[] args) {
		
		try{

Socket s=new Socket("192.168.1.102",3000);

DataInputStream din = new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//dos.writeUTF("Welcome to socket");	} catch (Exception e){}
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String msgin ="",msgout="";
	 while(!msgin.equals("end")){
		 msgout = br.readLine();
	dout.writeUTF(msgout);
	msgin = din.readUTF();
	System.out.println(msgin);
	
	 }
		}
		
		
		
		
		catch (Exception e){}
	

}
}
