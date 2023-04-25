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
        int[] appleInBox = new int[3];
        appleInBox[0] = 1;
        appleInBox[1] = 2;
        appleInBox[2] = 3;
        System.out.println(appleInBox[0]);
        System.out.println(appleInBox[1]);
        System.out.println(appleInBox[2]);

        float[] moneyInBank = {1.57f, 7.654f, 9.986f};
        System.out.println(moneyInBank[0]);
        System.out.println(moneyInBank[1]);
        System.out.println(moneyInBank[2]);

        int[] brainInMyHead = {23, 14, 10, 12, 5, 0};
        System.out.println(brainInMyHead[0]);
        System.out.println(brainInMyHead[1]);
        System.out.println(brainInMyHead[2]);
        System.out.println(brainInMyHead[3]);
        System.out.println(brainInMyHead[4]);
        System.out.println(brainInMyHead[5]);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] appleInBox = new int[3];
        appleInBox[0] = 1;
        appleInBox[1] = 2;
        appleInBox[2] = 3;
        System.out.println(Arrays.toString(appleInBox));


        float[] moneyInBank = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(moneyInBank));


        int[] brainInMyHead = {23, 14, 10, 12, 5, 0};
        System.out.println(Arrays.toString(brainInMyHead));
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] appleInBox = new int[3];
        appleInBox[0] = 1;
        appleInBox[1] = 2;
        appleInBox[2] = 3;
        System.out.println(appleInBox[2] + ", " + appleInBox[1] + ", " + appleInBox[0]);


        float[] moneyInBank = {1.57f, 7.654f, 9.986f};
        System.out.println(moneyInBank[2] + ", " + moneyInBank[1] + ", " + moneyInBank[0]);


        int[] brainInMyHead = {23, 14, 10, 12, 5, 0};
        System.out.println(brainInMyHead[5] + ", " + brainInMyHead[4] + ", " + brainInMyHead[3] + ", " + brainInMyHead[2] + ", " + brainInMyHead[1] + ", " + brainInMyHead[0]);
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] appleInBox = new int[3];
        appleInBox[0] = 1;
        appleInBox[1] = 2;
        appleInBox[2] = 3;
        for (int i = 0; i < appleInBox.length; i+=2) {
            appleInBox[i]++;
            System.out.println(Arrays.toString(appleInBox));
        }
    }
}