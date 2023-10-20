public class trimLeadingAndTrailingWhiteCharacters {
    public static void main(String[] args) {
        String s = "     Hello, World     ";
        System.out.println("The given string is " + s);

        String trimmedString = s.trim();
        System.out.println("The string after trimming is " + trimmedString);
    }
}