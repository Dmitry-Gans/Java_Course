package Seminar_2;

public class Task_5 {
    public static void main(String[] args){
        // Напишите метод, который принимает на вход строку (String) 
        // и определяет является ли строка 
        // палиндромом (возвращает boolean значение).
        System.out.println(task_5("12321"));

}
    static boolean task_5(String str){
        StringBuilder builder = new StringBuilder(str);
        String newText = builder.reverse().toString();
        return newText.equals(newText);
    }
}
    // public static boolean Task05(String text) {
    //     StringBuilder stringBuilder = new StringBuilder(text);
    //     String newText = stringBuilder.reverse().toString();
    //     return newText.equals(text);
    // }