class MultiplyTwoMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		int[][] b = new int [3][3];
		int[][] c = new int [3][3];
		
		a[0][0] = 2;             
		a[0][1] = 3;
		a[0][2] = 1;
		a[1][0] = 4;
		a[1][1] = 0;
		a[1][2] = 2;
		a[2][0] = 3;
		a[2][1] = 1;
		a[2][2] = 5;
		
		b[0][0] = 1;
		b[0][1] = 2;
		b[0][2] = 0;
		b[1][0] = 4;
		b[1][1] = 1;
		b[1][2] = 3;
		b[2][0] = 4;
		b[2][1] = 2;
		b[2][2] = 1;
		
		int i,j,k,sum;
		
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+a[i][j]);
			System.out.print("\n");
		}
		
		System.out.print("\n");
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+b[i][j]);
			System.out.print("\n");
		}
		
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
			{
				sum = 0;
				for(k = 0; k<3; k++)
					sum = sum+a[i][k]*b[k][j];
				c[i][j] = sum;
			}
		}
		
		System.out.print("\n");
		
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+c[i][j]);
			System.out.print("\n");
		}				
	}
}