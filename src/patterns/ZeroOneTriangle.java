package patterns;

/*
*  Print the following pattern.
*  Input - 5
*  Output -
*  1
*  01
*  101
*  0101
*  10101
*/

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
