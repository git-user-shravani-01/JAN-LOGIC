import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        Example 1
        System.out.println("Example 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int  num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
               System.out.println("Invalid case");
        }
        //Example 2
        System.out.println("Example 2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scan.nextInt();
        System.out.println("Enter b:");
        int b = scan.nextInt();
        System.out.println("Enter the operation:");
        String op = scan.next();

      switch (op.charAt(0)) {
        case '+':
            System.out.println("Addition: " +(a+b));
            break;
        case '-':
            System.out.println("Subtraction: " +(a-b));
            break;
        case '*':
            System.out.println("Multiplication: " +(a*b));
            break;
        case '/':
            if(b==0)
                System.out.println("It can't Divide");
            else
            System.out.println("Division: " +(a/b));
            break;
      }
      System.out.println("Example 3");
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Character: ");
      String ch = scan.next();
      switch(ch){
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
            System.out.println("Vowels");
            break;
        case "!":
        case "@":
        case "#":
        case "$":
        case "%":
        case "^":
        case "&":
            System.out.println("Special Characters");
            break;
        default :
            System.out.println("Consonant");
            break;
      }

    }
}