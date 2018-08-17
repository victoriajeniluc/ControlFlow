/**
 * Class to explain if - else if - else statement
 * @author Udayan Khattry
 */
public class IfElseIfElseExample {
    public static void main(String[] args) {

        // 1 - 11 represent morning
        // 12 - 23 represent evening
        byte time = 1;

        // 1. if hour is less than 12 noon, greet good morning.
        if(time < 12) {
            System.out.println("Good Morning");
        // 2. if hour is greater than or equal to 12 noon but less than 15 (3pm), greet good afternoon
        } else if(time >= 12 && time < 15) {
            System.out.println("Good Afternoon");
        // 3. if hour is greater than or equal to 15, greet with good evening
        // you can just do the else if(time >=15){}.... but it's too much when you know the conditions going to be else since all the other conditions are false or not executed
        } else {
            System.out.println("Good Evening");
        }
    }
}