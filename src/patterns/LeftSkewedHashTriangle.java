package patterns;

/*
* Print the following pattern.
* Input = 5
* Output =
*     #
*    ##
*   ###
*  ####
* #####
* */

public class LeftSkewedHashTriangle {
    public static void main(String[] args) {
        byte n = 5;

        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                if (j <= n-i-2){
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
