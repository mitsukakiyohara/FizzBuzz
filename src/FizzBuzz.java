/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    // Creating methods: public/private static (output type) method_name(argument type)
    // Main method must be defined for program to run
    public static void main(String[] args) {
        // for loops/if statements: always use parentheses
        // define variable type
        int i = 0;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        // finish every line with semicolons
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        // Print statements: System.out.println()
        // ln for new line
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i += 1;
        return i;
    }
}
