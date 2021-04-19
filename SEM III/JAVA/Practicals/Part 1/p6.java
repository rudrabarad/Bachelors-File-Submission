import java.util.Scanner;
class p6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Weight in Pounds : ");
		double weight = sc.nextDouble();
		System.out.print("Enter the Height in Inches : ");
		double height = sc.nextDouble();
		
		double bmi;
		bmi = (0.45359237*weight)/((0.0254*height)*(0.0254*height));
		System.out.println("BMI is : "+bmi);
		
		if(bmi<18.5)
		System.out.println("\nPerson is UNDERWEIGHT");
		else if(bmi>=18.5 && bmi<25.0)
		System.out.println("\nPerson is NORMAL");
		else if(bmi>=25.0 && bmi<30.0)
		System.out.println("\nPerson is OVERWEIGHT");
		else if(bmi>=30.0)
		System.out.println("\nPerson is OBESE");
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}