package patterns;

/*
* Print the following pattern for the given number of rows
* input = 5
* output =
*     1
*    232
*   34543
*  4567654
* 567898765
* */

public class NumberPyramid {
    public static void main(String[] args) {
        int num = 5;
        boolean isIncreasing = true;

        outerLoop:
        for (int i = 0; i < num; i++) {
            int count = i;
            innerLoop:
            for (int j = 0; j < num+i; j++) {
                if (j < num-(i+1)){
                    System.out.print(" ");
                } else if (count < (i*2)+1 && isIncreasing) {
                    System.out.print(++count);
                }
                else {
                    System.out.print(--count);
                    isIncreasing = false;
                }
            }
            isIncreasing = true;
            System.out.println();
        }
    }
}
