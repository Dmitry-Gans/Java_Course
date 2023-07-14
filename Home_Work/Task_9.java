package Home_Work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Task_9 {

    public static void main(String[] args) {

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать,
// что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

    Map<String, ArrayList> telephonBookMap = new HashMap<>() {
        {
          put("Дмитрий", new ArrayList<String>() {
                {
                    add("938209"); // Заполняем массив
                    add("811178");
                    add("909099");
                }
            });
            put("Светлана", new ArrayList<String>() {
                {
                    add("871206");
                }
            });
            put("Степан", new ArrayList<String>() {
                {
                    add("774433");
                    add("282822");

                }
            });
            put("Александр", new ArrayList<String>() {
                {
                    add("836709");
                    add("502862");
                    add("134340");
                    add("866449");
                }
            });
        }
    };

    sortedBook(telephonBookMap);

    }

    // Метод обратной сортровки
    static void sortedBook(Map<String, ArrayList> map) {
        Set<String> keySet = map.keySet(); // Заполняем Set ключами из вложенной Map
        int maxCount = 0;
        int minCount = 1_000_000;
        for (var item : map.entrySet()) { // Обращаемся к ключу и значению Map
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();
        }

        // Создаем обратную очередь
        Stack<String> order = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) { // Равен ли размер массива в значение Map с минимальным счетчиком
                    order.push(item.getKey()); // Добавляем ключи с размером массива 1, затем 2, 3 и тд
                }
            }
            num += 1;
        }

        // Выводим каждый ключ и значение
        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = order.pop(); // Возвращаем имя и удаляем, чтобы в следующей итерации, вернуть другое имя
            for (var item : map.entrySet()) {
                if (name == item.getKey()) { // Имя из Stack равны с именем из Map? 
                    System.out.printf(item.getKey() + ": " + item.getValue() + "\n");
                }
            }
        }
    }
}
