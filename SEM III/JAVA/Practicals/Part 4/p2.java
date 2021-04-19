class my_exception extends Exception
{
	String sop;
	public my_exception(String str)
	{
		sop = str;
	}
	public String toString()
	{
		return ("\nType Of Exception : "+sop);
	}
}

class p2
{
	public static void disp()throws NullPointerException, ArrayIndexOutOfBoundsException
	{
		String s = null;
		System.out.println(s.length());
	}
	public static void main(String args[])
	{
		try
		{
			disp();
		}
		catch(Exception e)
		{
			System.out.println("\n"+e);
		}
		try
		{
			throw new my_exception("USER DEFINED EXCEPTION");
		}
		catch(my_exception e)
		{
			System.out.println(e);
		}
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}