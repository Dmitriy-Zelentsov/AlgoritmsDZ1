// 1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
package DZ1;

public class Ex1 {
    public static void main(String[] args) {
        Integer [] array = {-3,4,68,242,642,null,132,234,1,null,0};
        SearchNull(array);
    }
    public static void SearchNull(Integer [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                System.out.println("В ячейке с индексом " +i+ " null");
            }
        }    
    }
}