public class WhileLoop2 {
    public static void main(String[] args) {
        boolean flag = false;

        while (flag) {
            System.out.println("WELCOME");
        }

        /**
         *  the example before this one will be ran with boolean flag because the compiler doesn't know the value of the flag... only it will be known on runtime compiler can only confirm that this expression will yield a boolean result
         *
         * the example below will not be ran because it is not excepted by the compiler
         *
         * we're using a literal false and literals are compile time constant so the compiler knows the statement right inside the block will never get executed as this boolean expression is always false
         *
         * while(false) {
         *    System.out.println("WELCOME");
             }
         */
    }
}