package patterns;

/*
* Print the following pattern for the given n number of rows
* input = 5
* output =
* *****
* ****
* ***
* **
* *
* */

public class LeftSkewedStarTriangle {
    public static void main(String[] args) {
        byte num = 5;

        for (byte i = 0; i < num; i++) {
            for (byte j = 0; j < num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
