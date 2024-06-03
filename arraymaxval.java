// public class arraymaxval {
//     public static void main(String[] args) {
//         int[]arr={100,32,44,55,3};
//         maxval(arr ,2,4);
//         System.out.println(maxval(arr, 0, 4));
//     }
//     static int maxval(int[]arr,int start,int end){
//         int maxval=arr[start];
//         for(int i=3;i<end;i++){
//             if(arr[i]>maxval){
//                 maxval=arr[i];
//             }
//         }
//         return maxval;
//     }
    
// }

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arraymaxval {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
    
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //  maxval(arr, 0,5);
        System.out.println(maxval(arr, 1, 3));

    
    }
    static int maxval(int arr[],int start,int end){
        int maxval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
                
            }

            
           
            
        }
        return maxval;
       
        
    
        
        

    }
}