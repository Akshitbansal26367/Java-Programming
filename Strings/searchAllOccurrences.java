class searchAllOccurrences {
	public static void main(String args[]) {
		String a = "Hello Evveyone";
		String b = "e";
		int length = a.length();
		int i;

		System.out.print("The occurrences of the character is at position --> ");
		System.out.print("\t");

		for (i = 0; i < length; i++) {
			int ch1 = a.charAt(i);
			int ch2 = b.charAt(0);

			if (ch1 == ch2)
				System.out.print(i + "\t");
		}
	}
}