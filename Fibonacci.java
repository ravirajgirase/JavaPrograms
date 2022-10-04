import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0 ,b=1,c=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(a +" "+b);
        // for(int i=2;i<=10;i++){
        //     c=a+b;
        //     a=b;
        //     b=c;
        //     System.out.print(" "+ c);
        // }
        int count=2;
        while(count<=n){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            count++;
        }
    }
}
