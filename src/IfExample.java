/**
 * Class to explain if statement
 * @author Udayan Khattry
 */
public class IfExample {
    public static void main(String[] args) {
        int score = 90;

            // this is an example of one statement needs to be ran if it is true
            // won't print if the result is false
            // same as:
            // if (score > 80) {
            //    System.out.println("Excellet!");
            // }
        //if (score > 80)
            //System.out.println("Excellent!"); .. this is commented out so I can run the next example with two statements in the if statement


            // if there is no curly braces around the two statements... java will run the first one as part of the if statement and the other one as a separate entity. this will also go for the same thing as putting two of the statements on the same line... as long as there is a  semicolon... the second statement will be ran as a separate entity! it will not give a compilation error for both!
        if (score > 80){
            System.out.println("Excellent!");
            System.out.println("You passed with an A");
        }
    }
}
