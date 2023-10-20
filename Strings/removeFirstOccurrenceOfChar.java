class removeFirstOccurrenceOfChar {
	public static void main(String args[]) {
		String a = "Hello Evveryone";
		char remove = 'o';
		int index = a.indexOf(remove); // returns the first occurrence of given character//

		if (index == -1)
			System.out.println("The given character is not present in the string");

		else {
			String c = a.substring(0, index) + a.substring(index + 1);
			System.out.println("The new string is " + c);
		}
	}
}