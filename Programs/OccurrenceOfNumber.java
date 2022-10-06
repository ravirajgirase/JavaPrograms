import java.util.Scanner;
public class OccurrenceOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = input.nextInt();
        // System.out.println("Enter occurrence number  : ");
        // int key = input.nextInt();
        int count=0;
        int rem;
        while(num >0){
            rem = num%10;

            if(rem==5){
                count++;
            }
            num = num / 10;


        }
        System.out.println(count);
    }
    
}
