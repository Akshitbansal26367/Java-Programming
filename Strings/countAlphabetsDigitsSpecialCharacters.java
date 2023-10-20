class countAlphabetsDigitsSpecialCharacters
{
	public static void main(String args[])
	{
		String a = "Aks12001**&";
		int length = a.length();
		int count_alphabets = 0, count_digits = 0, count_SpecialCharacters=0;
		int i;
		
		for(i = 0; i<length; i++)
		{
			char ch = a.charAt(i);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
				count_alphabets = count_alphabets+1;
			
			else if(ch>='0' && ch<='9')
				count_digits = count_digits+1;
			
			else
				count_SpecialCharacters = count_SpecialCharacters+1;
		}
		
		System.out.println("The total alphabets are "+count_alphabets);
		System.out.println("The total digits are "+count_digits);
		System.out.println("The total special characters are "+count_SpecialCharacters);
	}
}