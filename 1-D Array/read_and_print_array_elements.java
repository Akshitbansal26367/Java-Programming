class read_and_print_array_elements
{
	public static void main(String[]args)
	{
		int[] array = new int [5];
		array[0] = 12;
		array[1] = 13;
		array[2] = 17;
		array[3] = 8;
		array[4] = 9;
		
		for(int i = 0; i<5; i++)
			System.out.println("The element present at index "+i+" is "+array[i]);
	}
}