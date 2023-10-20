class findLastWordOccurrence {
	public static void main(String args[]) {
		String a = "name is Akshit BansalMy My My sister is Anshita";
		String find = "My";
		String word[] = a.split(" ");

		int index = -1;

		for (int i = word.length - 1; i >= 0; i--) {
			if (word[i].equals(find)) {
				index = i;
				break;
			}
		}

		if (index == -1)
			System.out.println("Word not present in the string");

		else
			System.out.println("Word found at index " + index + " from last");
	}
}