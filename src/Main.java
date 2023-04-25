import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        System.out.println(apple[0]);
        System.out.println(apple[1]);
        System.out.println(apple[2]);

        float[] money = {1.57f, 7.654f, 9.986f};
        System.out.println(money[0]);
        System.out.println(money[1]);
        System.out.println(money[2]);

        int[] brain = {23, 14, 10, 12, 5, 0};
        System.out.println(brain[0]);
        System.out.println(brain[1]);
        System.out.println(brain[2]);
        System.out.println(brain[3]);
        System.out.println(brain[4]);
        System.out.println(brain[5]);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        System.out.println(Arrays.toString(apple));


        double[] money = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(money));


        int[] brain = {23, 14, 10, 12, 5, 0};
        System.out.println(Arrays.toString(brain));
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        for (int i = apple.length - 1; i >= 0; i--) {
            System.out.print(apple[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] money = {1.57, 7.654, 9.986};
        for (int i = money.length - 1; i >= 0; i--) {
            System.out.print(money[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        int[] brain = {23, 14, 10, 12, 5, 0};
        for (int i = brain.length - 1; i >= 0; i--) {
            System.out.print(brain[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        for (int i = 0; i < apple.length; i++) {
            if (apple[i] % 2 != 0) {
                apple[i] += 1;
            }
        }
        System.out.println(Arrays.toString(apple));
    }
}