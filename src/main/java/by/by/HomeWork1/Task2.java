//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
// новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же
// ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть -
// RuntimeException, т.е. ваше.

package by.by.HomeWork1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {65415,9821,964,0,1223,987,165};
        int[] arr2 = {7,6,5,4,3,2,1};
        int[] arr3 = {7,6,5,0,3,2,1};
        int[] arr4 = null;
        int[] arr5 = {7,6,3,2,1};

        int[] res = DividingArrays(arr1, arr3);
        System.out.println(Arrays.toString(res));
    }

    private static int[] DividingArrays(int[] array1, int[] array2) {
        if(array1 == null || array2 == null)
            throw new IllegalArgumentException("Argument is null");
        if(array1.length != array2.length)
            throw new RuntimeException("Array lengths are not equal");
        int[] resArray = new int[array1.length];
        for (int i = 0; i < resArray.length; i++) {
            if(array2[i] == 0)
                throw new RuntimeException("Division by zero");
            resArray[i] = array1[i] / array2[i];
        }
        return resArray;
    }
}
