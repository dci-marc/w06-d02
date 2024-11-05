### Overview of the Program

This Java program is designed to find and print all "perfect numbers" between 1 and 10,000.

**What is a perfect number?**
A perfect number is a positive integer that equals the sum of its divisors, excluding the number itself. For example:
- `6` is a perfect number because `6 = 1 + 2 + 3`.
- `28` is also a perfect number because `28 = 1 + 2 + 4 + 7 + 14`.

### Structure of the Code

The program is structured in a class called `Task2`. Inside this class, we have:
- A `main` method, which is the starting point of the program.
- A method called `isPerfectNumber`, which checks if a given number is a perfect number.

### 1. **The `main` Method**

```java
public static void main(String[] args) {
    for (int number = 1; number <= 10000; number++) {
        if (isPerfectNumber(number)) {
            System.out.println(number);
        }
    }
}
```

This is the `main` method, where the program starts running. Let’s break it down:

1. **Looping Through Numbers from 1 to 10,000**:
   ```java
   for (int number = 1; number <= 10000; number++) {
       ...
   }
   ```
   Here, the `for` loop goes through each number from `1` to `10,000`, checking if each one is a perfect number.

2. **Checking if a Number is Perfect**:
   ```java
   if (isPerfectNumber(number)) {
       System.out.println(number);
   }
   ```
   For each number in the loop, the program calls the `isPerfectNumber` method. This method returns `true` if the number is perfect. If `true`, the program prints the number to the console.

### 2. **The `isPerfectNumber` Method**

```java
public static boolean isPerfectNumber(int number) { ... }
```

This method checks if a given number is a perfect number and returns `true` if it is, otherwise `false`.

Let’s go through its code step-by-step:

1. **Initialize a Sum Variable**:
   ```java
   int sum = 0;
   ```
   This line sets up a variable called `sum` to store the sum of the divisors. Initially, `sum` is set to `0`.

2. **Finding the Divisors**:
   ```java
   for (int i = 1; i <= number / 2; i++) {
       if (number % i == 0) {
           sum += i;
       }
   }
   ```
   This loop checks each number from `1` up to `number / 2` to see if it’s a divisor of `number`:

    - **Why only up to `number / 2`?**  
      Since no number greater than half of `number` (like `number / 2`) can be a divisor of `number` (except the number itself), this helps us avoid unnecessary checks and makes the program faster.

    - **Checking for Divisors**:
      ```java
      if (number % i == 0) {
          sum += i;
      }
      ```
      This line checks if `i` divides `number` without a remainder (using `number % i == 0`). If so, `i` is a divisor, and we add it to `sum`.

3. **Checking if the Number is Perfect**:
   ```java
   return sum == number;
   ```
   After the loop, this line checks if the sum of all divisors equals `number`. If they are equal, it means `number` is a perfect number, and the method returns `true`. Otherwise, it returns `false`.

### Summary

- **`main` Method**: Loops through numbers from 1 to 10,000 and prints any number that is a perfect number.
- **`isPerfectNumber` Method**: Checks if a number is perfect by finding its divisors and checking if their sum equals the number itself.

This program will print all perfect numbers between 1 and 10,000 when run.
