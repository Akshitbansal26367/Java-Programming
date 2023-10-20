class toCheckFirstOccurence {
	public static void main(String args[]) {
		String a = "Hello everyone";
		String b = "o";

		int length1 = a.length();
		int i, flag = 0;

		for (i = 0; i < length1; i++) {
			char ch1 = a.charAt(i);
			char ch2 = b.charAt(0);

			if (ch1 == ch2) {
				flag = 1;
				break;
			}
		}

		if (flag == 0)
			System.out.println("Character not found");

		else
			System.out.println("Character found at index " + i);
	}
}