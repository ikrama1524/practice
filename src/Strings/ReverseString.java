package Strings;

public class ReverseString {


    public static void main(String args[]) {
        String NAME = "Dream big";
        String reversedStr = "";

        for(int i = NAME.length()-1; i >= 0; i--){
            reversedStr = reversedStr + NAME.charAt(i);
        }
        System.out.println("Original string: " + NAME);
        System.out.println("Reverse of given string: " + reversedStr);
    }

}
