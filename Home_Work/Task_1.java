package Home_Work;

public class Task_1 {
    public static void main(String[] args){
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n),
        // n! (произведение чисел от 1 до n)
        valueN(10);
    }
    static void valueN(int n){
        n = 10;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
