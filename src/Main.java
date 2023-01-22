import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    task1();
    task2();
    task3();
    task4();
    }

    private static void task1() {
        int [] first = new int [3];
        first[0]= 1;
        first[1]= 2;
        first[2]= 3;

        double [] second = {1.57, 7.654, 9.986};

        int [] third = {111, 222, 777};

    }
    private static void task2() {
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        for(int i=0; i<3; i++ )
        System.out.print(first[i] + ",");
        System.out.println();
        double[] second = {1.57, 7.654, 9.986};
        for(int i=0; i<3; i++ )
        System.out.print(second[i] + ",");
        System.out.println();
        int[] third = {111, 222, 777};
        for(int i=0; i<3; i++ )
        System.out.print(third[i] + "," );
        System.out.println();
    }
    private static void task3() {
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        for(int i=2; i>=0; i =  i - 1 )
            System.out.print(first[i] + ",");
        System.out.println();
        double[] second = {1.57, 7.654, 9.986};
        for(int i=2; i>=0; i =  i - 1 )
            System.out.print(second[i] + ",");
        System.out.println();
        int[] third = {111, 222, 777};
        for(int i=2; i>=0; i =  i - 1 )
            System.out.print(third[i] + "," );
        System.out.println();
    }
    private static void task4() {
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        for (int i = 0; i < 3; i = i + 2)
            first[i] =first[i] + 1;
        System.out.print(Arrays.toString(first));

        System.out.println();
    }
}