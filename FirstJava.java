import java.util.Scanner;

public class FirstJava{
    
    public static void main(String[] args) {
        System.out.print("hello Java");

        Scanner input = new Scanner(System.in);
        // System.out.println(input.nextLine());
        int a = input.nextInt();
        System.out.println("num is : "+a);
    }
}