class AscendingOrder
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
		
		int i,j,temp;
		
		for(i = 0; i<6; i++)
		{
			for(j = i+1; j<6; j++)
			{
				if(a[j]<a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("The array in ascending order is --> ");
		for(i = 0; i<6; i++)
			System.out.print(a[i]+"\t");
	}
}