package Seminar_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_4 {
    public static void main(String[] args){
        Task4(wordRepeat("Test", 20));
    
}
    static void task_4(String str){
        String path = "text.txt";

        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(path);

        } catch (IOException e){
            e.printStackTrace();
        }
        logger.addHandler(fileHandler); // Привязываем
        SimpleFormatter simpleFormatter = new SimpleFormatter(); // Сжимает нужную информацию по ошибке в log.txt - файл
        fileHandler.setFormatter(simpleFormatter); // Привязываем
        
        try(FileWriter fileWriter = new FileWriter(path, true);){
            fileWriter.write(str);
            fileWriter.flush();
        } catch (Exception e){
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        } 

        fileHandler.close();
        logger.getHandlers()[0].close();
        
    
        

    }
}

// static void task3(String str) {
//         String path = "log.txt";

//         Logger logger = Logger.getAnonymousLogger();
//         FileHandler fileHandler = null;
//         try {
//             fileHandler = new FileHandler(path, true);
//         } catch (IOException e){
//             e.printStackTrace();
//         }
//         logger.addHandler(fileHandler);
//         SimpleFormatter simpleFormatter = new SimpleFormatter();
//         fileHandler.setFormatter(simpleFormatter);

//         try (FileWriter fileWriter = new FileWriter("g/g/g//g/g/text.txt", true);){
//             fileWriter.write(str);
//             fileWriter.flush();
//         } catch (Exception e){
//             e.printStackTrace();
//             logger.log(Level.WARNING, e.getMessage());
//         }

//         fileHandler.close();
//         logger.getHandlers()[0].close();

//     }