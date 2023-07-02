package Seminar_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[]args){
        // Принимает от пользователя строку вида text~num
        List<String> linked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while(work){
            System.out.println("Введите команду! ");
            String line = scanner.nextLine();
            String[] array = line.split("~");
            int num = Integer.parseInt(array[1]);
            String text = array[0];
            switch(text){
                case "print" :
                    System.out.println(linked.remove(num));
                    break;
                case "exit" :
                    System.out.println("До встречи!");
                    work = false;
                    break;
                default :
                    linked.add(num, text);
            }
            }

    }
    
}
