package Seminar_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task_2 {
    public static void main(String[] asgs){
        // Текст задачи:
        // Заполнить список десятью случайными числами. 
        // Отсортировать список методом sort() и вывести его на экран.
        List<Integer> list = createList(10, 2, 9);
        Collections.sort(list);
        System.out.println(list);
    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min)); // Рандо работает от 1 и до тд, но 1 не берет
        }
        return list;
    }
}
