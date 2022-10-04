import java.util.Scanner;

public class LargestNum{

    public static void main(String[] args){
        System.out.println("Enter Three Numbers : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = Math.max(c,Math.max(a, b));

        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }

        System.out.println("Max num is : "+max);

    }
}