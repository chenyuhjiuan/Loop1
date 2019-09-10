import java.util.Scanner;

public class WithArrayGradeSum {

    public static void main(String arg[]){

        int sum =0;
        double avg=0;
        int numStu =3;
        int [] grades = new int[numStu];
        String userInp="";
        Scanner sc = new Scanner(System.in);
        boolean quit=false;

        for(int i=0;i<grades.length;i++){
            System.out.println("Enter a grade: ");
            grades[i]=sc.nextInt();
            sum+=grades[i];
            userInp =sc.nextLine();
            System.out.println("Press 'q' to quit or other key to continue.");
            userInp= sc.nextLine();
            if(userInp.equalsIgnoreCase("q")){
                break;
            }
            //sum +=grades[i];
            avg=sum/numStu;
            System.out.println(""+avg);
        }

        //avg=sum/numStu;
        //System.out.printf(""+avg);
    }
}
