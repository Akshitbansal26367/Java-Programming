class toggleCharacter
{
	public static void main(String args[])
	{
		String a = "AksHit";
		int length = a.length();
		String b = "";
		int i;
		
		for(i = 0; i<length; i++)
		{
			char ch = a.charAt(i);
			if((ch>=65) && (ch<=90))
				ch = (char)(ch+32); 
			
			else
			{
				if((ch>=97) && (ch<=122))
					ch = (char)(ch-32);
			}
			
			b = b+ch;
		}
		System.out.println("The toggle string is "+b);
	}
}		