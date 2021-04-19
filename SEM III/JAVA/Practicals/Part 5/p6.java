import java.io.*;

class p6
{
	public static void main(String args[]) throws IOException
	{
		try
		{
		FileWriter fw = new FileWriter("FileWriter.txt");
		BufferedWriter bfwr = new BufferedWriter(fw);
		
		bfwr.write("This is First Line");
		bfwr.newLine();
		bfwr.write("This is Second Line");
		bfwr.newLine();
		bfwr.write("This is Third Line");
		bfwr.newLine();
		
		bfwr.close();
		
		FileReader fr = new FileReader("FileWriter.txt");
		BufferedReader bfr = new BufferedReader(fr);
		
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Exception is : " + e);
		}
	
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}