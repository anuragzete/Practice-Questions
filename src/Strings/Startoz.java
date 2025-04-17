package Strings;

/*
* Given a string, return a string made of the first 2 chars (if present),
* however include first char only if it is 'o' and include the second only if it is 'z',
* so "ozymandias" yields "oz".
* Input = "ozymandias"
* Output = "oz"
* */

public class Startoz {
    public static void main(String[] args) {
        String str = "ozymandias";
        String result = "";

        if (!str.isEmpty() && str.charAt(0) == 'o') result += "o";
        if (str.length() >=2 && str.charAt(1) == 'z') result += "z";

        System.out.println(result);
    }
}
