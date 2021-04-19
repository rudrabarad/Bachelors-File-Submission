class p3
{
	boolean lastDigit(int a,int b)
	{
		System.out.println("\nNumbers a and b are : "+a+" "+b);
			
			a=a%10;
			b=b%10;
			System.out.println("Last Digit Of a : "+a);
			System.out.println("Last Digit Of b : "+b);
			return(a==b);
	}
	
	public static void main(String args[])
	{
		p3 p = new p3();
		
		boolean b1 = p.lastDigit(7,17);
		System.out.println(b1);
		boolean b2 = p.lastDigit(6,17);
		System.out.println(b2);
		boolean b3 = p.lastDigit(3,113);
		System.out.println(b3);
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}