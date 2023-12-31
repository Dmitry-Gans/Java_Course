package Сontrol_work;

public class Raffle {

    public static void main(String[] args) {
        Store store = new Store();

        Toy toy1 = new Toy(1, "Lego", 20, 70);
        Toy toy2 = new Toy(2, "PlayStation 5", 10, 40);
        Toy toy3 = new Toy(3, "Bionicl", 15, 30);
        Toy toy4 = new Toy(4, "Кукла", 10, 20);
        Toy toy5 = new Toy(5, "Солдатик", 50, 10);
        Toy toy6 = new Toy(6, "Человек паук", 50, 60);
        Toy toy7 = new Toy(7, "Костюм героя", 20, 30);
        Toy toy8 = new Toy(8, "Маска", 30, 70);
        Toy toy9 = new Toy(9, "Кубикрубик", 50, 80);
        Toy toy10 = new Toy(10, "Диск", 60, 20);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);
        store.addToy(toy7);
        store.addToy(toy8);
        store.addToy(toy9);
        store.addToy(toy10);

        store.changeToyChance(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы выиграли: " + prizeToy.getName() + " Осталось: " + prizeToy.getQuantity() + " штук.");
        }
    }
}
