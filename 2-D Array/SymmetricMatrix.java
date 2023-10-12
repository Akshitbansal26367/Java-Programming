class SymmetricMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 6;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 5;
		a[2][0] = 6;
		a[2][1] = 5;
		a[2][2] = 9;
		
		int i,j,flag = 1;
		
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
				if(a[i][j]!=a[j][i])     
				{
					flag = 0;
					break;
				}
			}
		}
		
		if(flag==1)
			System.out.print("SYMMETRIC MATRIX");
		
		else
			System.out.print("Not a SYMMETRIC MATRIX");
	}
}