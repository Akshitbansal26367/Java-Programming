import java.lang.String;

class compareStrings {
	public static void main(String args[]) {
		String a = "Sachin";
		String b = "Sachin";
		String c = "Ratan";

		System.out.println(a.compareTo(b)); // returns 0 since two strings are equal
		System.out.println(a.compareTo(c)); // 1 since (a>c)
		System.out.println(c.compareTo(a)); // -1 since (a>c)
	}
}