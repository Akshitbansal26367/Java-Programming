class mergeTwoArray
{
	public static void main(String[] args)
	{
		int[] a = new int [4];
		a[0] = 56;
		a[1] = 23;
		a[2] = 40;
		a[3] = 45;
		
		int[] b = new int [4];
		b[0] = 1;
		b[1] = 3;
		b[2] = 45;
		b[3] = 4;
		
		int i;
		int[] c = new int [8];
		
		System.out.print("The first array is  --> \t");
		
		for(i = 0; i<4; i++)
			System.out.print(a[i]+"\t");
		
		System.out.print("\n");
		System.out.print("The second array is --> \t");
		
		for(i = 0; i<4; i++)
			System.out.print(b[i]+"\t");
		
		System.out.print("\n\n");
		System.out.print("The merged array is --> \t");
		
		for(i = 0; i<8; i++)
		{
			if(i<=3)
			{
				c[i] = a[i];
				System.out.print(c[i]+"\t");
			}
			
			else
			{
				c[i] = b[i-4];
				System.out.print(c[i]+"\t");
			}
		}
	}
}