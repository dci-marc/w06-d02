public class Task4 {
    /**
     * Main method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (!repeat("number", 3).equals("number1 number2 number3")) {
            System.out.println("Test failed");
        }

        if (!repeat("article", 5).equals("article1 article2 article3 article4 article5")) {
            System.out.println("Test failed");
        }
    }

    /**
     * Concatenates a string n times with a space between each string
     *
     * @param str The string to concatenate
     * @param n The number of times to concatenate the string
     * @return The concatenated string
     */
    public static String repeat(String str, int n) {
        StringBuilder stringConcat = new StringBuilder();

        // Concatenate the string n times
        for (int i = 1; i <= n; i++) {
            // Append the string and a space
            stringConcat.append(str).append(i).append(" ");
        }

        System.out.println(stringConcat.toString().trim());

        // Return the concatenated string without the trailing space
        return stringConcat.toString().trim();
    }
}
