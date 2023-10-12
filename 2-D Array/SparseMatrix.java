class SparseMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		a[0][0] = 0;
		a[0][1] = 0;
		a[0][2] = 9;
		a[1][0] = 8;
		a[1][1] = 0;
		a[1][2] = 0;
		a[2][0] = 0;
		a[2][1] = 2;
		a[2][2] = 0;
		
		int i,j,count = 0;
		
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
				if(a[i][j]==0)
					count++;
			}
		}
		
		if(count>=5)
			System.out.print("SPARSE MATRIX");
		
		else
			System.out.print("Not a SPARSE MATRIX");
	}
}