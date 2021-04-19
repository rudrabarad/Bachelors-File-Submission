class overloading
{
	
	void add(int a, int b)
	{
		int sum = a + b;
		System.out.println("\nAddition of Two int Numbers "+a+" and "+b+" : "+sum);
	}
	void add(double a, double b)
	{
		double sum = a + b;
		System.out.println("Addition of Two double Numbers "+a+" and "+b+" : "+sum);
	}
	void add(int a, double b)
	{
		double sum = a + b;
		System.out.println("Addition of One int and One Double Number "+a+" and "+b+" : "+sum);
	}
	void add(char a, char b)
	{
		int sum = a + b;
		System.out.println("Addition of Two chars "+a+" and "+b+" : "+sum);
	}
	void add(char a, int b)
	{
		int sum = a + b;
		System.out.println("Addition of One char and One int "+a+" and "+b+" : "+sum);
	}

	public static void main(String args[])
	{
		System.out.println("\nMETHOD OVERLOADING EXAMPLE");
		overloading o = new overloading();
		o.add(3,6);
		o.add(22.4,27.6);
		o.add(2,5.0);
		o.add('A','B');
		o.add('A',10);
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}