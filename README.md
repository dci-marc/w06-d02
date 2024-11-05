[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/5KxGqZZk)

> Submit your solution in the respective class file.
>
> For example, Task 1 will be placed in Task1.java, etc.


# Task 1

## How Many Vowels?

### Overview:
Loops are often used to count elements from in a string.

### Task
Create a function that takes a string and returns the number (count) of vowels contained within it.

#### Input / Output:
"Your Digital Career Starts Here" --> 11  
"The quick brown fox jumps over the lazy dog" --> 11  
"Lorem ipsum dolor sit amet, consetetur sadipscing elitr" --> 18  


# Task 2

## Find Perfect numbers

### Task:
Calculate and print all perfect numbers between 1 and 10000

Note: A perfect number is the sum of it's proper divisors e.g. 6 = 1 + 2 + 3 (https://en.wikipedia.org/wiki/Perfect_number)


### Output:
6,28,...  


# Task 3

## Find Prime numbers

### Task:
Calculate and print all prime numbers from 1 to 100

Note: a prime number is a number that can only be divided by itself and 1 (with an even result). e.g. 1,2,3 but not 4 since 4 / 2 is

The modulo operator ( % ) will return the "remainder" of a division (https://www.baeldung.com/modulo-java)


### Output:
1,2,3,...  

# Task 4

## "for" loop in Java

### Overview:

The Java "for" loop iterates from a start value to an end value in defined steps. Its format is: 
```  
for(int index = start; index <= end; index++) {
    // insert statements here
}
```

### Task

Write a method `repeat()` that returns a string and takes 2 parameters: count and word. It shoud iterate from 1 
to count and output the word with the current index "n" times, separated by space ' '.


#### Input / Output:
"3, number" --> "number1 number2 number3 "  
"5, article  " --> "article1 article2 article3 article4 article5 "  
