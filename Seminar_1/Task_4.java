// Реализовать функцию возведения числа а в степень b. a, b из Z. 
// Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

package Seminar_1;

public class Task_4 {
    public static void main(String[] args){
       System.out.println(Task_4(3, 2));
    }
    static double Task_4(int a , int b){
        double result = 1;
        if(b == 0 || a == 1){
            return 1;
        }
        else if(a == 0){
            return 0;
        }
        for (int i = 0; i < Math.abs(b); i++) {
            result = result * a;
        }
        return b > 0 ? result : 1 / result;
        
    }
   
}
