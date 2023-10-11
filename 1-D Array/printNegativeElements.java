class printNegativeElements
{
	public static void main(String[] args)
	{
		int[] a = new int [6];
		a[0] = 56;
		a[1] = -45;
		a[2] = -4;
		a[3] = 20;
		a[4] = 3;
		a[5] = -34;
		
		int i;
		System.out.print("The array elements are --> ");
		
		for(i = 0; i<6; i++)
			System.out.print(a[i]+"\t");
		
		System.out.print("\n");
		System.out.print("The negative array is --> ");
		
		for(i = 0; i<6; i++)
		{
			if(a[i]<0)
				System.out.print(a[i]+"\t");
		}
	}
}