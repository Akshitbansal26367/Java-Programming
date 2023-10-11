class copyElementsToAnotherArray
{
	public static void main(String[] args)
	{
		int[] a = new int [5];
		int[] b = new int [5];
		
		a[0] = 34;
		a[1] = 56;
		a[2] = 76;
		a[3] = 89;
		a[4] = 96;
		int i;
		
		System.out.print("The given array elements are  : ");
		
		for(i = 0; i<5; i++)
			System.out.print(a[i]+"\t");
	
		System.out.print("\n");
		
		System.out.print("The copied array elements are : ");
		for(i = 0; i<5; i++)
		{
			b[i] = a[i];
			System.out.print(b[i]+"\t");
		}
	}
}