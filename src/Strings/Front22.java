package Strings;

public class Front22 {
    public static void main(String[] args) {
        String str = "abc";
        String firstChars;
        if (str.length() < 2) {
            firstChars = str.substring(0);
        } else {
            firstChars = str.substring(0, 2);
        }
        System.out.println(firstChars + str + firstChars);
    }
}
