public class OOPs1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person p1 = new Person(18, "Noel");
        p1.age = 18;
        p1.name = "Noel";
        Person p2 = new Person(19, "Dason");
        p2.name = "Dason";
        System.out.println(p1.age + " " + p1.name);
        p1.eat();
        p2.walk();
        p1.walk(5);
        Developer d1 = new Developer(21, "Raj");
        d1.walk();
    }
}
class Person {
    String name;
    int age;
    void walk(){
        System.out.println(name + " is walking");
    }
    void eat (){
        System.out.println(name + " is eating");
    }
    void walk(int steps){
        System.out.println(name +  " walked " + steps + " steps" );
    }
    static int count;
    public Person(int age, String name) {
        count ++;
        this.name = name;
        System.out.println(count);
    }
}
class Developer extends Person {
    public Developer(int age, String name){
        super(age, name);
    }
    void walk(){
        System.out.println("Developer " + name + " is walking");
    }
}