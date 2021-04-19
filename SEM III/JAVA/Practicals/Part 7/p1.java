import java.util.ArrayList;
class p1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("Is Arraylist empty => " + a.isEmpty());
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("Items added \nSize of Arraylist => " + a.size());
		System.out.println("First element to remove => " + a.get(0));
		a.remove(0);
		System.out.println("After removing first element => " + a.get(0));
		System.out.println("Adding 0 on the top => ");
		a.add(0,0);
		System.out.println("Final Arraylist => " + a);
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}