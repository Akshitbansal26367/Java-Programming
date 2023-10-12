class sumOfUppperTriangularMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		int i,j,sum=0;
		
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
			for(j = 0; j<3; j++)
			{
				if(i<=j)
					sum = sum + a[i][j];
			}
		}
		
		System.out.print("\n");
		System.out.print("The sum of upper triangular matrix is "+sum);
	}
}