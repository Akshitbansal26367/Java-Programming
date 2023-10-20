class lastCharacterOccurrence {
	public static void main(String args[]) {
		String a = "Hello everyone";
		String b = "o";
		int length = a.length();
		int i, flag = 0;

		for (i = length - 1; i >= 0; i--) {
			int ch1 = a.charAt(i);
			int ch2 = b.charAt(0);

			if (ch1 == ch2) {
				flag = 1;
				break;
			}
		}

		if (flag == 0)
			System.out.println("Element not found");

		else
			System.out.println("Element found at index " + i);
	}
}