import java.util.Scanner;

public class error {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("age");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("countryy");
        String b=sc.next();
        if(a>=18 && b.equals("Indian")){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
