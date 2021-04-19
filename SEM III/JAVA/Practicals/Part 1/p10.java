import java.util.*;
class p10
{
	static double calculateDistance(double x1, double x2, double y1, double y2)
	{
		return(Math.sqrt( Math.pow(y1-x1,2) + Math.pow(y2-x2,2) ) );
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter The Amount Of Number You want to check : ");
		int num = sc.nextInt();
		double n1=0,n2=0,n3=0,n4=0;
		double arr[][] = new double[num][2];
		int i,j;
		double dist,min;
		
		System.out.println("\nEnter "+num+" set of Numbers \n");
		for(i=0;i<num;i++)
		{
		System.out.print("SET "+(i+1)+" :	");
			for(j=0;j<2;j++)
			{
				arr[i][j] = sc.nextDouble();
			}
		}
		
		min = calculateDistance(arr[0][0],arr[0][1],arr[1][0],arr[1][1]);
		System.out.println(" ");
		
		for(i=0;i<(num-1);i++)
		{
			for(j=(i+1);j<(num);j++)
				{
				dist = calculateDistance(arr[i][0],arr[i][1],arr[j][0],arr[j][1]);
				if ( dist < min )
					{
					min = dist;
					n1 = arr[i][0];
					n2 = arr[i][1];
					n3 = arr[i+1][0];
					n4 = arr[i+1][1];
					}
				}
		}
		System.out.println("\nThe closest two points are : ( "+n1+" , "+n2+" ), ( "+n3+" , "+n4+" ) ");

		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");		
		
	}
}