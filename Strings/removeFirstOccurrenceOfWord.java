class removeFirstOccurrenceOfWord {
    public static void main(String[] args) {
        String a = "Name is Akshit Bansal My My My sister is Anshita";
        String remove = "My";
		String newString = a.replaceFirst(remove,"");
		System.out.println("The new string is : "+newString);
    }
}