import java.util.*;
import java.io.File;


class p3
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter The Name Of File You Want To Create : ");
			String name = sc.next();

			File obj = new File(name);
			obj.createNewFile();
			if(obj.exists())
			{
				System.out.println("\nFILE EXISTS :)");
				System.out.println("Is File Readable : "+obj.canRead());
				System.out.println("Is File Writable : "+obj.canWrite());
				System.out.println("Is File Executable : "+obj.canExecute());
				
				System.out.println("\nAfter Changing The Permissions to FALSE ");

				obj.setReadable(false);
				System.out.println("Is File Readable : "+obj.canRead());
				obj.setWritable(false);
				System.out.println("Is File Writable : "+obj.canWrite());
				obj.setExecutable(false);
				System.out.println("Is File Executable : "+obj.canExecute());
			}
			
			else
			{
				System.out.println("File Doesn't Exist :(");
			}			

		}
		catch(Exception e)
		{
			System.out.println("Exception is : " + e);
		}


		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}