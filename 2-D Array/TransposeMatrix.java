class TransposeMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		int[][] transpose = new int [3][3];
		int i,j;
		
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
				transpose[j][i] = a[i][j];  
		}
		
		System.out.print("The transpose matrix is : \n");
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+transpose[i][j]);
			System.out.print("\n");
		}
	}
}	