	class p5
{
	int stringMatch(String a,String b)
	{
		int i,l,count=0;
		if(a.length() < b.length())
			l=a.length();
		else
			l=b.length();
		
		for(i=0;i<(l-1);i++)
		{
			String sub_a = a.substring(i,i+2);
			String sub_b = b.substring(i,i+2);
			if(sub_a.equals(sub_b))
			count++;
		}
		return count;
	}

	public static void main(String args[])
	{
		p5 p = new p5();
		int temp1 = p.stringMatch("xxcaaz","xxbaaz");
		System.out.println(temp1);
		int temp2 = p.stringMatch("abc","abc");
		System.out.println(temp2);
		int temp3 = p.stringMatch("abc","axc");
		System.out.println(temp3);
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}