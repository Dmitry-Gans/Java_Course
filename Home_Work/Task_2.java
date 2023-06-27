package Home_Work;

public class Task_2 {
    public static void main(String[] args){
        // Вывести все простые числа от 1 до 1000
        simple_value1000(1000);
    }
    static void simple_value1000(int n){
        n = 1000;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0){
                builder.append(i).append('\n');
            }
        }
        System.out.println(builder);
    }
}
