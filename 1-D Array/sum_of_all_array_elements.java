class sum_of_all_array_elements
{
	public static void main(String[] args)
	{
		int[] array = new int [5];
		int sum =0;
		array[0] = 12;
		array[1] = 13;
		array[2] = 17;
		array[3] = 8;
		array[4] = 9;
		
		for(int i =0; i<5; i++)
			sum = sum+array[i];
		
		System.out.println("The sum of array elements is "+sum);
	}
}