package Strings;

/*
* Given a string, if the string "del" appears starting at index 1,
* return a string where that "del" has been deleted. Otherwise,
* return the string unchanged.
* Input = adelhello;
* Output = ahello
* */

public class Deldel {
    public static void main(String[] args) {
        String str = "adelhello";
        String result = (str.length() >= 4 && str.substring(1, 4).equals("del")) ? str.charAt(0) + str.substring(4) : str;

        System.out.println(result);
    }
}
