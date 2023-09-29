package Сontrol_work;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Store {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private String prizeFile;

    public Store() {
        toys = new ArrayList<Toy>();
        prizeToys = new ArrayList<Toy>();
        prizeFile = "Сontrol_work\\prize_toys.txt";
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeToyChance(int toyId, double newChance) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setChance(newChance);
            }
        }
    }

    public void organizeRaffle() {
        prizeToys.clear();
        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getChance()) {
                prizeToys.add(toy);
            }
        }
    }

    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
            try {
                FileWriter writer = new FileWriter(prizeFile, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи!");
            }
            return prizeToy;
        } else {
            System.out.println("Игрушки закончились!");
            return null;
        }
    }
}
