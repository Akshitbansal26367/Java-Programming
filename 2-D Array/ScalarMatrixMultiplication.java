class ScalarMatrixMultiplication
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		
		int i,j;
		
		a[0][0] = 5;             
		a[0][1] = 6;
		a[0][2] = 1;
		a[1][0] = 7;
		a[1][1] = 7;
		a[1][2] = 4;
		a[2][0] = 8;
		a[2][1] = 6;
		a[2][2] = 2;
		
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
				System.out.print("\t\t\t"+(3*a[i][j]));
			System.out.print("\n");
		}
	}
}