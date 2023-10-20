class trimTrailingWhiteSpaces {
    public static void main(String[] args) {
        String a = "Java is programming language        ";
        System.out.println("The given string is " + a);

        String b = a.stripTrailing();
        System.out.println("The new string after removing trailing white spaces is " + b);
    }
}