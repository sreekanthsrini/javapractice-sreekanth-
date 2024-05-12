import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayfor {
    public static void main(String[] args) {
    //    int[]value=new int[8];
       Scanner obj=new Scanner(System.in);
       System.out.print("enter your values : ");
       int[]value=new int[8];
       int i;
       for( i=0;i<value.length;i++){
        // System.out.println("it is index"+i);
        value[i]=obj.nextInt();
        

       } 
    //    System.out.println("the value is"+value[i]+" "+"the index is "+i);
    System.out.println(Arrays.toString(value));
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String[]arr=new String[5];
    int j;
    for(j=0;j<arr.length;j++){
        arr[j]=sc.next();

    }
    System.out.println(Arrays.toString(arr));
    
       
    
        
    }
    
}
