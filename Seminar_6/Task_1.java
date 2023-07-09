package Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Task_1 {
    public static void main(String[] args) {
// Создайте HashSet, заполните его следующими числами: 
// {1, 2, 3, 2, 4, 5, 6, 3}. 
// Распечатайте содержимое данного множества.

// 2. Создайте LinkedHashSet, заполните его следующими числами: 
// {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.

// 3. Создайте TreeSet, заполните его следующими числами: 
// {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.
        // Integer[] array = new Integer[]{1, 2, 3, 11, 2, 9, 4, 5, 6};
        // Set<Integer> set1 = new HashSet<>(Arrays.asList(array));
        // Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(array));
        // Set<Integer> set3 = new TreeSet<>(Arrays.asList(array));

        // System.out.println(set1);
        // System.out.println(set2);
        // System.out.println(set3);

// Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.

// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.

// 3. Создайте метод

// **public boolean**

// equals(Object o)

// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.

// 4. Создайте метод

// **public int hashCode()**

// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))

// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

        Cat cat1 = new Cat("Мурка", "Василий", "Майкун", 8);
        Cat cat2 = new Cat("Barsic", "Petr", "Перс", 10);
        Cat cat3 = new Cat("Barsic", "Petr", "Перс", 10);

        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(cat2.equals(cat3));
        System.out.println(set);
    
    }
    static void task_2(){
// Напишите метод, который заполнит массив из 1000 элементов 
// случайными цифрами от 0 до 24.

// 2. Создайте метод, в который передайте заполненный выше
// массив и с помощью Set вычислите процент уникальных значений 
// в данном массиве и верните его в виде числа с плавающей 
// запятой.

// Для вычисления процента используйте формулу:

// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

    System.out.println(unicPercent(createrArr(100, 0, 24)));
    }
    static Integer[] createrArr(int size, int min, int max){
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(max-min+1)+min);
        }
        return array;
    }
    static double unicPercent(Integer[] array){
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        double percent = set.size() * 100.0/array.length;
        return percent;
    }
}
