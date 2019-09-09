import java.util.Scanner;

public class EndlessStrings {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.printf("Please enter a word: ");
        userInput = keyboard.next();

        while (userInput != "") {
            System.out.println("Thank you for entering the word of "+userInput+".");
            break;


        }

    }
}
