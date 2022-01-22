import java.net.*;
import java.io.*;
public class Clients
{Socket C=null;
	public Clients()
	{  try{
		connectToserver();
		}catch(Exception e)
	{System.out.println(e);
		}
		}
	void  connectToserver()
	{ while(true)
	{try{
		C=new Socket("localhost",1000);
  	DataInputStream KB=new DataInputStream(System.in);
	  System.out.print("Client:");
	  String cm=KB.readLine();
	  PrintStream ctos=new PrintStream(C.getOutputStream());
	  ctos.println(cm);
	  DataInputStream smsg=new DataInputStream(C.getInputStream());
	  String msg=smsg.readLine();
	  System.out.println("Server:"+msg);
	}catch(Exception e)
	{System.out.println(e);
		}
		}
		}

	public static void main(String arg[])
	{new Clients();
		}

}
