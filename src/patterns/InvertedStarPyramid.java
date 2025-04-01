package patterns;

/*
* Print the following pattern for the given N number of rows
* input = 5
* output =
* * * * * *
*  * * * *
*   * * *
*    * *
*     *
* */

public class InvertedStarPyramid {
    public static void main(String[] args) {
        byte num = 5;

        for (byte i = 0; i < num; i++) {
            for (byte j = 0; j < num; j++) {
                if (j < i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
