// Дан массив двоичных чисел, 
// например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package Seminar_1;

public class Task_2 {
    public static void main(String[] args){
        Task_2();
    }

    int[] arrr = {1,1,0,1,1,1};
    int maxOnes = 0;
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == 1){
            temp++;
        } else {
            if(temp > maxOnes){
            maxOnes = temp;}
            temp = 0;
        }
    }
    if(temp > maxOnes){
        maxOnes = temp;
    }
    System.out.println(maxOnes);
}

// static void task1(){
//         /*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/
//         int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
//         int maxOnes = 0;
//         int temp = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == 1){
//                 temp++;
//             } else {
//                 if (temp > maxOnes){
//                 maxOnes = temp;}
//                 temp = 0;
//             }
//         }
//         if(temp > maxOnes){
//             maxOnes = temp;
//         }
//         System.out.println(maxOnes);
//     }