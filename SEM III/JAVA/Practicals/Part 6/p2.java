import java.util.*;
class p2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int N=sc.nextInt();
		System.out.print("Enter the number of threads :");
		int n=sc.nextInt();
		Summation sm=new Summation();
		int k,l=n,h=n;
		if(N<n)
		{
			for(int i=1;i<l;i++)
			{
				h--;
				if(N==h)
				{
					n=h;
					break;
				}
			}
		}
		k=N/n;
		int j=1,z=k;
		if(N%n!=0)
		{
			int m=(N-(k*n));
			new MyThread(sm,(k*n+1),N,m).start();
		}
		for(int i=1;i<=n;i++)
		{
			new MyThread(sm,j,k,z).start();

			j=k+1;
			k=k+z;
		}
		try
		{
			Thread.sleep(1000);
			sm.show();
		}
		catch(Exception ex){}
	}
}
class MyThread extends Thread
{
	int start,end,iter;
	Summation sm;
	MyThread(Summation sm,int s,int e,int i)
	{
		this.sm=sm;
		start=s;
		end=e;
		iter=i;
	}
	public void run()
	{
		sm.add(start,end,iter);
	}
}
class Summation
{
	public int sum=0;
	public synchronized void add(int s,int e,int iter)
	{
		for(int i=0; i<iter;i++)
		{
			sum+=s;
			s++;
		}
	}

	public void show()
	{
		System.out.println("The total sum of all numbers is :"+sum);
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}