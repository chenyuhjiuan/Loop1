import java.util.Scanner;

public class GradeSum {

    public static void main (String arg[]){

        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;
        System.out.printf("Please enter the student's integers: ");
        // Loop should start here
        for(int i=0;i<20; i++) {
            num = keyboard.nextInt();
            System.out.printf("Next one please: ");

            total += num;


            // Loop should end here
        }
        System.out.println("The average of all 20 grade is " + (total/20));


    }
}
