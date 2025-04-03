package Strings;

/*
* Given a string, we'll say that the front is the first 3 chars of the string.
* If the string length is less than 3, the front is whatever is there.
* Return a new string which is 3 copies of the front.
* Input =
* "java"
* Output =
* "javjavajava"
 * */

public class FrontThree {
    public static void main(String[] args) {
        String str = "java";

        if(str.length() >=3){
            String front = str.substring(0,3);
            System.out.println(front+front+front);
        }else{
            System.out.println(str+str+str);
        }
    }
}
