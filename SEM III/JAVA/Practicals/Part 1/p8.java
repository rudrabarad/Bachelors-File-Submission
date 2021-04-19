import java.util.*;
class p8
{
	public static void main(String args[])
	{	
		char stu[][] = new char[8][10];
		char ans[] = {'D','B','D','C','C','D','A','E','A','D'};
		int i,j,count=0;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<8;i++)
		{
			System.out.println("Enter The Marks Of Student "+i);
			for(j=0;j<10;j++)
			{
				stu[i][j] = sc.next().charAt(0);
			}
		}
		System.out.println(" ");
		for(i=0;i<8;i++)
		{
			count = 0;
			System.out.print("Correct Answers by Student "+i+" are : ");
			for(j=0;j<10;j++)
			{
					if(stu[i][j]==ans[j])
						count++;
			}
			System.out.print(count+"\n");
		}
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}