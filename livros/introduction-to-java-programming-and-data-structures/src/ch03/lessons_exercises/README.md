# Exercises - Chapter 3

## 3.12.1

What happens if you enter an integer as 05?\
Answer: It works.

## 3.13.1

What data types are required for a switch variable? If the keyword break is not used after a case is processed, what is the next statement to be executed? Can you convert a switch statement to an equivalent if statement, or vice versa? What are the advantages of using a switch statement?

## 3.12.2

What is y after the following switch statement is executed? Rewrite the code
using an if-else statement.

```java
x = 3; y = 3;
switch (x +  3) {
    case 6: y = 1;
    default: y += 1;
}
```
## 3.13.4

Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, if day is 0, 1,
2, 3, 4, 5, 6, respectively.

## 3.13.5

Rewrite Listing 3.9 using an  if-else  statement.

## 3.14.1

Suppose when you run the following program, you enter the input 2 3 6 from the console. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");
    }
}
```
Answer: sorted.

## 3.14.2

Rewrite the following if statements using the conditional operator.

```java
        if (ages >= 16)
            ticketPrice = 20;
        else
            ticketPrice = 10;
```
