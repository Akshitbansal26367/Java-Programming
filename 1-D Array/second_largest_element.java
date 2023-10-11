class second_largest_element
{
	public static void main(String[] args)
	{
		int[] array = new int [5];
		array[0] = 2;
		array[1] = 16;
		array[2] = 16;
		array[3] = 8;
		array[4] = 9;
		
		int i,size = array.length;
		int max = array[0];
		int secMax = array[0];

		for(i =0; i<size; i++){
			if(max<array[i]){
				secMax = max;
				max = array[i];
			}
			else if (secMax<array[i] && array[i]!=max)
				secMax = array[i];
		}
		System.out.println("The second largest element is "+secMax);
	}
}