import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int ans=0;
        while (true) {

            System.out.println("enter the operator");
        
            char op=obj.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.print("enter the num1:");
                int num1=obj.nextInt();
                System.out.print("enter the num2:");
                int num2=obj.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if (op=='-') 
                {
                    ans=num1-num2;

                    
                }
                if (op=='*') {
                ans=num1*num2;
                    
                }
                if (op=='/') 
                {
                    if(num2!=0){
                        ans=num1/num2;
                    }
                    
                }
                if (op=='%') {
                    if(num2!=0){
                        ans=num1%num2;
                    }
                    
                }
                

                else if(op=='x'||op=='X'){
                    break;
                }
                else{
                    System.out.println("invalid statement");
                }
                System.out.println(ans);

            }

            
        }
        
    }
}

    

