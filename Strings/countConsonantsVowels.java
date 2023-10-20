class countConsonantsVowels
{
	public static void main(String args[])
	{
		String a = "AkshitBansal";
		int i, count_consonants=0,count_vowels=0;
		int length = a.length();
		
		for(i = 0; i<length; i++)
		{
			char ch = a.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				count_vowels = count_vowels+1;
			
			else
				count_consonants = count_consonants+1;
		}
		
		System.out.println("The number of vowels are "+count_vowels);
		System.out.println("The number of consonants are "+count_consonants);
	}
}