package Home_Work;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Laptop l1 = new Laptop("Acer", 2, 128, "Windows 10", "Silver");
        Laptop l2 = new Laptop("MSI", 4, 256, "Windows 11", "Red");
        Laptop l3 = new Laptop("Asus", 32, 512, "Windows 10", "Black");
        Laptop l4 = new Laptop("Lenovo", 16, 256, "Windows 11", "Blue");

        System.out.println("Выберите фильтр для поиска ноутбука: \n"+
        "1 - сортировка по ОЗУ \n" +
        "2 - сортировка по SSD \n" +
        "3 - сортировка по OS \n" +
        "4 - сортировка по цвету \n" +
        "5 - сортировка по бренду");

        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if(ram >=32){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(ram < 32){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ram < 16 ){
                System.out.printf(l1.toString() + "\n" + l2.toString());
            }else if(ram < 4){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет");

        }else if(choice == 2){

            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if(ssd >=512){
                  System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(ssd < 512){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ssd < 256){
                System.out.printf(l1.toString() + "\n" + l2.toString());
            }else if(ssd < 128){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет");

        }else if(choice == 3){

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if(os.equals("Windows")){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(os.equals("Windows 10")){
                System.out.printf(l1.toString() + "\n" + l3.toString());
            }else if(os.equals("Windows 11")){
                System.out.printf(l2.toString() + "\n" + l4.toString());
            }else System.out.println("Таких ноутбуков нет");
            sc1.close();

        }else if(choice == 4){

            System.out.println("Введите цвет");
            Scanner sc1 = new Scanner(System.in);
            String col = sc1.nextLine();
            if(col.equals("Silver")){
                   System.out.printf(l1.toString());
            }else if(col.equals("Red")){
                System.out.printf(l2.toString());
            }else if(col.equals("Black")){
                System.out.printf(l3.toString());
            }else if(col.equals("Blue")){
                System.out.printf(l4.toString());
            }else System.out.println("Таких ноутбуков нет");
            sc1.close();
                
        }else if(choice == 5){

            System.out.println("Введите бренд");
            Scanner sc1 = new Scanner(System.in);
            String brend = sc1.nextLine();
            if(brend.equals("Acer")){
                System.out.printf(l1.toString());
            }else if(brend.equals("MSI")){
                System.out.printf(l2.toString());
            }else if(brend.equals("Asus")){
                System.out.printf(l3.toString());
            }else if(brend.equals("Lenovo")){
                System.out.printf(l4.toString());
            }else System.out.println("Таких ноутбуков нет");
            sc1.close();
            }
                
        sc.close();
    }

}
