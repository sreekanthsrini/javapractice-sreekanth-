// import java.util.Arrays;

// public class arrayswap {
//     public static void main(String[] args) {
//         int[]arr={1,3,4,5,7};
//         swap(arr,1,3);
//         // System.out.println(Arrays.toString(arr));

//     }
//     static void swap(int[]arr,int index1, int index2){
//         int temp=arr[index1];
//         arr[index1]=arr[index2];
//         arr[index2]=temp;
//         System.out.println(Arrays.toString(arr));
//     }
    
//  }

// import java.util.Arrays;

// import java.util.Arrays;

// public class arrayswap {

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 5, 67, 6};

//         // Swapping arr[2] (5) and arr[4] (6)
//         int temp = arr[2];
//         arr[2] = arr[4];
//         arr[4] = temp;

//         // Print the array to show the swapped values
//         System.out.println(Arrays.toString(arr));
//     }
// }
import java.util.Arrays;

public class arrayswap {

    public static void main(String[] args) {
        int[]arr={2,4,5,67,6};
         int swp1=arr[2];   //here 5 change as 6
        int swp2=arr[4];     //here value 6 change as 5
        int temp=swp1;
        swp1=swp2;
        swp2=temp;
       System.out.println(Arrays.toString(arr));
        
    }
}