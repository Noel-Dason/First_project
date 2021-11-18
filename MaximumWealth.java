public class MaximumWealth {
    public static void main(String[] args) {
        int [][] num = {
                {1, 2, 3},
                {2,3,3},
                {2,2,1}
        };
        System.out.println(placeholder(num));
    }
    static int placeholder(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowsum+= arr[i][j];
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }
}
