package ch03.lessons_exercises;

public class Ex03_13_02_a {
    public static void main(String[] args) {
        int x = 3, y = 3;
        switch (x + 3) {
            case 6:
                y = 1;
                break;
            default:
                y += 1;
                break;
        }
            System.out.printf("x: %d\ny: %d\n", x, y);
        }
    }