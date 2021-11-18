public class Main {

    public static void main(String[] args) {
        Def m1 = new Def();
        m1.fun();
    }
}
class Def {
    Def() {
        System.out.println("Default constructor");
    }

    public void fun() {
        System.out.println("Method of class");
    }
}