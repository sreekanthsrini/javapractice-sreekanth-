import java.util.Scanner;

public class hacker {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        if((num%2==0 && num<=2 && num>=5)||(num%2==0 && num>=20)){
            System.out.println("Not Wired");
        }
        else{
            System.out.println("Wired");
        }
    }
}