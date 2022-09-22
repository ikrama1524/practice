import java.util.Arrays;

public class Anagram {

    public static void main (String[]args)
    {
        String x = "hE is liSTEn";  //input 1
        String y = "is he SILent"; //input 2

        x = x.replace (" ", "");  // removing spaces
        y = y.replace (" ", "");

        x = x.toLowerCase();  // converting to a specific Case(upeercase/lowercase)
        y = y.toLowerCase();

        char a [] = x.toCharArray(); // putting input in Arrays
        char b [] = y.toCharArray();


        Arrays.sort(a); // putting Arrays in alphabatic order
        Arrays.sort(b);

        boolean result=Arrays.equals(a,b); //comparing two Arrays

        if(result==true){

            System.out.println("Strings are Anagram");   //condition
        }
        else{
            System.out.println("Strings are not Anagram");
        }

    }
}
