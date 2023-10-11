class InsertElement
{
	public static void main(String[] args)
	{
		int[] a = new int[6];
		a[0] = 34;
		a[1] = 56;
		a[2] = 76;
		a[3] = 89;
		a[4] = 96;
		a[5] = '\0';
		
		int i;
		int insert;
		
		System.out.print("The array before insertion is : ");
		
		for(i = 0; i<5; i++)
			System.out.print(a[i]+"\t");
		
		System.out.print("\n");
		System.out.print("The array after inserting is  : ");
		
		insert = 55;
		a[5] = insert;
		
		for(i = 0; i<=5; i++)
			System.out.print(a[i]+"\t");
	}
}