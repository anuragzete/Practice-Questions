package Strings;

/*
* Given a string, return a new string where "not " has been added to the front.
* However, if the string already begins with "not", return the string unchanged.
* input =
* "candy"
* "not candy"
* output =
* "not candy"
* "not candy"
* */

public class NotString {
    public static void main(String[] args) {
        String str = "not candy";
        if (str.length()>=3 && str.substring(0,3).equals("not")){
            System.out.println(str);
        }else {
            System.out.println("not "+str);
        }
    }
}
