class removeLastOccurrenceOfChar {
	public static void main(String args[]) {
		String a = "Hello Everyoneo";
		char remove = 'e';
		int index = a.lastIndexOf(remove); // removes the last occurrence of given character//

		if (index == -1)
			System.out.println("character not present in the given string");

		else {
			String c = a.substring(0, index) + a.substring(index + 1);
			System.out.println("The new string is " + c);
		}
	}
}