class toCountOccurrenceOfEachCharacter {
	public static void main(String args[]) {
		String test = "HelloWorld";
		String temp = "";
		int i, j, count;

		for (i = 0; i < test.length(); i++) {
			if (temp.indexOf(test.charAt(i)) == -1)
				temp = temp + test.charAt(i);
		}

		for (i = 0; i < temp.length(); i++) {
			count = 0;
			for (j = 0; j < test.length(); j++) {
				if (temp.charAt(i) == test.charAt(j))
					count = count + 1;
			}

			System.out.println("The occurrence of character " + temp.charAt(i) + " is " + count + " times ");
		}
	}
}