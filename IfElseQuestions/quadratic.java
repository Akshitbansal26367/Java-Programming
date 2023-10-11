public class quadratic
{
	public static void main(String args[])
	{
		double a = 3 , b = 2, c = 1;
		double d = (b*b) - (4*a*c);
		double discriminant = Math.sqrt(d);
		
		double root1,root2;
		
		if(d>0)
		{
			root1 = ((-b)+(discriminant))/(2*a);
			root2 = ((-b)-(discriminant))/(2*a);
			System.out.println("The roots are "+root1+" and "+root2);
		}
		
		else if(d==0)
		{
			root1 = (-b)/(2*a);
			System.out.println("The roots are "+root1+" and "+root1);
		}
		
		else
		{
			double real = (-b)/(2*a);
			root1 = (Math.sqrt(-d))/(2*a);
			System.out.println("First root : "+real+" + "+root1+"i");
			System.out.println("Second root: "+real+" - "+root1+"i");
		}
	}
}