import java.util.Scanner;

public class calcswich {
    public static void main(String[] args) {
        int a=12;

        int result=0;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the operator");
        String operator=in.next();
        System.out.println("enter the num 1");
        int num1=in.nextInt();
        System.out.println("enter the number 2");
        int num2=in.nextInt();
        // while(a>=100){
        switch (operator) {
            case "+":
            result=num1+num2;
            break;
            case "-":
            result=num1-num2;
            break;
            case "*":
            result=num1*num2;
            break;
            case "/":
            result=num1/num2;
            break;

            default:
            System.out.println("enter the valid input");
                break;
        }
       
    
        System.out.println(result);



        
    }
    
}
