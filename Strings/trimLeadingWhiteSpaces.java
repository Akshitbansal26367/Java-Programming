class trimLeadingWhiteSpaces {
    public static void main(String[] args) {
        String a = "       Java is programming language";
        System.out.println("The given string is " + a);

        String b = a.stripLeading();
        System.out.println("The new string after removing leading characters is " + b);
    }
}