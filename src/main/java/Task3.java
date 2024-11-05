public class Task3 {
    /**
     * A prime number is a number that is greater than 1 and is only divisible by 1 and itself.
     * Write a program that prints all prime numbers between 1 and 100.
     */
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    /**
     * Returns true if the given number is a prime number, otherwise false.
     */
    public static boolean isPrime(int number) {
        // A prime number is a number that is greater than 1
        if (number <= 1) {
            return false;
        }

        // A prime number is only divisible by 1 and itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by any number other than 1 and itself, it is not a prime number
            if (number % i == 0) {
                return false;
            }
        }

        // If the number is not divisible by any number other than 1 and itself, it is a prime number
        return true;
    }
}
