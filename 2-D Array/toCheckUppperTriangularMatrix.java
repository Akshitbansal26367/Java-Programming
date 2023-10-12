class toCheckUppperTriangularMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		int i,j,flag=1;
		
		a[0][0] = 15;
		a[0][1] = 36;
		a[0][2] = 40;
		a[1][0] = 0;
		a[1][1] = 8;
		a[1][2] = 11;
		a[2][0] = 0;
		a[2][1] = 0;
		a[2][2] = 4;
		
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+a[i][j]);
			System.out.print("\n");
		}
		
		for(i = 0; i<3; i++)        
		{
			for(j = 0; j<i; j++)    
			{
				if(a[i][j]!=0)
				{
					flag = 0;
					break;
				}
			}
		}
		
		System.out.print("\n");
		
		if(flag==1)
			System.out.print("Upper Triangular Matrix");
		
		else
			System.out.print("Not a Upper Triangular Matrix");
	}
}