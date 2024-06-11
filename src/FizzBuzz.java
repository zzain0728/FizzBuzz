/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int test = 9;
        int test2 = 4;
        int test3 = 3;
        int test4 = 4;


        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            dofizzbuzz(i);
        }
    }

    private static void dofizzbuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 10 == 0;
        int zai = 17;
        int y1 = 1000;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
