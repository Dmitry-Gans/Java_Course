package Seminar_3;

public class Task_1 {
    public static void main(String[] asgs){
    // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

    String s1 = "hello";

    String s2 = "hello";

    String s3 = s1;

    String s4 = "h" + "e" + "l" + "l" + "o";

    String s5 = new String("hello");

    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    
    System.out.println(s1.equals(s2));
    System.out.println(s2.equals(s3));
    System.out.println(s3.equals(s4));
    System.out.println(s4.equals(s5));
    System.out.println(s5.equals(s6));
    }
    
}
