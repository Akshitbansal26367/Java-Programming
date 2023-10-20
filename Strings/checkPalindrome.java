class checkPalindrome {
	public static void main(String[] args) {
		String a = "1111";
		String rev = "";
		int i;
		int length = a.length();

		for (i = length - 1; i >= 0; i--)
			rev = rev + a.charAt(i);

		if ((a).compareTo(rev) == 0)
			System.out.println("PALINDROME STRING");

		else
			System.out.println("Not a Palindrome String");
	}
}