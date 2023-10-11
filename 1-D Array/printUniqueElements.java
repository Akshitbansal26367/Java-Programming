class printUniqueElements
{
	public static void main(String[] args)
	{
		int[] a = new int [8];
		a[0] = 5;
		a[1] = 7;
		a[2] = 8;
		a[3] = 7;
		a[4] = 7;
		a[5] = 7;
		a[6] = 8;
		a[7] = 1;
		
		int[] freq = new int [8];
		int i,j,count;
		
		for(i = 0; i<8; i++)
			freq[i] = -1;                     
		
		for(i = 0; i<8; i++)                 
		{
			count = 1;                     
			for(j = i+1; j<8; j++)           
			{
				if(a[i]==a[j])               
				{
					count = count+1;       
					freq[j] = 0;            
				}
			}
			
			if(freq[i]!=0)                  
				freq[i] = count;            
		}
		
		System.out.print("The unique element array is --> \t");
		
		for(i = 0; i<8; i++)
		{
			if(freq[i]==1)                  
				System.out.print(a[i]+"\t");
		}
	}
}