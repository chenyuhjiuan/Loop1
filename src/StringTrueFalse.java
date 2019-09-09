import java.util.Scanner;

public class StringTrueFalse {

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        boolean redEyes = false;
        String response ="y";

        while(!response.equalsIgnoreCase("n")) {


                System.out.println("Are your eyes red?");
                response = input.nextLine();

                if (response.equalsIgnoreCase("y")) {
                    redEyes = true;

                } else {
                    redEyes = false;
                }

                if (redEyes == true) {
                    System.out.println("get some sleep");
                } else {
                    System.out.println("you look great.");
                }

                System.out.println("Do you want to try again?");
                response = input.nextLine();
                System.out.println("Response is [" + response + "]");


        }

        System.out.printf("Goodbye!");
    }
}
