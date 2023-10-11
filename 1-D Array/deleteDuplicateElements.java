class deleteDuplicateElements
{
	public static void main(String[] args)
	{
		int[] a = new int [7];
		int[] flag = new int [7];
		a[0] = 5;
		a[1] = 7;
		a[2] = 8;
		a[3] = 7;
		a[4] = 7;
		a[5] = 7;
		a[6] = 8;
		
		int i,j;
		
		System.out.print("The given array is                                --> \t");
		
		for(i = 0; i<7; i++)
			System.out.print(a[i]+"\t");
		
		for(i = 0; i<7; i++)            
		{
			flag[i] = 0;                
			
			for(j = i+1; j<7; j++)        
			{
				if(a[i]==a[j])          
				{
					flag[i] = 1;      
					break;
				}
			}
		}
		
		System.out.print("\n");
		System.out.print("The array after deleting duplicate elements array --> \t");
		for(i = 0; i<7; i++)
		{
			if(flag[i]==0)
				System.out.print(a[i]+"\t");
		}
	}
}			