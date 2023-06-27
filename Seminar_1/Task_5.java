// Дан массив nums = [3,2,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному,
// нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива 
// должны быть отличны от заданного, а остальные - равны ему.

package Seminar_1;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args){
        int[] nums = {3, 2, 5, 3};
        int[] nums2 = {3, 3, 3, 3};
        int val = 3;
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums2[count] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
}
  

// static int[] Task5(int val, int[] arr) {
//         int[] arrVal = new int[arr.length];
//         Arrays.fill(arrVal, val);

//         int pos = 0;
//         for (int i = 0; i < arrVal.length; i++) {
//             if (arr[i] != arrVal[i]){
//                 arrVal[pos] = arr[i];
//                 pos++;
//             }
//         }

//         return arrVal;