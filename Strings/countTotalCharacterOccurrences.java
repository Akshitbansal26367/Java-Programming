class countTotalCharacterOccurrences {
	public static void main(String args[]) {
		String a = "Hello Evveryone";
		String b = "e";
		int length = a.length();
		int i, count = 0;

		for (i = 0; i < length; i++) {
			char ch1 = a.charAt(i);
			char ch2 = b.charAt(0);

			if (ch1 == ch2)
				count++;
		}

		System.out.println("The repetition of given character " + b + " is " + count + " times");
	}
}