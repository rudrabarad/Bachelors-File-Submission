import java.io.File;

class p1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("\nUSING CREATE NEW FILE :");
			File obj1 = new File("File 1.text");
			if(obj1.createNewFile())
			{
				System.out.println("\nFile Is Created : " + obj1.getName());
			}
			else
			{
				System.out.println("\nFile 1 Already Exist !");
			}

			System.out.println("\nAbsolute Path OF File 1 is : "+obj1.getAbsolutePath());
			obj1=obj1.getAbsoluteFile().getParentFile();
			System.out.println("Parent Directory Of File 1 is : "+obj1);
			System.out.println("Length OF File 1 is : "+obj1.length());
			

		}
		catch(Exception e)
		{
			System.out.println("Exception is : " + e);
		}

		try
		{
			System.out.println("\nUSING EXIST :");
			File obj2 = new File("File 2.text");
			obj2.createNewFile();
			if(obj2.exists())
			{
				System.out.println("\nFile 2 Already Exist !");
			}
			else
			{
				System.out.println("\nFile Is Created : " + obj2.getName());
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is : " + e);
		}

		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}