class replaceLastOccurrenceOfChar {
	public static void main(String args[]) {
		String a = "Helloe eveeryon";
		String remove = "e";
		String replace = "i";
		int index = a.lastIndexOf(remove);

		if (index == -1)
			System.out.println("character not present in the string");

		else {
			String new1 = a.substring(0, index) + replace + a.substring(index + 1);
			System.out.println("The new string is " + new1);
		}
	}
}