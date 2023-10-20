public class removeWhiteSpaces {
    public static void main(String[] args) {
        String str = "I    love    Java Programming";
        System.out.println("The String before removing white spaces is " + str);

        str = str.replaceAll("\\s", "");
        System.out.println("The new String after removing white spaces is " + str);
    }
}