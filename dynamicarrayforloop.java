import java.util.ArrayList;
import java.util.Scanner;

public class dynamicarrayforloop {
    public static void main(String[] args) {
        ArrayList<Integer>values=new ArrayList<>(5);
         Scanner sc=new Scanner(System.in);int i;
         for( i=0;i<5;i++){
             values.add(sc.nextInt());
             }
             for(i=0;i<5;i++){
             System.out.print(values.get(i));
             }
         
    }
    
}
