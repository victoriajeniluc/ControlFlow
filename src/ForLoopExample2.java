/**
 * Create an example of for loop with any java statement
 * @author Udayan Khattry
 */
public class ForLoopExample2 {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i+=1){
            System.out.println("i = " + i);
        }

        System.out.println("-------------");
        // if you took out the step_expr... will it still be able to be ran if you moved it to the system.out.println?
        // yes because the incrementor is still being used within the loop
        for(int i = 0; i < 2;){
            System.out.println("i = " + i++);
        }

        System.out.println("-------------");
        // if you were not allowed to write anything in between the curly braces of the for loop... can you get the same output by writing it in between the ()?
        // yes because the incrementor is still being used within the loop
        for(int i = 0; i < 2; System.out.println("i = " + i++)) {
        }
    }
}
