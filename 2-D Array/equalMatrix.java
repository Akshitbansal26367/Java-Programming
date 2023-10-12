class equalMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		int[][] b = new int [3][3];
		int i,j,flag=1;
		
		a[0][0] = 23;
		a[0][1] = 3;
		a[0][2] = 49;
		a[1][0] = 34;
		a[1][1] = 38;
		a[1][2] = 43;
		a[2][0] = 33;
		a[2][1] = 40;
		a[2][2] = 55;
		
		b[0][0] = 23;
		b[0][1] = 3;
		b[0][2] = 49;
		b[1][0] = 34;
		b[1][1] = 38;
		b[1][2] = 43;
		b[2][0] = 33;
		b[2][1] = 40;
		b[2][2] = 55;
		
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
				if((i==j) && (a[i][j] != b[i][j]))
					flag = 0;
			}
		}
		
		if(flag==1)
			System.out.print("Equal Matrix");
		
		else
			System.out.print("Not a Equal Matrix");
	}		
}