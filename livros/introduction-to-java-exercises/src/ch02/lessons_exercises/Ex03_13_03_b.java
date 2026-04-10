package ch02.lessons_exercises;

public class Ex03_13_03_b {
    public static void main(String[] args) {
        int x = 1, a = 3;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            case 4:
                x += 34;
                break;
        }
        System.out.printf("x: %d\na: %d\n", x, a);
    }
}
