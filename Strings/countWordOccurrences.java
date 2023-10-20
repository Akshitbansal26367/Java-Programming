import java.util.Scanner;

public class countWordOccurrences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			int count = 1;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "";
				}
			}

			if (!words[i].equals("")) {
				System.out.println(words[i] + " : " + count);
			}
		}
		sc.close();
	}
}