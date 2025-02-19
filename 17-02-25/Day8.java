import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // switch(num) {
        //     case 1 -> System.out.println("One");
        //     case 2 -> System.out.println("Two");
        //     case 3 -> { System.out.println("Three");
        //                 System.out.println("3: Three");
        //               }
        //     default ->  System.out.println("Invalid input!");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter SSC Marks: ");
        // double SSC = sc.nextDouble();

        // if(SSC >= 35){
        //     System.out.print("Enter HSC Marks:");
        //     double HSC = sc.nextDouble();
        //     if(HSC > 35){
        //         System.out.println("Eligible for placement!");
        //     }else{
        //         System.out.println(" Not Eligible for placement!");
        //     }
        // }else{
        //     System.out.println("Eligible for placement!");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a username:");
        // String username = sc.next();
        // System.out.println("Enter a Password:");
        // String password  = sc.next();

        // if("admin".equals(username)){
        //     if ("1234".equals(password)) {
        //         System.out.println("Login Successfully!");
        //     }else{
        //         System.out.println("Incorrect Password!");
        //     }
        // }else{
        //     System.out.println("Invalid username");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();

        String ans =(a % 2 == 0) ? "even" : "odd";
        System.out.println("Number is "+ans);
    }
}