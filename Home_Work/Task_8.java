package Home_Work;

import java.util.LinkedList;
import java.util.Queue;

public class Task_8 {
    
    public static void main(String[] str){
// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

    LinkedList<String> linkedList = new LinkedList<>();
    LinkedList<String> queue = linkedList;// Для второй задачи
    linkedList.add("Hello");
    linkedList.add("Word");
    linkedList.add("My");
    linkedList.add("Name");
    System.out.println("Первая задача:");
    System.out.println("Исходный список: " + linkedList);
    linkedList = reversLinkedList(linkedList);
    System.out.println("Перевернутый список: " + linkedList);
    System.out.println("");

    System.out.println("Вторая задача:");
    System.out.println(queue);
    System.out.println(enqueue(queue, "Dmitry"));
    System.out.println(dequeue(queue));
    System.out.println(queue);
    System.out.println(first(queue));
    System.out.println(queue);

    }
    // Метод переворачивает список
    public static LinkedList<String> reversLinkedList(LinkedList<String> list){
        LinkedList<String> reversLinked = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--){
            reversLinked.add(list.get(i));
        }
        return reversLinked;
    }
    // Метод помещает элемент в конец списка
    public static LinkedList<String> enqueue(LinkedList<String> queue, String str){
        queue.addLast(str);
        return queue;
    }
    // Метод возвращает первый элемент списка и удаляет его
    public static String dequeue(LinkedList<String> queue){
        String str = queue.get(0);
        queue.remove(0);
        return str;
    }
    // Метод возвращает первый элемент списка, но не удаляет его
    public static String  first(LinkedList<String> queue){
        String str = queue.get(0);
        return str;
    }

}
