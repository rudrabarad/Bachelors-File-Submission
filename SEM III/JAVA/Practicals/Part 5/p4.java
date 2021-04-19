import java.io.FileInputStream;
import java.io.FileOutputStream;

class p4
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin = new FileInputStream("Source.txt");
			FileOutputStream fout = new FileOutputStream("Destination.txt");
			
			int c=0;
			while((c=fin.read())!=-1)
			{
				fout.write(c);
			}
			fin.close();
			fout.close();
		System.out.println("\nSuccess");
		}
		catch(Exception e)
		{
			System.out.println("Exception is : " + e);
		}
		

		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}