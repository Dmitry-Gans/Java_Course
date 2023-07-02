package Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task_1 {
    public static void main(String[]args){
// <aside>
// **Текст задачи:**
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

// </aside>
        List<Integer> list = new ArrayList<>();
        Queue<Integer> linked = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linked.add(i);
        }
        long secondEnd = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(secondEnd - end);
        }
}
