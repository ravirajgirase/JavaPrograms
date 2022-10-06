import java.util.Scanner;

public class CaseCheck {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // System.out.println(input.nextLine().trim());

        char c = input.next().trim().charAt(0);
        // System.out.println(c);
        if(c>='a' && c<='z'){
            System.out.println("LowerCase");
        }
        else if(c>='A'&&c<'Z'){
            System.out.println("Upper Case");
        }
        else if(c>='0'&&c<'9'){
            System.out.println("Number");
        }


    }
}
