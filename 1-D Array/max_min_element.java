class max_min_element
{
	public static void main(String[] args)
	{
		int i;
		int[] array = new int [4];
		
		array[0] = 45;
		array[1] = 329;
		array[2] = 3;
		array[3] = 25;
		
		int max = array[0];
		int min = array[1];
		
		for(i = 0; i<4; i++)
		{
			if(array[i]>max)
				max = array[i];
		}
		
		for(i = 0; i<4; i++)
		{
			if(array[i]<min)
				min = array[i];
		}
		
		System.out.println("The largest element is "+max);
		System.out.println("The smallest element is "+min);
	}
}