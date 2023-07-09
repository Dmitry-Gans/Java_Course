package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task_3 {
    public static void main(String[] args){
// Написать программу, определяющую правильность расстановки 
// скобок в выражении.

// Пример 1: a+(d*3) - истина

// Пример 2: [a+(1*3) - ложь

// Пример 3: [6+(3*3)] - истина

// Пример 4: {a}[+]{(d*3)} - истина

// Пример 5: <{a}+{(d*3)}> - истина

// Пример 6: {a+]}{(d*3)} - ложь

       System.out.println(key("{a}[+]{(d*3)}"));
    }
    static boolean key(String str){
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray(); // Преобразуем строку в массив символов 
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('<','>');
        map.put('[',']');
    
        for(int i = 0; i < c.length; i++){
            if(map.containsKey(c[i])) stack.push(c[i]);// Содержится ли в Мар такоей ключ, 
            // тогда добавляем его в stack
            if(map.containsValue(c[i])){ // Содержится ли в Мар такое значение?
            // IsEmpty - проверяет, является ли строка пустой ("") или значение null
                if(stack.isEmpty() || map.get(stack.pop()) != c[i]) return false; // Если stack пустой
                // или нет пары, то выдаем ошибку. stack.pop() - возвращает и удаляет левую скобку из stack,
                // а с[i] - это правая скобка
            }
        }
        if(!stack.isEmpty()) return false; // Если stack не пуст, но нет пары, то выдаем ошибку
        return true;
        }
}