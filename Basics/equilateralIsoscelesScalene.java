public class equilateralIsoscelesScalene
{
	public static void main(String args[])
	{
		int a = 7, b = 7, c = 7;
		
		if(a==b && b==c && c==a)
		System.out.println("Equilateral triangle");
	
		else if(a==b || b==c || c==a)
		System.out.println("Isosceles triangle");

		else
		System.out.println("Scalene triangle");
	}
}