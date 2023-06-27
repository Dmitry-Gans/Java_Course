// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

package Seminar_1;

public class Task_3 {
    public static void main(String[] args){
        System.out.println(Task_3("Добро пожаловать на курс по Java"));
    }
    static String Task_3(String str){
        String[] strArr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            stringBuilder.append(strArr[strArr.length-i-1]).append(" ");
        } 
        return stringBuilder.toString();

    }
    
}
