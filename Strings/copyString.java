import java.lang.String;

class copyString
{
	public static void main(String args[])
	{
		String firstString = "Akshit";
		String copyString = new StringBuffer(firstString).toString();
		
		System.out.println("The given string is  "+firstString);
		System.out.println("The copied string is "+copyString);
	}
}