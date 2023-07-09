package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args){
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов

// 321456 Васильев

// 234561 Петрова

// 234432 Иванов

// 654321 Петрова

// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

        Passport passport = new Passport(); // Вызываем класс который создали в другом файле
        passport.add("123456", "Иванов");
        passport.add("321456", "Васильев");
        passport.add("234561", "Петров");
        passport.add("234432", "Иванов");

        System.out.println(passport.getByLastName("Иванов"));
        System.out.println(passport.getByPassNum("123456"));
        System.err.println(passport.getAll());

    }   
}
