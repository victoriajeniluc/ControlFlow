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
        String colorCode = "p";

        switch(colorCode) {
            default:
                System.out.println("Not a valid color");
                break;
            case "R":
                System.out.println("RED");
                break;
            case "r":
                System.out.println("RED");
                break;
            case "O":
                System.out.println("ORANGE");
                break;
            case "o":
                System.out.println("ORANGE");
                break;
            case "G":
                System.out.println("GREEN");
                break;
            case "g":
                System.out.println("green");
                break;
        }
    }
}
