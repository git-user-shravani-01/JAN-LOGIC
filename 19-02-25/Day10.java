import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        
        // int num=5;
        // int i=0;
        // while (i<=50) {
        //     i+=num;
        //     if (i==25) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an even Number : ");
        // int n = sc.nextInt();
        // while (n % 2 == 0) {
        //     System.out.println("Number :"+n);
        //     System.out.println("Enter an even Number:-");
        //     n = sc.nextInt();
        // }
        // System.out.println("Oops! It's not an even number");

        Scanner sc = new Scanner(System.in);
        System.out.print("To unclock Enter Password : ");
        int pass = sc.nextInt();
        int count = 1;
        while (pass != 1974) {
            count++;
            if(count == 5){
                System.out.println("Your Device is Locked for 1 Day"); 
                break;
            }
            System.out.println("\n Wrong Passkey :"+pass);
            System.out.print("Please Try Again:");
            pass = sc.nextInt();
        }
        if(count < 5){
            System.out.println("Device Unlocked");
        }
    }

}