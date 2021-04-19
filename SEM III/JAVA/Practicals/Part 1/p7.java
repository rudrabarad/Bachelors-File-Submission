import java.util.*;
class p7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Lottery Ticket (2 Digit) : ");
		int x = sc.nextInt();
		Random rand = new Random();
		int lot = rand.nextInt(100);
		System.out.println("Lottery Number Is : "+lot);
		
		if(x==lot)
		{
			System.out.println("\nCongratulations ! You got Exact Match. \nYou Won : $10,000 ");
		}
		else
		{
			int x1 = x/10;
			int x2 = x%10;
			int count = 0;
			int l1 = lot/10;
			int l2 = lot%10;
			
			if(x1==l1)
				count++;
			if(x1==l2)
				count++;
			if(x2==l1)
				count++;
			if(x2==l2)
				count++;
				
			if(count==1)
				System.out.println("\nCongratulations ! You got 1 Match. \nYou Won : $1,000 ");
			if(count==2)
				System.out.println("\nCongratulations ! You Match 2 Digits. \nYou Won : $3,000 ");
			else if(count==0)
			System.out.println("\nSorry ! You didn't got Any Match. \nYou Won : $00,000 ");
		}
		
	
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}