class p2
{
	 void startOZ(String str)
	{
		if(str.substring(0,1).contains("o"))
		{
			System.out.print("o");
		}
		if(str.substring(1,2).contains("z"))
		{
			System.out.print("z");
		}
		System.out.println("");
	
	}
	public static void main(String args[])
	{
		p2 p = new p2();
		p.startOZ("ozymandias");
		p.startOZ("oxx");
		p.startOZ("azen");	
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}