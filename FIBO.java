import java.util.Scanner;

public class FIBO {
    public static void main(String[] args) {
        Scanner ob1=new Scanner(System.in);
        int n= ob1.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=n) {
            int temp=b;
            b=b+a;
            a=temp;
            count++;

            
        }
        System.out.println(a);
        System.out.println(b);
        // System.out.println(count);
    }
    
}
