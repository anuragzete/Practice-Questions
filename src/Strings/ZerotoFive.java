package Strings;

/*
* You are given an integer n, you need to convert all zeros off n to 5.
* Input = 1004
* Output = 1554
* */

public class ZerotoFive {
    public static void main(String[] args) {
        int n = 1004;

        String str = String.valueOf(n).replace('0','5');
        int newNum = Integer.parseInt(str);

        System.out.println(newNum);
    }
}
