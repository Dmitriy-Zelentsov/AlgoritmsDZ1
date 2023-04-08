// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов 
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
package DZ1;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int [] array1 = {-3,4,68,242,642,132,234,1};
        int [] array2 = {-45,3,-5,6,5,77,10,165};
        int[] arrayres = new int[array1.length];
        ResArray(array1, array2, arrayres);
    }
    public static void ResArray(int [] array1, int [] array2, int [] arrayres) {
        if(array1.length != array2.length){
            throw new RuntimeException("Длинны массивов не равны");
        }
        for (int i = 0; i < array1.length; i++) {
            arrayres[i]= array1[i]+array2[i];
        }
        System.out.println(Arrays.toString(arrayres));
    }
}
