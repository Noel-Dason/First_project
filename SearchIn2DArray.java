import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {15, 12, 3, 4},
                {78,99 ,34,56},
                {13,24}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr,target)));
    }

     static int[] search(int[][] arr, int target) {
         for (int i = 0; i < arr.length ; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 int element = arr[i][j];
                 if (target == arr[i][j]){
                     return new int[]{i,j};
                 }
             }
         }
         return new int[]{-1};
    }
}
