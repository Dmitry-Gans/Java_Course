package Seminar_2;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args){
        // Напишите метод, который сжимает строку. 
        // Пример: вход aaaabbbcdd.
        System.out.println(task_2("aaaabbbcdd"));
    }
    static String task_2(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == chars[i - 1]) count++;
            else{
                stringBuilder.append(chars[i - 1]).append(count + 1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count);
        return stringBuilder.toString();

    }
}

// static String task1(String str){
//         /* Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. Выход: a4b3c1d2*/
//         char[] chars = str.toCharArray();
//         Arrays.sort(chars);
//         int count = 0;
//         StringBuilder stringBuilder = new StringBuilder();

//         for (int i = 1; i < chars.length ; i++) {
//             if(chars[i] == chars[i-1]) count++;
//             else {
//                 stringBuilder.append(chars[i-1]).append(count+1);
//                 count = 0;
//             }
//         }
//         stringBuilder.append(chars[chars.length-1]).append(count+1);
//         return stringBuilder.toString();
//     }