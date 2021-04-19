class p4
{
	public static void main(String[]args)
	{
		example1 e1= new example1();
		e1.start();

	}
}
class example1 extends Thread
{
	public void run()
	{
		int a=5;
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(a);
				a++;
				Thread.sleep(1000);
			}
			System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}