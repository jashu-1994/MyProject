import java.net.*;
import java.io.*;
public class Servers extends Thread
{  ServerSocket S=null;
   DataInputStream cmsg=null;
   PrintStream stoc=null;
   public Servers()
   { try{
	   S=new ServerSocket(1000);
	   start();
} catch(Exception e)
 {System.out.println(e);
	 }
	   }

	public void run()
	{ while(true)
	{ try{
	Socket C=S.accept();
	  cmsg=new DataInputStream(C.getInputStream());
	  String msg=cmsg.readLine();
	  System.out.println("Client:"+msg);
	  DataInputStream KB=new DataInputStream(System.in);
	  System.out.print("Server:");
	  String sm=KB.readLine();
	 stoc=new PrintStream(C.getOutputStream());
	 stoc.println(sm);
 }catch(Exception e)
 {
	 System.out.println(e);}
				}
		}

	 public static void main(String arg[])
	 { new Servers();
		 }
	}