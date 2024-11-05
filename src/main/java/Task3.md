### Overview of the Program

This program finds and prints all "prime numbers" between 1 and 100.

**What is a prime number?**
A prime number is a positive integer greater than 1 that is only divisible by 1 and itself. Examples of prime numbers are `2`, `3`, `5`, `7`, and `11`.

### Structure of the Code

The program is organized in a class called `Task3`. This class has:
- A `main` method, where the program begins.
- A helper method called `isPrime`, which checks if a given number is prime.

### 1. **The `main` Method**

```java
public static void main(String[] args) {
    for (int number = 1; number <= 100; number++) {
        if (isPrime(number)) {
            System.out.println(number);
        }
    }
}
```

This `main` method controls the flow of the program. Let's look at what each part does:

1. **Looping Through Numbers from 1 to 100**:
   ```java
   for (int number = 1; number <= 100; number++) {
       ...
   }
   ```
   This `for` loop goes through each integer from `1` to `100` and checks if each number is a prime number.

2. **Checking for Prime Numbers**:
   ```java
   if (isPrime(number)) {
       System.out.println(number);
   }
   ```
   For each number in the loop, the program calls the `isPrime` method. If `isPrime` returns `true` (meaning the number is prime), it prints the number to the console.

### 2. **The `isPrime` Method**

The `isPrime` method checks if a given number is a prime number.

```java
public static boolean isPrime(int number) { ... }
```

This method takes an integer as input (`number`) and returns `true` if it is a prime number, or `false` if it isn’t. Here’s how it works:

1. **Checking if the Number is Greater Than 1**:
   ```java
   if (number <= 1) {
       return false;
   }
   ```
   Prime numbers must be greater than `1`. If the `number` is `1` or less, it isn’t prime, so the method immediately returns `false`.

2. **Checking for Divisibility**:
   ```java
   for (int i = 2; i <= Math.sqrt(number); i++) {
       if (number % i == 0) {
           return false;
       }
   }
   ```
   This `for` loop checks if `number` is divisible by any integer `i` between `2` and the square root of `number`. Here’s why this works:

    - **Divisibility Check**:
      ```java
      if (number % i == 0) {
          return false;
      }
      ```
      This line checks if `number` can be divided by `i` without leaving a remainder. If `number % i == 0`, it means `i` is a divisor of `number`, and thus `number` is not prime. In that case, the method returns `false`.

    - **Why Check Only Up to the Square Root?**  
      We only need to check up to the square root of `number` because any divisor larger than the square root would already have a corresponding smaller divisor (e.g., if `36` is divisible by `6`, it’s also divisible by `6`). This makes the program more efficient.

3. **Returning `true` for Prime Numbers**:
   ```java
   return true;
   ```
   If the method doesn’t find any divisors in the loop, it means `number` is only divisible by `1` and itself. Therefore, it is prime, and the method returns `true`.

### Summary

- **`main` Method**: Loops through numbers from 1 to 100, checking each one to see if it’s prime. If a number is prime, it prints it.
- **`isPrime` Method**: Checks if a number is prime by ensuring it is greater than 1 and not divisible by any numbers other than 1 and itself (up to the square root of the number).

When this code is run, it prints all the prime numbers between 1 and 100.