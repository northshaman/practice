package arrays;

import java.io.InputStream;
import java.util.Scanner;

/**
 * http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/
 */
public class Arr1 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //    Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
    public static int[] getZeroArr(int[] arr) {
        arr[0] = 1;
        arr[arr.length - 1] = 1;
        for (int i = 1; i < arr.length - 2; i++) {
            arr[i] = 0;
        }
        return arr;
    }


    //   Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
    public static int[] geZeroOneArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        return arr;
    }

    //    Заполнить массив последовательными нечетными числами, начиная с единицы.
    public static int[] fillWhithUneven(int[] array) {
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] + 2;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Input correct array length :");
        int length = 0;
        while (true) {
            length = Integer.parseInt(new Scanner(System.in).next());
            if (length > 0) break;
        }
        int[] array = new int[length];

//      array = getZeroArr(array);
//      array = geZeroOneArr(array);
        array = fillWhithUneven(array);
        printArray(array);
    }
}
