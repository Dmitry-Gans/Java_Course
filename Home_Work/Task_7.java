package Home_Work;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args){
// Задание

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 2, 8, 8, 4, 3, 6, 16, 1, 3, 6, 11, 5, 3, 6));
        remove(arrayList);
        min_and_max(arrayList);
        average_value(arrayList);


    }
    public static void remove(ArrayList<Integer> arrayList){
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if(arrayList.get(i) % 2 == 0){
                arrayList.remove(i);
            }
        }
        System.out.println("Удаление четных чисел: " + arrayList);
    }
    public static void min_and_max(ArrayList<Integer> arrayList){
        int min = arrayList.get(0);
        int max = arrayList.get(0);
        int size = arrayList.size();
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) < min){
                min = arrayList.get(i);

            }
            if(arrayList.get(i) > max){
                max = arrayList.get(i);
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
    public static void average_value(ArrayList<Integer> arrayList){
        int size = arrayList.size();
        int sum = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {

            if(i < size){
                sum = sum + arrayList.get(i);
            }
        }
        System.out.println("Среднее значение: " + sum/size);
    }
    
}
