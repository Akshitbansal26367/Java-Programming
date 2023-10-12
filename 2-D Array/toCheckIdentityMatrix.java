class toCheckIdentityMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		int i,j,flag=1;
		
		a[0][0] = 1;             
		a[0][1] = 0;
		a[0][2] = 0;
		a[1][0] = 0;
		a[1][1] = 1;
		a[1][2] = 0;
		a[2][0] = 0;
		a[2][1] = 0;
		a[2][2] = 1;
		
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
			{
				if((i==j && a[i][j]!=1) || (i!=j && a[i][j]!=0)) 
				{
					flag = 0;
					break;
				}
			}
		}
		
		if(flag==1)
			System.out.println("IDENTITY MATRIX");
		
		else
			System.out.println("Not a IDENTITY MATRIX");
	}
}