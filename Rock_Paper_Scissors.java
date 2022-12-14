import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.print("Rock - 1 \nPaper - 2\nScissors - 3\nEnter your choice:"); // prints options
        String userInput = new Scanner(System.in).nextLine(); // Gets input that we don't need
        List<String> list = Arrays.asList("Win", "Lose", "Tie"); // 3 options of winning
        String randomChoice = list.get(new Random().nextInt(list.size())); // Gets random choice of the size of list
        System.out.println(randomChoice); // prints choice
    }
}