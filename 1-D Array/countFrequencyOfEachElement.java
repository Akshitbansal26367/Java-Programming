class countFrequencyOfEachElement
{
	public static void main(String[] args)
	{
		int[] a = new int [7];
		int[] freq = new int [7];
		
		a[0] = 5;
		a[1] = 7;
		a[2] = 8;
		a[3] = 7;
		a[4] = 7;
		a[5] = 7;
		a[6] = 8;
		
		int i,j,count;
		
		for(i = 0; i<7; i++)
			freq[i] = -1;                                                                   
		
		for(i = 0; i<7; i++)                     
		{                           
			count = 1;					 				
			for(j = i+1; j<7; j++)     
			{
				if(a[i] == a[j])       
				{
					count++;              
					freq[j] = 0;      
				}

			}
			
			if(freq[i]!=0)         
				freq[i] = count;     
		}
		
		for(i = 0; i<7; i++)
		{
			if(freq[i]!=0)
				System.out.println("The frequency of "+a[i]+" is "+freq[i]);
		}		
	}
}
					