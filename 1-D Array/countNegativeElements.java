class countNegativeElements
{
	public static void main (String[] args)
	{
		int[] a = new int [6];
		a[0] = 6;
		a[1] = 67;
		a[2] = -34;
		a[3] = -66;
		a[4] = -4;
		a[5] = 4;
		
		int count = 0;
		
		for(int i = 0; i<6; i++)
		{
			if(a[i]<0)
				count++;
		}
		
		System.out.print("The number of negative elements are "+count);
	}
}