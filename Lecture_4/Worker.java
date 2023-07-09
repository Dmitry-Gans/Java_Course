package Lecture_4;

public class Worker {
    int id;
    int salary; // Зарплата
    String firsName;
    String lastname;
    
    public String toString(){
        return String.format("id:%d fn:%s ln:%s s:%d", id, firsName, lastname, salary);
    }  

    public boolean equals(Object obj){
        Worker t = (Worker) obj;
        return id == t.id && firsName == t.firsName;
        
    }

    public int hashCode(){
        return id;
    }
}
