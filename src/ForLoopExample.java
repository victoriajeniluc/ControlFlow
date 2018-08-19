/**
 * Create an example of for loop
 * @author Udayan Khattry
 */
public class ForLoopExample {
    public static void main(String[] args) {
        // while loop printing hello 5 times
        // int counter = 0;
        // while(counter++ < 5) {
            // System.out.println("hello");
        // }

        // initialization with int counter = 0;
        // it is different than the example below because i wont be able to access counter at all since it is within the for loop block
    /*    for(int counter = 0; counter < 5; counter++) {
            System.out.println("hello");
        }*/

        // another way of initialization but with i = 0;
        // this allows us to be able to access the value of i when we need it
        int i;
        for(i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}
