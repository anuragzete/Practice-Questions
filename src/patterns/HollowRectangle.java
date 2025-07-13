package patterns;
/*
* Print the following pattern.
* Input - 4
* Output -
*  *  *  *  *  *
*  *           *
*  *           *
*  *  *  *  *  *
*
* */

public class HollowRectangle {
    public static void main(String[] args) {
        byte n = 4;

        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
