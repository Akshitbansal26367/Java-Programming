class findFirstWordOccurrence {
	public static void main(String args[]) {
		String a = "name is Akshit Bansal My My sister is Anshita";
		String find = "My";

		// split the string by spaces
		String words[] = a.split(" ");

		int index = -1;

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(find)) {
				index = i;
				break;
			}
		}

		if (index == -1)
			System.out.println("Word not present in the string");

		else
			System.out.println("Word present at index " + index);
	}
}