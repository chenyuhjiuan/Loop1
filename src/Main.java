import java.util.Scanner;
/*
* Write a program that will prompt the teacher to enter in the grade. Calculate the sum of those
* numbers, and calculate the average. Display the average to the user. Allow the user to quit if they type in ""quit".
*/
public class Main {

    public static void main (String arg[]){
        int grade =0;
        int sum =0;
        double avg=0;
        int numStu =20;
        String userInp="";
        Scanner sc = new Scanner(System.in);
        boolean quit=false;

        for(int i=0;i<numStu;i++){
            System.out.printf("Enter a grade: ");
            userInp =sc.nextLine();
            sum+= grade;

            sc.nextLine();
            System.out.printf("Press \"quit\" to exit or "+"any other key to continue.");
            userInp =sc.nextLine();
            if(userInp.equalsIgnoreCase("quit")){
                quit =true;
                System.out.printf("Exiting loop");
                break;
            }
            if(!quit){
                avg=sum/numStu;
                System.out.printf("Calculating average of grades..."+ avg);
            }else {
                System.out.printf("Please enter a valid grade.");
            }

        }
    }
}
