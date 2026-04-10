package ch03.lessons_exercises;

public class Ex03_14_04 {
    public static void main(String[] args) {
        int random = ((int) (Math.random() * 10) > 5) ? -1 : 1;
        System.out.println(random);
    }
}
