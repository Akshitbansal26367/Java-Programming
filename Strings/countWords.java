class countWords {
	public static void main(String args[]) {
		String a = "My name is Akshit";
		int length = a.length();
		int i, count = 1;

		for (i = 0; i < length; i++) {
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
				count++;
		}

		System.out.println("The total words in the string are " + count);
	}
}