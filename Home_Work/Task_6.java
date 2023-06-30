package Home_Work;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) throws Exception{
        // Реализуйте алгоритм сортировки пузырьком числового массива, 
        // результат после каждой итерации запишите в лог-файл.
        PrintStream fileName = new PrintStream(new File("Home_Work\\log_file.log"));// Выходной файл
        int[] array = {5, 3, 9, 6, 2, 7, 1, 4, 7, 6, 8};
        int tmp = 0;
        for (int out = array.length - 1; out >= 1; out--){//Внешний цикл
            // Идут друг другу на встречу
            for (int in = 0; in < out; in++){//Внутренний цикл
                if(array[in] > array[in + 1]){
                    tmp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = tmp;
                    fileName.println(Arrays.toString(array));
                    System.out.println(Arrays.toString(array));
                    System.out.println("");
                }
            }
        }
    }
}