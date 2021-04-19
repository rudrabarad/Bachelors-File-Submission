import java.util.*;
class account
{
	private	int id = 0;
	private	double balance = 500;
	private	double annualInterestRate = 7;
	private	Date dateCreated;
	Date d1 = new Date();
	Scanner sc = new Scanner(System.in);
	double total,w,d;
	
	account()
	{
		System.out.println("\nNo Argument Default Constructor called.");
		id = 0;
		balance = 500;
		System.out.println("Initial Id : "+id+"\nInitial Balance is : "+balance);
	}
	void getValues()
	{
		System.out.print("\nEnter The ID for Account : ");
		id = sc.nextInt();
		System.out.print("Enter The Balance for Account : ");
		balance = sc.nextDouble();
		System.out.print("Enter The Annual Interest Rate for Account : ");
		annualInterestRate = sc.nextDouble();
		dateCreated = d1;
	}
	void setValues()
	{
		System.out.println("\nID for Account is : "+id);
		System.out.println("Balance for Account is : Rs "+balance);
		System.out.println("Annual Interest Rate for Account is : "+annualInterestRate+" %");
		System.out.println("Date When Account was Created is : "+dateCreated);
	}
	double getMonthlyInterestRate()
	{
		return(annualInterestRate/12);
	}
	double getMonthlyInterest()
	{
		total = (annualInterestRate*balance)/100;
		System.out.println("Annual Interest is : Rs "+total);
		return(total/12);
	}
	void withdraw()
	{
		System.out.println("\nCurrent Balance for Account is : Rs "+balance);
		System.out.print("Enter The Amount Of Balance You Want to Withdraw : ");
		w = sc.nextDouble();
		balance = balance - w;
		System.out.println("\nAfter Withdrawing Balance is : Rs "+balance);
	}
	void deposit()
	{
		System.out.println("\nCurrent Balance for Account is : Rs "+balance);
		System.out.print("Enter The Amount Of Balance You Want to Deposit : ");
		d = sc.nextDouble();
		balance = balance + d;
		System.out.println("\nAfter Depositing Balance is : Rs "+balance);
	}
	
	public static void main(String args[])
	{
		account a1 = new account();
		a1.getValues();
		a1.setValues();
		double month_rate = a1.getMonthlyInterestRate();
		System.out.println("\nTherefore, Monthly Interest Rate is : "+month_rate+" %");
		double month_interest = a1.getMonthlyInterest();
		System.out.println("\nSo, the Monthly Interest is : Rs "+month_interest+" ");
		a1.deposit();
		a1.withdraw();
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
		
	}
}