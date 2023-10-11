class putOddAndEvenInSortedArrays
{
	public static void main(String[] args)
	{
		int[] a = new int [6];
		
		a[0] = 23;
		a[1] = 12;
		a[2] = 5;
		a[3] = 55;
		a[4] = 46;
		a[5] = 6;
		
		int[] odd = new int [6];
		int[] even = new int [6];
		int i,j = 0, k = 0,r,temp;
		
		for(i = 0; i<6; i++)           
		{
			if(a[i]%2==0)
			{
				even[j] = a[i];
				j++;
			}
			
			else
			{
				odd[k] = a[i];
				k++;
			}
		}
		
		System.out.print("The even element sorted array is --> \t");
		
		for(i = 0; i<j; i++)
		{
			for(r = i+1; r<j; r++)
			{
				if(even[i]>even[r])
				{
					temp = even[i];
					even[i] = even[r];
					even[r] = temp;
				}
			}
			System.out.print(even[i]+"\t");
		}
		
		System.out.print("\n");
		System.out.print("The odd element sorted array is -->  \t");
		
		for(i = 0; i<k; i++)
		{
			for(r = i+1; r<k; r++)
			{
				if(odd[i]>odd[r])
				{
					temp = odd[i];
					odd[i] = odd[r];
					odd[r] = temp;
				}
			}
			System.out.print(odd[i]+"\t");
		}
	}
}