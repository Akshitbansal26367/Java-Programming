class highestAndLowestFrequencyCharacter {
	public static void main(String args[]) {
		String str = "Hello Evveryone";
		int i, j, max, min;
		int freq[] = new int[str.length()];
		char minChar = str.charAt(0);
		char maxChar = str.charAt(0);

		// converts given string into character array.
		char string[] = str.toCharArray();

		// count each character in string and store in array freq
		for (i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i] = freq[i] + 1;

					// set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}

		// determine maximum and minimum occuring characters
		min = max = freq[0];

		// if min is greater than frequency of a character
		// then store frequency in min and corresponding character in minChar
		for (i = 0; i < freq.length; i++) {
			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = string[i];
			}

			// if max is less than frequency of a character
			// then store frequency in max and corresponding character in maxChar
			if (max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}

		System.out.println("Minimum occurring character " + minChar);
		System.out.println("Maximum occurring character " + maxChar);
	}
}