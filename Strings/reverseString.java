class reverseString
{
	public static void main(String args[])
	{
		String a = "AkshitBansal";
		int length = a.length();
		int i;
		String rev = "";
		
		for(i = length-1; i>=0; i--)
			rev = rev+a.charAt(i);
		
		System.out.print("The reversed string is "+rev);
	}
}