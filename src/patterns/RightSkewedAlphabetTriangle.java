package patterns;

/*
* Print the following pattern for the given N number of rows
* input = 5
* output =
* A
* BB
* CCC
* DDDD
* EEEEE
* */

public class RightSkewedAlphabetTriangle {
    public static void main(String[] args) {
        byte num = 5;

        char ch = 'A';
        for (byte i = 0; i < num; i++) {
            for (byte j = 0; j < i+1; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
