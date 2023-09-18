public class alphabetDigitSpecialcharacter
{
	public static void main(String args[])
	{
		char a = '2';
		char b = '&';
		char c = 'g';
		
		if(a>='a' && a<='z')
		System.out.println("a is alphabet");
		
		else if (a>='0' && a<='9')
		System.out.println("a is digit");
		
		else
		System.out.println("a is special character");

		if(b>='a' && b<='z')
		System.out.println("b is alphabet");
		
		else if (b>='0' && b<='9')
		System.out.println("b is digit");
		
		else
		System.out.println("b is special character");

		if(c>='a' && c<='z')
		System.out.println("c is alphabet");
		
		else if (c>='0' && c<='9')
		System.out.println("c is digit");
		
		else
		System.out.println("c is special character");
	}
}