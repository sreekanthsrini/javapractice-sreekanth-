import java.util.Arrays;
import java.util.Scanner;

public class practicearray {
    public static void main(String[] args) {
        
        System.out.println("enter your string");
        String[]value=new String[3];
        Scanner obj=new Scanner(System.in);
        int i;
        for(i=0;i<value.length;i++){
            value[i]=obj.next();
        }
        System.out.println("the name"+value[0]);
        System.out.println("the index is"+i);
        System.out.println(Arrays.toString(value));
        value[2]="yasree";
        System.out.println(Arrays.toString(value));

    }
    
}
