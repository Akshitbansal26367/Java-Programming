class replaceFirstOccurrenceOfCharacter {
	public static void main(String args[]) {
		String a = "Hello Everyone";
		String removed = "e";
		String replaced = "i";

		String new1 = a.replaceFirst(removed, replaced);

		System.out.println("The original string is " + a);
		System.out.println("The new string is -->  " + new1);
	}
}