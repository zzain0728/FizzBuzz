/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int test = 9;
        int test2 = 4;
        int test3 = 3;
        int test4 = 4;
        int test5 = 6;
        int test56 = 111;
        int test1111 = 2;


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
        itn za1 = 3;

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

    public static void doFizzBuzz(int i) {
    }
}
