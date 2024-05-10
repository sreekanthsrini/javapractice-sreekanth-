import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println("welcome to the game");
        System.out.println("enter the number:");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(3) + 1;

        // Print the random number
        System.out.println("Random number between 1 and3 : " + randomNumber);
        if(num==randomNumber){
            System.out.println("congrazz you won");
        }
        else{
            System.out.println("better luck nexttime");
        }
    }
}

