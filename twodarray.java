import java.util.Arrays;
import java.util.Scanner;

public class twodarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]nums=new int[3][3];
        // int a;
        for(int row=0;row<nums.length;row++){
            for(int column=0;column<nums[row].length;column++){
                nums[row][column]=sc.nextInt();

            }
        }


        // output
        // for(int row=0;row<nums.length;row++){
        //     for(int column=0;column<nums[row].length;column++){
        //         System.out.print(nums[row][column]+" ");
        //     }
            // to print in matrix form properly use print and println
            // System.out.println();
            
        // }
        // print using to string method
        // for(int row=0;row<nums.length;row++){
        //     System.out.println(Arrays.deepToString(nums));
        // }
        // we can also print using enhanced for loop
        for(int[] a :nums){
            System.out.println(Arrays.toString(a));
        }

    }
    // we can also print the array using mishmatch collums like{{123}{12}{345566}}
}