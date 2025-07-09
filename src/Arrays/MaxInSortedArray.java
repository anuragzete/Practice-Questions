package Arrays;

/*
* Given an array in such a way that the elements stored in increasing order initially and
* then after reaching to a peak element, elements stored are in decreasing order.
* Find the highest element in the array.
* Input = 1 2 3 4 5 6 5 4 3 2 1
* Output = 6
* */

public class MaxInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        int max = arr[0];

        for (int num: arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
