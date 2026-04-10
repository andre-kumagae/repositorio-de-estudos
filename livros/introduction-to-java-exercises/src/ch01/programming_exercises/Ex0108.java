package ch01.programming_exercises;

public class Ex0108 {
    public static void main(String[] args) {
        final double PI = 3.1459;
        double radius = 6.5;
        double perimeter = 2 * radius * PI;
        double area = PI * radius * radius;
        System.out.printf("""
                %-12s %.2f
                %-12s %.2f
                %-12s %.2f
                %-12s %.2f
                ""","radius: ",radius,"PI: ",PI,"perimeter: ",perimeter,"area: ",area);
    }
}
