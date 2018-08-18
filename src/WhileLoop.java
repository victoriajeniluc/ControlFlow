/**
 * Create a program that will print out Hello 10 times on the console without using any looping
 * @author Udayan Khattry
 */

// public class WhileLoop {
   // public static void main(String[] args) {
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");
       // System.out.println("hello");

 //   }
//}

/**
 * Create a program that will print hello 10 using a while loop
 */

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;

        // same as:
        //
        // int counter = 0;
        // while(counter < 100) {
        //   System.out.println("hello");
        //   counter ++;
        // }

        // since the boolean expression consists of two operators... you would solve it based on the order of procedence...
        // group them: while((counter++) < 100)
        // it will use 1 first since the it is a post incrementor.. evaluate if 1 is less than 100.. if true then keep running the loop until it reaches 100. 
        while(counter++ < 100) {
            System.out.println("hello");
        }
    }
}