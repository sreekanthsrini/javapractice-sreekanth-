import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        System.out.println("enter your input");
        Scanner ob1=new Scanner(System.in);
        char ch=ob1.next().trim().charAt(0);
        if (ch>='a' && ch<='z') {
            System.out.println("it is lower case");

            
        }
        else if(ch>='A'&& ch<='Z'){
            System.out.println("it is upper case");

        }
        else{
            System.out.println("bye bye");
        }
    }
    
}
