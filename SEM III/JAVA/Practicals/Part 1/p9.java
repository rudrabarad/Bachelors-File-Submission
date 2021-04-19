import java.util.*;
class p9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int s[][] = new int[9][9];
		s[0][0]=5;
		s[0][1]=3;
		s[0][4]=7;
		s[1][0]=6;
		s[1][3]=1;
		s[1][4]=9;
		s[1][5]=5;
		s[2][1]=9;
		s[2][2]=8;
		s[2][7]=6;
		s[3][0]=8;
		s[3][4]=6;
		s[3][8]=3;
		s[4][0]=4;
		s[4][3]=8;
		s[4][5]=3;
		s[4][8]=1;
		s[5][0]=7;
		s[5][0]=7;
		s[5][4]=2;
		s[5][8]=6;
		s[6][1]=6;
		s[7][3]=4;
		s[7][4]=1;
		s[7][5]=9;
		s[7][8]=5;
		s[8][4]=8;
		s[8][7]=7;
		s[8][8]=9;
		
		for(int i=0;i<9;i++)
		{
			System.out.println(" ");
			for(int j=0;j<9;j++)
			{
				System.out.print("    "+s[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("\nHere's the Incomplete Sudoko !\nComplete The Sudoko : \n");
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				s[i][j] = sc.nextInt(); 	
			}
			
		}
		int sum=0,flag=0;
		
		for(int i=0;i<9;i++)
		{
				for(int j=0;j<9;j++)
				{
					sum+=s[i][j];
				}
					if(sum==45)
						flag = 1;
					else 
						flag = 0;	
				sum=0;
		}
		
		for(int i=0;i<9;i++)
		{
				for(int j=0;j<9;j++)
				{
					sum+=s[j][i];
				}
					if(sum==45)
						flag = 1;
					else 
						flag = 0;
				sum=0;	
		}
		if(flag==1)
			System.out.println("\nCongratulations ! Your Sudoku is 100% CORRECT :) ");
		else 
			System.out.println("\nSorry ! Your Sudoku is INCORRECT :( ");
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
		
		
	}
}