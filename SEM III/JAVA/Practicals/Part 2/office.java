import java.util.*;

class office
{
	int empNo;
	String empName;
	double salary;
	Scanner sc = new Scanner(System.in);
	
	void getValue()
	{
		System.out.print("\nEnter the Employee Name : ");
		empName = sc.nextLine();
		System.out.print("Enter the Employee Number : ");
		empNo = sc.nextInt();
		System.out.print("Enter the Salary of Employee :");
		salary = sc.nextDouble();
	}
}

class teaching extends office
{
	void setValue()
	{
		String designation = "TEACHING";
		System.out.println("\nDesignation is : "+designation);
		System.out.println("\nEmployee Number for Teaching is : "+empNo);
		System.out.println("Employee Name for Teaching is : "+empName);
		System.out.println("Salary for Teaching is :"+salary+"\n");
	}
}

class non_teaching extends office
{

	void setValue()
	{
		String designation = "NON - TEACHING";
		System.out.println("\nDesignation is : "+designation);
		System.out.println("\nEmployee Number for Non-Teaching is : "+empNo);
		System.out.println("Employee Name for Non-Teaching is : "+empName);
		System.out.println("Salary for Non-Teaching is :"+salary);
	}

	public static void main(String args[])
	{
		teaching t = new teaching();
		t.getValue();
		t.setValue();
		
		non_teaching nt = new non_teaching();
		nt.getValue();
		nt.setValue();

		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
	
}