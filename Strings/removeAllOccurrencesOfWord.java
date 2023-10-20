public class removeAllOccurrencesOfWord {
    public static void main(String[] args) {
        String a = "Hello Hello Hello Hello My name is Akshit Bansal";
        String b = "Hello";
        String newString = a.replaceAll(b, "");
        System.out.println("The new String after removing the word " + " b " + " from the string is " + newString);
    }
}