/**
 * Program to display the color of traffic light using case - switch statement
 * if code (R/r) - red
 * if code (O/o) - orange
 * if code (G/g) - green
 * otherwise - invalid color
 *
 * @author Udayan Khattry
 */

public class _03Example {
    public static void main(String[] args) {
        String colorCode = "g";

        // it is important to put breaks after the cases because it allows the program to exit out of that case.. if you do not add it... it will execute that block perfectly fine (if it is true)... but then it will execute the blocks after that statement until it finds a "break"
        switch(colorCode) {
            default:
                System.out.println("Not a valid color");
                break;
            case "R":
                System.out.println("Traffic color is RED");
                break;
            case "r":
                System.out.println("Traffic color is RED");
                break;
            case "O":
                System.out.println(" Traffic color is ORANGE");
                break;
            case "o":
                System.out.println(" Traffic color is ORANGE");
                break;
            case "G":
                System.out.println("Traffic color is GREEN");
                break;
            case "g":
                System.out.println("Traffic color is green");
                break;
        }
    }
}
