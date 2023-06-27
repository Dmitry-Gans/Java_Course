package Seminar_2;

import java.io.FileWriter;

public class Task_3 {
    public static void main(String[] args){
        // Напишите метод, который составит строку, 
        // состоящую из 100 повторений слова TEST и метод, 
        // который запишет эту строку в простой текстовый файл,
        // обработайте исключения.
        task_3(wordRepeat("test", 20));;
    }
    static String wordRepeat(String word, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(word);
        }
        // System.out.println(stringBuilder.toString());
        // return stringBuilder.toString();
        return word.repeat(n);
    }
    static void task_3(String str){
        String path = "text.txt";
        try(FileWriter fileWriter = new FileWriter(path, true);){
            fileWriter.write(str);
            fileWriter.flush();
        } catch (Exception e){
            e.printStackTrace();
        } 
            
    
        

    }
}
