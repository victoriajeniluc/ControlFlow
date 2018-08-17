/**
 * Class to explain if - else statement
 * @author Udayan Khattry
 */
public class IfElseExample {
    public static void main(String[] args) {

        // 1 - 11 represent morning
        // 12 - 23 represent evening
        byte time = 15;


        // the else statement must come after the } because it will throw an error if it doesn't. though, you can have as many comments if you want in the if / else statement since the compiler doesn't read the comments 
        if (time < 12) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Evening");
        }
    }
}
