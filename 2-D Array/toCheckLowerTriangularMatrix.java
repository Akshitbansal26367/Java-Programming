class toCheckLowerTriangularMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		int i,j,flag=1;
		
		a[0][0] = 1;
		a[0][1] = 0;
		a[0][2] = 0;
		a[1][0] = 8;
		a[1][1] = 6;
		a[1][2] = 0;
		a[2][0] = 4;
		a[2][1] = 5;
		a[2][2] = 6;
		
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+a[i][j]);
			System.out.print("\n");
		}
		
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
			{
				if((i<j) && (a[i][j]!=0))
				{
					flag = 0;
					break;
				}
			}
		}
		
		System.out.print("\n");
		if(flag==1)
			System.out.print("LOWER TRIANGULAR MATRIX");
		
		else
			System.out.print("Not a lower Triangular Matrix");
	}
}