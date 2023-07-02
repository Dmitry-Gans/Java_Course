package Seminar_4;

public class MyStack {
    
        // Реализовать стэк с помощью массива. Нужно реализовать методы:

        // size(), empty(), push(), peek(), pop().


    private Integer[] array = new Integer[10];

    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int item){
        if(size == array.length){
            Integer[] array2 = new Integer[array.length * 2];
            System.arraycopy(array, 0, array2, 0, array.length );
            array = array2;
        }
        array[size++] = item;
    }
    int peek(){
        return array[size - 1];
    }
    int pop(){
        return array[--size];
    }
}
