import java.util.*;

public class Array1 {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // int[] arr = new int[5];
        // String []str = new String[5];
        // // String[] str = new String[5];
        //  for(int i=0;i<str.length;i++){
        //     str[i] = cin.next();
        //  }
        //  for(String s:str){
        //     System.out.print(s + " ");
        //  }
        //  for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println(arr.length);
        // print(arr,arr.length);
        // System.out.print(Arrays.tostring(arr));

        // int [][]arr = new int[3][3];
        // System.out.println("Enter Array elements :  ");
        // for(int row=0; row<arr.length;row++){
        //     for (int col=0;col<arr[row].length;col++){
        //         arr[row][col]=cin.nextInt();
        //     }
        // }

        // for(int row=0; row<arr.length;row++){
        //     for (int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //         }
        //         System.out.println(" ");
        // }
        // String []str={"hi ","hello","okay"};
        // for(int[] num:arr){
            // System.out.print(Arrays.toString(str));
        // }

        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.remove(2);
        list.set(1,1);
        System.out.print(list.get(1));
    }
    static void print(int arr[],int size){
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

   
    
}
