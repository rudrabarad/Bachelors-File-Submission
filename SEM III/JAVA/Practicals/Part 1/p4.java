class p4
{	
	boolean array123(int arr[])
	{
		boolean flag = false;
		int l = arr.length;
		for(int i=0;i<(l-1);i++)
		{
			if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
			{
				flag = true;
			}
		}
		return flag;
	}
	
	public static void main(String args[])
	{
		p4 p = new p4();
		int arr1[] = {1,1,2,3,1};
		int arr2[] = {1,1,2,4,1};
		int arr3[] = {1,1,2,1,2,3};
		boolean b1 = p.array123(arr1);
		System.out.println(b1);
		boolean b2 = p.array123(arr2);
		System.out.println(b2);
		boolean b3 = p.array123(arr3);
		System.out.println(b3);
		
		System.out.println("\nID : 18DCS007\nName : RUDRA BARAD");
	}
}