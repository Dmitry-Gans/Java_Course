package Seminar_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_4 {
    public static void main(String[]args){
    // 1) Написать метод, который принимает массив элементов, 
    // помещает их в стэк и выводит на консоль содержимое стэка.

    // 2) Написать метод, который принимает массив элементов,
    // помещает их в очередь и выводит на консоль содержимое очереди.
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(5);
        while(!stack.isEmpty()){// ищем
            System.out.println(stack.pop()); 
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    // Реализовать стэк с помощью массива. Нужно реализовать методы:

    // size(), empty(), push(), peek(), pop().
    static void stack(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }
}
