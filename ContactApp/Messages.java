package ContactApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Messages {
    Scanner in = new Scanner(System.in);
    ArrayList<String> messages = new ArrayList<String>();
    public void first(){
        messages.add("Hello");
        messages.add("Hi");
        messages.add("Yoo");
        messages.add("Bye");
    }
    public void messageList(){
        System.out.println(messages.toString());
    }
    public void sendMessage(){
        System.out.println("Type a message");
        String newMessage = in.next();
        messages.add(newMessage);
        System.out.println("Your message "+ newMessage + " has been added");
    }
}
