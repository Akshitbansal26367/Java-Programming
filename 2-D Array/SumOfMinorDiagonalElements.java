class SumOfMinorDiagonalElements
{
	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		int i,j,sum=0;
		
		a[0][0] = 23;
		a[0][1] = 3;
		a[0][2] = 49;
		a[1][0] = 34;
		a[1][1] = 38;
		a[1][2] = 43;
		a[2][0] = 33;
		a[2][1] = 40;
		a[2][2] = 55;
		
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
				if((i+j==2))
					sum = sum + a[i][j];
			}
		}
		
		System.out.print("\n");
		System.out.print("The sum of minor diagonal elements is "+sum);
	}
}