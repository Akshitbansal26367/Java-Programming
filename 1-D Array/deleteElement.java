class deleteElement
{
	public static void main(String[] args)
	{
		int[] a = new int [6];
		
		a[0] = 56;
		a[1] = 23;
		a[2] = 45;
		a[3] = 67;
		a[4] = 50;
		a[5] = 59;
		
		int delete,i;
		
		System.out.print("The array before deletion is --> ");
		
		for(i = 0; i<=5; i++)
			System.out.print(a[i]+"\t");
		
		System.out.print("\n");
		System.out.print("The array after deletion is  --> ");
		
		delete = 4;
		
		for(i = delete; i<=4; i++)    
			a[i] = a[i+1];       
		
		for(i = 0; i<5; i++)
			System.out.print(a[i]+"\t");
	}
}	