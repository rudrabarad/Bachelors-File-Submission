import java.io.File;

class p2
{
	
	public static void displayIt(File f )
	{
		System.out.println(f.getAbsoluteFile());
		if(f.isDirectory())
		{
			String[] subNote=f.list();
			for(String filename : subNote)
			{
				displayIt(new File (f,filename));
			}
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			System.out.println("\n TREE VIEW OF FILES & DIRECTORIES UNDER SPECIFIC DRIVE : ");
						
			displayIt(new File("C: "));
		}
		catch(Exception e)
		{
			System.out.println("Exception is : " + e);
		}


		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}