package patterns;

/*
* Print the following pattern for the given number of rows
* input = 5
* output =
* 11111
* 0000
* 111
* 00
* 1
* */

public class LeftSkewedBinaryTriangle {
    public static void main(String[] args) {
        byte num = 5;

        outerLoop:
        for (byte i = 0; i < num; i++) {
            innerLoop:
            for (byte j = 0; j < num-i; j++) {
                if (i % 2 == 1){
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
