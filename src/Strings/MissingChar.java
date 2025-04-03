package Strings;

/*
* Given a non-empty string and an int n, return a new string where the char at index n has been removed.
* The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
* input =
* "kitten", 1
* "kitten", 0
* output =
* "ktten"
* "itten"
 * */

public class MissingChar {
    public static void main(String[] args) {
        String str = "kitten";
        int n = 1;
        String firstHalf = str.substring(0,n);
        String secondHalf = str.substring(n+1);
        System.out.println(firstHalf + secondHalf);
    }
}
