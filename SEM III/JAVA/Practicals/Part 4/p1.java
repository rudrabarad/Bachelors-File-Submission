class p1
{
	public static void main(String args[])
	{
		try
		{
			int i = 10;
			System.out.println(i/0);	
		}
		catch(Exception e)
		{
			System.out.println("\n"+e);
		}
		try
		{
			int arr[] = new int[4];
			arr[7]=7;
			System.out.println(arr[7]);
		}
		catch(Exception e)
		{
			System.out.println("\n"+e);
		}

		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}