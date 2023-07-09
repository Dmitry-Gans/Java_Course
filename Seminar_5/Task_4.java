package Seminar_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task_4 {
    public static void main(String[] args){
// Взять набор строк, например:

// Мороз и солнце день чудесный 
// Еще ты дремлешь друг прелестный 
// Пора красавица проснись.

// Написать метод, который отсортирует эти слова по длине с помощью TreeMap. 
// Строки с одинаковой длиной не должны “потеряться”.

        System.out.println(task4("Мороз и солнце день чудесный \n"+
        "Еще ты дремлешь друг прелестный \n" +
        "Пора красавица проснись."));
    }
    static String task4(String str){
        str = str.replace("\n", " "); // replace - заменяем символ на пробел
        str = str.replace(".", " ");
        String[] words = str.split(" "); // Кладем строку в масив, через знак разделителя - пробел
        Map<Integer,List<String>> map = new TreeMap<>(); // Ключ - длина, Значение - список. 
        // TreeMap - сортирует по ключу по возрастанию 

        for(String word: words){
            int len = word.length(); // Присваеваем длину к пременной, которая будет сразу числом
            if(map.containsKey(len)){ // Проверяем, есть ли данный ключ в Мар 
                List<String> list = map.get(len); // Создаем лист и кладем в него значение от имеющегося ключа
                list.add(word); // Добавляем в ключ слово с такой же длиной
            }else{
                List<String> list= new ArrayList<>(); // Создаем list для значения
                list.add(word); // В этот лист кладем слово, присутствующее в массиве words
                map.put(len, list); // Теперь в Мар добавляем ключ(длина) и значение(лист)  
            }
        }
        return map.toString();
    }
    
}