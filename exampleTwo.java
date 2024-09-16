import java.util.Scanner;

public class exampleTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Your name is: " + name);

        sc.nextLine();

        System.out.print("Enter your fullname: ");
        String fullname = sc.nextLine();
        System.out.print("Your full name is:" + fullname);

        sc.close();
    }
}