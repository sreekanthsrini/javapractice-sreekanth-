import java.util.Scanner;

public class summa1 {
    public static void main(String[] args) {
        Scanner oi=new Scanner(System.in);
        System.out.println("enter the id");
        int stdid=oi.nextInt();
        oi.nextLine(); // Consume the newline character
        System.out.println("enter the department");
        String department=oi.nextLine();
        switch (stdid) {
            case 1:
                System.out.println("hi iam first");
                break;
            case 2:
                System.out.println("hi iam 2");
                break;
            case 3:
                System.out.println("hi iam 3");
                switch (department) {
                    case "cse":
                        System.out.println("i am cse");
                        break;
                    case "it":
                        System.out.println("iam it");
                        break;
                    default:
                        System.out.println("not found");
                        break;
                }
                break;
            default:
                System.out.println("enter valid ip");
                break;
        }
    }
}
