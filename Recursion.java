public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(fibonacci(6));
    }
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        
        for (int i = 3; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
