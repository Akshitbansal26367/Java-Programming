class toPrintUniqueCharacters
{
	public static void main(String args[])
	{
		String test = "Hellooo World";
		String temp = "";
		int i;
		
		for(i = 0; i<test.length(); i++)
		{
			if(temp.indexOf(test.charAt(i)) == -1)
				temp = temp + test.charAt(i);
		}
		
		System.out.println(temp + " ");
	}
}	