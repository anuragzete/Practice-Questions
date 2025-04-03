package Strings;

/*
* Given a string, return a new string where the first and last chars have been exchanged.
* Input = "code"
* output = "eodc"
* */

public class FrontBack {
    public static void main(String[] args) {
        String str = "code";

        if(str.length()<=1){
            System.out.println(str);
        }
        String middle="";
        String firstChar = str.substring(0,1);
        if(str.length()>=3){
            middle = str.substring(1,str.length()-1);
        }
        String lastChar = str.substring(str.length()-1);
        System.out.println(lastChar+middle+firstChar);
    }
}
