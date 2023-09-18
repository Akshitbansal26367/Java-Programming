public class maxBetweenThreeNumbers
{
	public static void main(String args[])
	{
		int a = 45, b = 55, c = 66;
		
		if(a>b && a>c)
		System.out.println("a is maximum");
		
		else if (b>a && b>c)
		System.out.println("b is maximum");
		
		else
		System.out.println("c is maximum");
	}
}