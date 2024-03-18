import java.util.Arrays;

public class SortStringAlphabetically{

    public static void main(String[] args) {
        String a = "qwertyuiopasdfghjklzxcvbnm";
        sortStringAlphabetically(a);
    }

    public static void sortStringAlphabetically(String a) {
        char[] ab = a.toCharArray();
        Arrays.sort(ab);
        String sortedString = new String(ab);
        System.out.println("Sorted string: " + sortedString);
    }
}