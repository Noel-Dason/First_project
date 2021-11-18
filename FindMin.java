public class FindMin {
    public static void main(String[] args) {
        int[] num = {11, 23, 34, 50, 43, 67, 10, 28, 47};
        int minimum = min(num);
        System.out.println(minimum);
    }

    static int min(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }

        }
        return minimum;
    }
}
