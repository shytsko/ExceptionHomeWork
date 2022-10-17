//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
// оповестить пользователя.

package by.by.HomeWork1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {7,6,5,4,3,2,1};
        int[] arr3 = null;
        int[] arr4 = {7,6,3,2,1};

        int[] res = SubtractionArrays(arr1, arr4);
        System.out.println(Arrays.toString(res));
    }

    private static int[] SubtractionArrays(int[] array1, int[] array2) {
        if(array1 == null || array2 == null)
            throw new IllegalArgumentException("Argument is null");
        if(array1.length != array2.length)
            throw new RuntimeException("Array lengths are not equal");
        int[] resArray = new int[array1.length];
        for (int i = 0; i < resArray.length; i++)
            resArray[i] = array1[i]-array2[i];
        return resArray;
    }
}
