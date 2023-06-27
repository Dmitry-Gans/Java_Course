package Home_Work;

import java.util.*;

public class Task_3 {
   
    public static void main(String[] args){
        // Реализовать простой калькулятор
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите два числа которые хотите посчитать: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Выберите действие: +, -, *, /: ");
        char operation = sc.next().charAt(0);
        outcome(a,b,operation);
        }
        public static int outcome(int a, int b, char operation){
            int result = 0;
            if (operation == '+') {
                result = a + b;
            }
            else if (operation == '-') {
                result = a - b;
            }
            else if (operation == '*') {
                result = a * b;
            }
            else if (operation == '%') {
                result = a % b;
            }
            else if (operation == '/') {
                result = a / b;
            }
            System.out.println("Ответ: " + result);
            return result;
        }
    }

