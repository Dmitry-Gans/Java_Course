package Seminar_6;

import java.util.List;

public class Cat {
// Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.

// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.

// 3. Создайте метод

// **public boolean**

// equals(Object o)

// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.

// 4. Создайте метод

// **public int hashCode()**

// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))

// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

    private String name;

    private String owner;

    private String breed;

    private int age;

    private List<String> healthHistory;

    public Cat(String name, String owner, String breed, int age){
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "name: " + name + ", owner: " + owner + ", breed: " + breed + ", age: " + age;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Cat)) return false;
        Cat cat = (Cat)o;
        return name.equals(cat.name) && age == cat.age && owner.equals(cat.owner) && breed.equals(cat.breed);
    }

    public int hashCode(){
        return 6*name.hashCode() + 12*age + 3*breed.hashCode() + 8*owner.hashCode();
    }
}
