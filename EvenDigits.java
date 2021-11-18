public class EvenDigits {
    public static void main(String[] args) {
        int[] num = {18, 114,9,1768,98,1};
        int answer = ans(num);
        System.out.println(answer);

    }
    static int ans(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        if(count%2 == 0){
            return true;
        }
        return false;
    }
}
