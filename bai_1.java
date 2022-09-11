package Bai_on_tap;
import java.util.Arrays;
public class bai_1 {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6};
        int[] arr2 = {7,8,9};
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int pos = 0;
        for(int elemen : arr1){
            result[pos] = elemen;
            pos++;
        }
        for(int elemen : arr2){
            result[pos] = elemen;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
