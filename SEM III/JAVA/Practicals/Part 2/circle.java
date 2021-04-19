class circle
{
	double radius = 1;
	
	circle()
	{
		System.out.println("\nNo Argument Default Constructor called.");
	}
	circle(double r)
	{
		System.out.println("\nSingle Argument Constructor called.");
		radius = r;
		System.out.println("\nRadius of Circle is : "+radius);
	}
	double getArea()
	{
		return(3.14*radius*radius);
	}
	double getPerimeter()
	{
		return(2*3.14*radius);
	}
	public static void main(String args[])
	{
		circle c1 = new circle();
		circle c2 = new circle(10.00);
		double a = c2.getArea();
		double p = c2.getPerimeter();
		System.out.println("\nPrimeter Of Circle is : "+p);
		System.out.println("Area Of Circle is : "+a);
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}