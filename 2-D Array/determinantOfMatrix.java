class determinantOfMatrix
{
	public static void main(String[] args)
	{
		int[][] a = new int [3][3];
		a[0][0] = 12;
		a[0][1] = 5;
		a[0][2] = 9;
		a[1][0] = 8;
		a[1][1] = 8;
		a[1][2] = 6;
		a[2][0] = 3;
		a[2][1] = 5;
		a[2][2] = 9;
		
		int i,j,determinant;
		
		for(i = 0; i<3; i++)
		{
			for(j = 0; j<3; j++)
				System.out.print("\t\t\t"+a[i][j]);
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		determinant = (a[0][0])*((a[1][1]*a[2][2]) - (a[1][2]*a[2][1])) - (a[0][1])*((a[1][0]*a[2][2]) - (a[1][2]*a[2][0]))+ (a[0][2])*((a[1][0]*a[2][1])-(a[1][1]*a[2][0]));
		
		System.out.print("The determinant is "+determinant);
	}
}