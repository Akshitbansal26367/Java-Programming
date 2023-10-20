class replaceAllOccurrenceOfCharacter {
	public static void main(String args[]) {
		String a = "Hello everyone";
		String remove = "e";
		String replaced = "a";

		String new1 = a.replace(remove, replaced);
		System.out.println("The new string is " + new1);
	}
}