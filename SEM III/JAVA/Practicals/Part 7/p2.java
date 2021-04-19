import java.util.*;
class p2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 10; i > 0; i--)
		{
			a.add(i);
		}
		System.out.println("Unsorted Array: "+a);
		Collections.sort(a);
		System.out.println("Sorted Array: " + a);
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}