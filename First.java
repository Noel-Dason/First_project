

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
//        System.out.println("Hey how are you?");
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());

//        if (true) {
//            System.out.println("Hello world");
//        }
//        int count = 1;
//        while(count<=5){
//            System.out.println(count);
//            count++;
//            }
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter temperature in C");
//        float tempC = input.nextFloat();
//        float tempF = tempC*9/5 + 32;
//        System.out.println("The temperature in F is "+ tempF);
//        int salary = 24000;
//        if (salary>10000){
//            salary += 2000;
//        }
//        else {
//            salary+= 1000;
//        }
//        System.out.println(salary);
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int num = 1;
////        for(int num=1; num<=n; num++) {
////            System.out.println(num);
////        }
//        do {
//            System.out.println(num);
//            num++;
//        }while (num<=n);
//    Scanner in = new Scanner(System.in);
//    int a = in.nextInt();
//    int b = in.nextInt();
//    int c = in.nextInt();
//    if(a>b && a>c){
//        System.out.println("a is the largest no.");
//    }
//    else if (b>a && b>c){
//        System.out.println("b is the largest no.");
//    }
//    else{
//        System.out.println("c is the largest no.");
//    }
//    int max = a;
//    if(b>max){
//        max= b;
//    }
//    if (c>max){
//        max = c;
//    }
//        System.out.println(max);
//    char ch= in.next().trim().charAt(0);
//    if (ch >= 'a' && ch<='z'){
//        System.out.println("It is a lower case character");
//    }
//    else if(ch >= 'A' && ch<= 'Z'){
//        System.out.println("It is a upper case character");
//    }
//    int n = in.nextInt();
//    int a = 0;
//    int b = 1;
//
//        for (int i = 1; i <= n; i++) {
//           int sum = a;
//            a = a+b;
//            b = sum;
//        }
//        System.out.println(a);
//         long n = in.nextLong();
//         int count = 0;
//    while(n>0){
//         long rem = n%10;
//         if(rem == 3){
//             count++;
//         }
//         n= n/10;
//
//        }
//        System.out.println(count);
//        int ans = 0;
//     Scanner in = new Scanner(System.in);
//     int n = in.nextInt();
//     while (n>0){
//         int rem = n%10;
////         System.out.print(rem); type 1
//          ans = ans* 10 + rem;
//         n=n/10;
//     }
//        System.out.println(ans); type 2
//    Scanner in = new Scanner(System.in);
//    char op = in.next().trim().charAt(0);(Calculator)
//    int a = 0;
//    int b = 0;
////        System.out.println("Enter an operator");
////        char op = in.next().trim().charAt(0);
//    while(true){
////        System.out.println("Enter a operator");
//        System.out.println("Enter an operator");
//        char op = in.next().trim().charAt(0);
//        if(op == '+' || op == '-'|| op== '*' || op == '/' || op =='%' ){
//            System.out.println("Enter two numbers");
//             a = in.nextInt();
//             b = in.nextInt();
//        }
//        else if(op == 'x' || op == 'X'){
//            break;
//        }
//        else {
//            System.out.println("The operation is invalid");
//        }
//        if(op == '+'){
//            System.out.println(a + b);
//        }
//        if(op == '-'){
//            System.out.println(a - b);
//        }
//        if(op == '*'){
//            System.out.println(a * b);
//        }
//        if(op == '/' && b == 0){
//            System.out.println("INFINITE");
//        }
//        else if(op == '/' ){
//            System.out.println(a/b);
//        }
//        if(op == '%'){
//            System.out.println(a % b);
//        }
//
//
//    }
//    int n = in.nextInt(); (Factorial)
//    int factorial = 1;
//    if(n==0){
//        System.out.println(1);
//    }
//       else {
//            while (n > 0) {
//                factorial = factorial * n;
//                n--;
//            }
//            System.out.println(factorial);
//        }
//    Scanner in = new Scanner(System.in);
//    String fruit = in.next();
//        switch (fruit) {
//            case "Apple" -> System.out.println("Red fruit");
//            case "Mango" -> System.out.println("King of fruits");
//            case "Banana" -> System.out.println("Yellow fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Enter valid fruit");
//        }
//    int day = in.nextInt();
//    switch (day) {
//        case 1 -> System.out.println("Monday");
//        case 2 -> System.out.println("Tuesday");
//        case 3 -> System.out.println("Wednesday");
//        case 4 -> System.out.println("Thursday");
//        case 5 -> System.out.println("Friday");
//        case 6 -> System.out.println("Saturday");
//        case 7 -> System.out.println("Sunday");
//        default -> System.out.println("Enter valid day");
//    }
//        int empID= in.nextInt();
//        String department = in.next();
//        switch (empID){
//            case 1:
//                System.out.println("Noel Dason");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("Enter valid department");
//                }
//                break;
//            case 2:
//                System.out.println("Rohan");
//                break;
//            case 3 :
//                System.out.println("Raj");
//                break;
//            default:
//                System.out.println("Enter valid empID");
//        }


//        System.out.println(greet());
        System.out.println(sum(43,26));
    }
//    static String greet (){
//        String greeting = "How are you?";
//        return greeting;
//    }
    static int sum(int a , int b) {
    return  a + b;
    }

}