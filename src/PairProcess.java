import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, sum;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        //If the calculated sum is over 200, print an asterisk next to the sum.
        sum=num1+num2;
        if(sum<200){
            System.out.println("The total is "+sum+".");
        }else{
            System.out.println("The total is *"+sum+".");
        }
        System.out.println("The product of the two numbers is "+(num1*num2)+".");
        System.out.println("The average of the two numbers is "+((num1+num2)/2)+".");
    }
}
