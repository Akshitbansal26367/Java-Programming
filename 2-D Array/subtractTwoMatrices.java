class subtractTwoMatrices
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		int[][] b = new int [3][3];
		
		int i,j;
		
		a[0][0] = 56;             
		a[0][1] = 30;
		a[0][2] = 11;
		a[1][0] = 789;
		a[1][1] = 49;
		a[1][2] = 451;
		a[2][0] = 890;
		a[2][1] = 60;
		a[2][2] = 562;
		
		b[0][0] = 53;
		b[0][1] = 12;
		b[0][2] = 5;
		b[1][0] = 78;
		b[1][1] = 46;
		b[1][2] = 123;
		b[2][0] = 777;
		b[2][1] = 6;
		b[2][2] = 512;
		
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
		
		System.out.print("\n");
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+(a[i][j]-b[i][j]));
			System.out.print("\n");
		}
	}
}