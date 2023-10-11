class SearchElement
{
	public static void main(String[] args)
	{
		int[] a = new int [6];
		
		a[0] = 4;
		a[1] = 2;
		a[2] = 54;
		a[3] = 66;
		a[4] = 456;
		a[5] = 8;
		
		int key = 66;
		int flag = 0,pos=0;
		
		for(int i = 0; i<6; i++)
		{
			if(a[i]==key)
			{
				flag = 1;
				pos = i;
				break;
			}
		}
		
		if(flag==1)
			System.out.print("Element present at index "+pos);
		
		else
			System.out.print("Element not present in the array");
	}
}