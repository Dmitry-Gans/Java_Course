package Seminar_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] asgs){
        // Каталог товаров книжного магазина сохранен в
        // виде двумерного списка List<ArrayList<String>> так, 
        // что на 0й позиции каждого внутреннего списка содержится название жанра,
        // а на остальных позициях - названия книг. 
        // Напишите метод для заполнения данной структуры.

        // фантастика, марсиане
        // приключения, пираты
        // классика, поэзия пушкина
        // детектив, шерлок холмс

        List<ArrayList<String>> listBook = new ArrayList<>();
        addBook("Фантастика", "Трудно быть богом", listBook);
        addBook("Фантастика", "Марсианин", listBook);
        addBook("Детектив", "Убийство в восточном экспрессе", listBook);

        System.out.println(listBook);
    }
    public static void addBook(String type, String name, List<ArrayList<String>> listBook){
        for (int i = 0; i < listBook.size(); i++) {
            if(listBook.get(i).get(0).equals(type)){
                listBook.get(i).add(name);
                return;
            }
        }
        ArrayList<String> t = new ArrayList<>();
        t.add(type); // 0
        t.add(name); // 1
        listBook.add(t);
    }
}
