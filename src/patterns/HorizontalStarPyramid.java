package patterns;

/*
* Print the following pattern for the given N number of rows
* input = 5
* output =
* *
* **
* ***
* **
* *
*
* */

public class HorizontalStarPyramid {
    public static void main(String[] args) {
        byte num = 5;

        for (byte i = 0; i < num; i++) {
            if (i < (num+1) >> 1){
                for (byte j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }else {
                // here int is used because num-i results in int output even if both num and i are byte
                // another solution will be typecasting the resultant to byte
                // for (byte j = (byte) (num-i); j > 0; j--) {
                for (int j = (num-i); j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
