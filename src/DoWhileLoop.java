/**
 * Create an example for a do-while loop
 * @author Udayan Khattry
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int ctr = 0;
        do {
            System.out.println("Hello");
        } while(++ctr < 2);


        /**
         * this is an example of an infinite loop (using a boolean literal true) since it will print the first statement then it will check the boolean expression.. which is true so it will keep runing
         *
         * do {
         *    System.out.println("Hello");
         *  } while(true);
         */


        /**
         * this is an example of a boolean literal false that is being used... it will print out hello the first time then check the boolean expression afterwards... if it is false.. the program will stop
         *
         * do {
         *    System.out.println("Hello");
         *  } while(true);
         */
    }
}