public class removeLastWordOccurrences {
    public static void main(String[] args) {
        String a = "Hello my my my name is akshit";
        String remove = "my";

        int lastIndex = a.lastIndexOf(remove);

        if (lastIndex != 1)
            a = a.substring(0, lastIndex) + a.substring(lastIndex + remove.length());

        System.out.println(a);

    }
}