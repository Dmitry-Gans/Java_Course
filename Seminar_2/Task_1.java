package Seminar_2;

public class Task_1 {
    public static void main(String[] args){
//  Текст задачи:
//  Дано четное число N (>0) и символы c1 и c2. Написать метод, 
//  который вернет строку длины N, которая состоит из чередующихся 
//  символов c1 и c2, начиная с c1.
        System.out.println(task_1(10, 'a', 'b'));
    }

    static String task_1 (int n, char c1, char c2){
        if(n % 2 == 0){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n/2; i++) {
                stringBuilder.append(c1).append(c2);                
            }
            return stringBuilder.toString();
        } else{
            System.out.println("N is not even numer!");
            return null;
        }
    }
    
}
