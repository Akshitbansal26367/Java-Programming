public class validTriangleUsingSides
{
	public static void main(String args[])
	{
		int a = 4, b = 7, c = 10;
		
		if(a+b>c && b+c>a && c+a>b)
		System.out.println("Valid Triangle");
		
		else
		System.out.println("Invalid Triangle");
	}
}