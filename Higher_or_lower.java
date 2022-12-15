import java.util.Scanner;
import java.util.Random;

public class Higher_or_lower {
    public int userGuess;
    public static void main(String[] args){
        int num = new Random().nextInt(0,100_000);
        System.out.println("Guess a Number 0 - 100,000");
        int userGuess = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(num);
        while(userGuess != num){
            if(userGuess > num){
                System.out.println("Lower");
            }
            else{
                System.out.println("Higher");
            }
            userGuess = Integer.parseInt(new Scanner(System.in).nextLine());
        }
        System.out.println("Win!");
    }
}