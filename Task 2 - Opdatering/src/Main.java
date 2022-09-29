import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Please type your name ");
        String name = in.nextLine();
        System.out.println("Your name is: " + name);

        System.out.print("Please type your age ");
        int age = in.nextInt();
        System.out.println("Your age is: " + age);

        int result = 67;
        System.out.println("You can retire in " + (result - age) + " years");

        in.close();
    }

} 