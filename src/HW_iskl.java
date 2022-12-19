import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HW_iskl {

//        4.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
//1. выход за массив
//2.несуществующие числа


    //    1.Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void main(String[] args) {
        List<Integer> spisok = new ArrayList<>();
        String[][] arr = new String[5][5];

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 7};
        int[] arr2 = new int[]{3, 4, 65, 7, 6, 54, 6, 87, 5, 6, 6,};
//
//        try {
//            for (int i = 0; i < task3(arr1, arr2).length; i++) {
//                System.out.println(task3(arr1, arr2)[i]);
//            }
//        } catch (NullPointerException e) {
//            System.out.println("Вывожу Null");
//        }

        double[]  arr3 = new double[]{1,2,3,4,5,6,7,8,9,0,7};
        double[]  arr4 = new double[]{3,4,65,7,6,5,0,4,5,6,7,7,76,7};


        HW_iskl hw = new HW_iskl();
//        hw.task1_1(spisok);
//        hw.task1_2();
//        hw.task1_3();
//        hw.task2(arr);
        task4(arr3,arr4);

    }


    public void task1_1(List<Integer> Sp) {
        int min = Sp.get(0);
        int max = Sp.get(0);
        double average = Sp.get(0);
        for (int i = 1; i < Sp.size(); i++) {
            if (min > Sp.get(i)) min = Sp.get(i);
            if (max < Sp.get(i))
                max = Sp.get(i);           //тут мы получили исключение IndexOutOfBoundsException, причина его появления отсутствие заполнения списка
            average += Sp.get(i);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(average / Sp.size());
    }

    public void task1_2() {
        System.out.println("Введите число a:");
        Scanner iScanner = new Scanner(System.in);
        int a = Integer.parseInt(null);
        System.out.println("Введите число b:");                     //мы получили NumberFormatException, причина его появления неправильный формат числа
        int b = iScanner.nextInt();
        iScanner.close();
        System.out.println(a + b >= 10 && a + b <= 20 ? true : false);
    }

    public void task1_3() {
        int numb = 5;
        System.out.println(5 / 0);                                   // ArithmeticException эту ошибку мы получили потому что делили на ноль
    }


//        2.Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//        https://geekbrainspro.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fdc8fb574-7132-4c30-948b-a8ffa0e0400e%2FUntitled.png?table=block&id=fa2b7115-a0d0-4a24-884b-448d82ee9afa&spaceId=2d953187-2ecf-4a5c-9bdf-c2ed4aa196e4&width=2000&userId=&cache=v2

    public int task2(String[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {                             //NumberFormatException,IllegalArgumentException
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    //        3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя. Вместо массива может прийти null (обработать)


    public static int[] task3(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
            return arr3;
        } else System.out.println("Длинны массивов не равны");

        return null;

    }
    // 4.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    //   Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
    //1. выход за массив
    //2.несуществующие числа


    public  static double[] task4 (double[] arr1 , double[] arr2) {

        double[] arr3 = new double[arr1.length];
        try {
            for (int i = 0; i < arr2.length; i++) {
                arr3[i] = arr1[i] / arr2[i];
                System.out.println(arr3[i]);
            }

        }catch (RuntimeException e){
            System.out.println("Исключение - RuntimeException");
        }

        return  arr3;
    }
}