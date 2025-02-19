import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //IF-ELSE LADDER:-(IF,ELSE-IF,ELSE-IF,ELSE)
        System.out.println("Enter a number : (1-7):");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("Monday");
        }
        else if(num == 2){
                System.out.println("Tuesday");
        }
        else if(num == 3){
            System.out.println("Wednesday");
        }
        else if(num == 4){
            System.out.println("Thursday");
        }
        else if(num == 5){
            System.out.println("Friday");
        }
        else if(num == 6){
            System.out.println("Saturday");
        }
        else if(num == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid Input!");
        }
        // Eg:- 2 -Yearly Income:-
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Yearly Income:-");
        double annualIncome = sc.nextDouble();

        if(annualIncome < 500000){
            System.out.println("No Tax");
        }
        else if (annualIncome >= 500000 && annualIncome <1000000) {
            double tax = (annualIncome)*0.02;
            System.out.println("Tax Amount : "+tax);
        }
        else if (annualIncome >= 1000000 && annualIncome <2000000) {
            double tax = (annualIncome)*0.05;
            System.out.println("Tax Amount : "+tax);
        }
        else{
            double tax = (annualIncome)*0.07;
            System.out.println("Tax Amount :" +tax);
        }
        // Eg:- 3- Quadrant checking:
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x:-");
        int x= sc.nextInt();
        System.out.print("Enter y:-");
        int y= sc.nextInt();
        if( x>0 && y>0){
            System.out.println("The point lie in the first quadrant");
        }
         else if( x<0 && y>0){
            System.out.println("The point lie in the Second quadrant");
        }
        else if( x<0 && y<0){
            System.out.println("The point lie in the Third quadrant");
        }
        else if( x>0 && y<0){
            System.out.println("The point lie in the fourth quadrant");
        }
        else if( x==0 && y==0){
            System.out.println("The point lie in origin");
        }
        else if( x==0){
            System.out.println("The point lie in y-axis");
        }
        else if( y==0){
            System.out.println("The point lie in x-axis");
        }
        else{
            System.out.println("Invalid Input!");
        }
        
    }
}