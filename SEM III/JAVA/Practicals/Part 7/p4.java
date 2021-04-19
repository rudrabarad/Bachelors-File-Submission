import java.util.*;
import java.io.*;
public class p4
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		map.put(1,"abstract");
		map.put(2,"assert");
		map.put(3,"Boolean");
		map.put(4,"break");
		map.put(5,"byte");
		map.put(6,"case");
		map.put(7,"catch");
		map.put(8,"char");
		map.put(9,"class");
		map.put(10,"const");
		map.put(11,"continue");
		map.put(12,"default");
		map.put(13,"do");
		map.put(14,"double");
		map.put(15,"else");
		map.put(16,"enum");
		map.put(17,"extends");
		map.put(18,"final");
		map.put(19,"finally");
		map.put(20,"float");
		map.put(21,"for");
		map.put(22,"goto");
		map.put(23,"if");
		map.put(24,"implements");
		map.put(25,"import");
		map.put(26,"instanceof");
		map.put(27,"int");
		map.put(28,"interface");
		map.put(29,"long");
		map.put(30,"native");
		map.put(31,"new");
		map.put(32,"package");
		map.put(33,"private");
		map.put(34,"protected");
		map.put(35,"public");
		map.put(36,"return");
		map.put(37,"short");
		map.put(38,"static");
		map.put(39,"strictfp");
		map.put(40,"super");
		map.put(41,"switch");
		map.put(42,"synchronized");
		map.put(43,"this");
		map.put(44,"throw");
		map.put(45,"throws");
		map.put(46,"transient");
		map.put(47,"try");
		map.put(48,"void");
		map.put(49,"volatile");
		map.put(50,"while");
		map.put(51," true");
		map.put(52," false");
		map.put(53,"null");
		try
		{
			int cnt = 0;
			BufferedReader reader = new BufferedReader(new FileReader("p3.java"));
			String line = reader.readLine();
			while(line != null)
			{
				String[] list = line.split(" ");
				for(int i = 0; i < list.length; i++)
				{
					if(map.containsValue(list[i]))

					{
						System.out.println(list[i]);
						cnt++;
					}
				}
				line = reader.readLine();
			}
			System.out.println("Count of keywords => " + cnt);
		}
		catch(Exception e)
		{
			System.out.println("Exception => " + e.toString());
		}
		finally
		{
			System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
		}
	}
}