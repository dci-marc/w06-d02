public class Task1 {
    private static final String TESTS_MESSAGE = "Test failed";

    /**
     * Write a program that counts the number of vowels in a given string.
     */
    public static void main(String[] args) {
        if (countVowels("Your Digital Career Starts Here") != 11) {
            System.out.println(TESTS_MESSAGE);
        }

        if (countVowels("The quick brown fox jumps over the lazy dog") != 11) {
            System.out.println(TESTS_MESSAGE);
        }

        if (countVowels("Lorem ipsum dolor sit amet, consetetur sadipscing elitr") != 18) {
            System.out.println(TESTS_MESSAGE);
        }
    }

    /**
     * Returns the number of vowels in the given string.
     */
    public static int countVowels(String str) {
        int vowels = 0;
        // Convert the string to a character array
        char[] chars = str.toCharArray();

        for (char c : chars) {
            // Check if the character is a vowel
            switch (c) { // NOSONAR
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    vowels++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Number of vowels in the string '" + str + "': " + vowels);

        return vowels;
    }
}
