package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Passport {

    private Map<String, String> map = new HashMap<>();

// Метод добавляющий Ключ(номер паспорта) и Фамилию
    void add(String passNum, String lastName){
        map.put(passNum, lastName); // put кладет знаечение, которые указываем в скобках
    }

// Метод возвращает Фамилию по номеру паспорта
    String getByPassNum(String passNum){
        return passNum + ": " + map.get(passNum); //123456: Иванов
    }

// Метод возаращающий номер паспорта по фамилии 
    String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry: // Entry хранит в себе сразу пару(ключ и значение)
            map.entrySet()) {// entrySet() - это набор всех пар
            if(entry.getValue().equals(lastName)){ // Если значение обьекта который проходим ровняется lastName, то
                stringBuilder.append(entry.getKey()); // getKey() - показывает ключ
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue()); // getValue() - показывает значение
                stringBuilder.append("\n"); // Переход на следующую строку

            }
        }
        return stringBuilder.toString();
    }

// Метод возвращающий весь Map со всеми парами(ключ, значение)
    String getAll(){
        return map.toString();
    }

}
