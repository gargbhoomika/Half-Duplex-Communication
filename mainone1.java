package mainone;
import java.io.*;
import java.util.Scanner;
import java.net.*;
public class mainone1 
{
	private static Scanner sc;
	private static ServerSocket ss;

	public static void main(String[] args) 
	{
		String x;
				try
				{
					sc = new Scanner(System.in);
					ss = new ServerSocket(12000);
					Socket s = ss.accept();
					DataInputStream dis = new DataInputStream(s.getInputStream());
					DataOutputStream dos = new DataOutputStream(s.getOutputStream());
					while(true)
					{
						String str = dis.readUTF();
						System.out.println(str);
						System.out.println("Enter Message: ");
						x = sc.nextLine();
						dos.writeUTF(x);
					}
				}
				catch(Exception e) { System.out.println("Not running");}
	}
}
