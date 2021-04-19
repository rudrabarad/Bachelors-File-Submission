class p5
{
	public static void main(String[]args)
	{

		First f =new First();
		Second s= new Second();
		Third t= new Third();
		System.out.println(f.getPriority());
		System.out.println(s.getPriority());
		System.out.println(t.getPriority());
		f.setPriority(3);
		s.setPriority(5);
		t.setPriority(7);
		System.out.println("After Changing Priority");
		System.out.println(f.getPriority());
		System.out.println(s.getPriority());
		System.out.println(t.getPriority());
		f.start();
		s.start();
		t.start();
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}
class First extends Thread
{
	public void run()
	{
		System.out.println("First");
	}
}

class Second extends Thread
{
	public void run()
	{
		System.out.println("second");
	}
}
class Third extends Thread
{
	public void run()
	{
		System.out.println("Third");
	}
}