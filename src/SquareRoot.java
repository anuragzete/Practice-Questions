/*

class toCheckWhetherGivenNumberIsPerfectSquareOrNot {
    public static void main(String[] args) {
        int n = 48;
        int i = 1;
        boolean isSquare = false;

        for (; n >= 0; n -=i, i+=2) {
            isSquare = (n == 0);
        }

        System.out.println(isSquare?"square":"not square");
    }

    class innerClass{
        public static void main(String[] args) {
            System.out.println("hello");
        }
    }
}
*/

final class test{
    public test(){
        System.out.println("hehehe");
    }
}

class test2{
    private test2(){
        System.out.println("hohoho");
    }
}

class test3{
    test3(){
        new test();
    }

    public static void main(String[] args) {
        new test3();
    }
}
