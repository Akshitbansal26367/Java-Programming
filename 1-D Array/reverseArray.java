class reverseArray
{
	public static void main(String[] args)
	{
		int[] a = new int [6];
		a[0] = 56;
		a[1] = 23;
		a[2] = 40;
		a[3] = 45;
		a[4] = 1;
		a[5] = 3;
		
		int i;
		
		System.out.print("The given array is -->  ");
		
		for(i = 0; i<6; i++)
			System.out.print(a[i]+"\t");
		
		System.out.print("\n");
		System.out.print("The reverse array is --> ");
		
		for(i = 5; i>=0; i--)
			System.out.print(a[i]+"\t");
	}
}