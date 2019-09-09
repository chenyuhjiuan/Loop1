public class Loops {

    public static void main (String arg[]){

        System.out.println("Integers from 1 to 10");
        //numbers 1 to 10
        for(int i=0; i<10; i++){
            System.out.printf(" "+(i+1));
        }
        System.out.println("");
        System.out.println("Integers from 1 to 10 backwards");
        //numbers 1 to 10 backwards
        for(int i=10; i>0; i--){
            System.out.printf(" "+i);
        }
        System.out.println("");
        System.out.println("odd number from 1-20:");
        // odd numbber from 1-20
        for(int i=1; i<20; i++){
            if(i%2!=0) {
                System.out.printf(" " + i);
            }
        }

        System.out.println("");
        System.out.println("even number from 1-20:");
        // odd numbber from 1-20
        for(int i=1; i<20; i++){
            if(i%2==0) {
                System.out.printf(" " + i);
            }
        }

        //from the input number to 1
        System.out.println("");
        System.out.println("from the input number to 1:");


    }
}
