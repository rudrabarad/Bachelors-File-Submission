import java.util.*;
public class p3
{
	public static void main(String[] args)
	{
		String text = "A B C E D A B C E D B C E A B D E D";
		String[] list = text.split(" ");
		Map map = new HashMap();
		for(int i = list.length - 1; i >= 0; i--)
		{
			int cnt = 0;
			for(int j = i; j < list.length; j++)
			{
				if(list[i].equals(list[j]))
				{
					cnt++;
				}
			}
			map.put(list[i], cnt);
		}
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("Key => " + entry.getKey() + "\t\t Value => " +
				entry.getValue());
		}
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}