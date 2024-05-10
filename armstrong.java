import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the number");
        int num=obj.nextInt();
        int dup=num;
        int sum=0;
        while (num>0) 
      {
        sum=sum+(num%10)*(num%10)*(num%10);
        num=num/10;
      }
      if (sum==dup) {
        System.out.println("armstrong number correct");
        
      }
      else{
        System.out.println("not a armstrong number");
      }

         
    }
    
}
