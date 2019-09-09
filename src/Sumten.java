import java.util.Scanner;

public class Sumten {

    public static void main (String arg[]){
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;
        System.out.printf("Please enter ten integers: ");
        // Loop should start here
        for(int i=0;i<10; i++) {
            num = keyboard.nextInt();
            System.out.printf("Next one please: ");

            total += num;
            // Loop should end here
        }
        System.out.println("The total of all 10 numbers is " + total);
    }
}
