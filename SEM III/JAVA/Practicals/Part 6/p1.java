class p1
{
	public static void main(String[]args)
	{
		example1 e1= new example1();
		e1.start();
		example2 e2=new example2();
		Thread t= new Thread(e2);
		t.start();
	}
}
class example1 extends Thread
{
	public void run()
	{
		System.out.println("By extending thread class");
	}
}
class example2 implements Runnable
{
	public void run()
	{
		System.out.println("By implementing runnable ");
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}