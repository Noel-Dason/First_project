import java.util.Arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
        int[] arr = {1, 23, 44, 34, 11, 23};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
