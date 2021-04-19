import java.io.*;

class byte_class
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin = null; 
		FileOutputStream fout = null; 
	
		try
		{				
			fin = new FileInputStream("Input_Byte.txt");
			fout = new FileOutputStream("Output_Byte.txt");
			int b=0;
			while((b=fin.read())!=-1)
			{
				fout.write(b);
			}
		}
		finally
		{
			if(fin != null)
				fin.close();
			if(fout != null)
				fout.close();
			System.out.println("\nSuccessfull For BYTE STREAM.");
		}
		
	}
}
	
	class character_class
	{
		public static void main(String args[]) throws IOException
		{
	
		FileReader fr = null; 
		FileWriter fw = null; 
	
		try
		{			
			fr = new FileReader("Input_Character.txt");
			fw = new FileWriter("Output_Character.txt");
			int c=0;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
			}
		}
		finally
		{
			if(fr != null)
				fr.close();
			if(fw != null)
				fw.close();
			System.out.println("\nSuccessfull For CHARACTER STREAM.");
		}
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
		}
	
}