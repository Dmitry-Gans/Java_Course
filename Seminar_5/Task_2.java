package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args){
// Даны 2 строки, написать метод, который вернет true, 
// если эти строки являются изоморфными и false, если нет. 
// Строки изоморфны, если одну букву в первом слове 
// можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на 
// одну и ту же букву с сохранением порядка следования. 
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. 
// (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "bar"

// Output: false
// f = b
// o = a и тд

// Пример 2:

// Input: s = "paper", t = "title"

// Output: true
// p = t
// a = i и тд

        System.out.println(task("paper", "title"));
        
    }
    static boolean task (String str1, String str2){

        
        if(str1.length() != str2.length()) return false; // Если длина слов разная, то выдаем сразу ошибку
        char[] c1 = str1.toCharArray(); // Превращаем строку в массив Чаров, это у нас ключи
        char[] c2 = str2.toCharArray(); // Превращаем строку в массив Чаров, это у нас значения
        Map<Character, Character> map = new HashMap<>(); // Используем класс-оболочку Character
        //для примитивного типа данных char

        for (int i = 0; i < c1.length; i++){
            if(map.containsKey(c1[i])){ // В Мар есть какой то ключ? Если нет, то 50 строка
                if(c2[i] != map.get(c1[i])) return false; // Если значение не равно значению от с1, то выдаем ошибку
            } else{
                map.put(c1[i], c2[i]); // Добавляем в Map ключ и значение
            }
        }
        return true;
    }
} 