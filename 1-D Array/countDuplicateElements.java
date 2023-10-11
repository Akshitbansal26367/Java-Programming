class countDuplicateElements
{
	public static void main(String[] args)
	{
		int[] a = new int [9];
		
		a[0] = 23;
		a[1] = 30;
		a[2] = 4;
		a[3] = 4;
		a[4] = 7;
		a[5] = 7;
		a[6] = 23;
		a[7] = 5;
		a[8] = 40;
		
		int i,count = 0,j;
		
		for(i = 0; i<=8; i++)          
		{             
			for(j = i+1; j<=8; j++)   
			{
				if(a[i]==a[j]) 		
					count++;
			}
		}
		
		System.out.println("The number of duplicate elements are "+count);
	}
}