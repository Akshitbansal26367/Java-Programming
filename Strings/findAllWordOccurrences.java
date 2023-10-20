class findAllWordOccurrences {
	public static void main(String args[]) {
		String a = "name is Akshit BansalMy My My sister is Anshita My";
		String find = "My";
		String word[] = a.split(" ");
		int index;

		for (int i = 0; i < word.length; i++) {
			if (word[i].equals(find)) {
				index = i;
				System.out.println("Word occurred at index " + index);
			}
		}
	}
}