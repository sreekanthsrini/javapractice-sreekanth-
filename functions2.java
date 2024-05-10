import java.util.Scanner;

public class functions2 {
    public static void main(String[] args) {
        
        int a=sum();
        System.out.println(a);
        String b=name();
        System.out.println(b);
        System.out.println("parameter passes");
        sum2(5, 7);
        
    }
    static int sum(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter num 1");
        int num1=ob.nextInt();
        System.out.println("enter num 2");
        int num2=ob.nextInt();
        int ans=num1+num2;
        return ans;
    }
    static String name(){
        return "vanakam";
    }
    static void sum2(int a,int b) {
        int ans =a+b;
        System.out.println(ans);

    }
    
}
