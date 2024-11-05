public class Task2 {
    /**
     * A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself.
     * For example, 6 is a perfect number because 6 = 1 + 2 + 3.
     * Write a program that prints all perfect numbers between 1 and 10000.
     */
    public static void main(String[] args) {
        for (int number = 1; number <= 10000; number++) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
            }
        }
    }

    /**
     * Returns true if the given number is a perfect number, otherwise false.
     */
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Find all divisors of the number and sum them up
        for (int i = 1; i <= number / 2; i++) {
            // If the number is a divisor, add it to the sum
            if (number % i == 0) {
                sum += i;
            }
        }

        // If the sum of all divisors is equal to the number, it is a perfect number
        return sum == number;
    }
}
