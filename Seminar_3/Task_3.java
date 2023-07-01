package Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_3 {
    public static void main(String[] asgs){
        // Создать список типа ArrayList<String>. 
        // Поместить в него как строки, так и целые числа. 
        // Пройти по списку, найти и удалить целые числа.
        List list = new ArrayList<>();
        list.add("list");
        list.add(77);
        list.add(55);
        list.add("hello"); 
        list.add(12);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();// array[i]
            if(o instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
