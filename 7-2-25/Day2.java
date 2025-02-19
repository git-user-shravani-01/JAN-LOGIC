import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        // Comparisions Operators
        System.out.println("3 < 9:"+(3<9));
        System.out.println("3 > 9:"+(3>9));
        System.out.println("3 <= 9:"+(3<=9));
        System.out.println("3 >= 9:"+(3>=9));
        System.out.println("3 == 9:"+(3==9));
        System.out.println("3 != 9:"+(3!=9));
        // Logical Operators
        System.out.println("(10>=11) && (2<3)"+(10>=11 && 2<3) );
        System.out.println("(21>11) && (12<32) && (2>1)"+(21>11 && 12<32 && 2>1) );
        System.out.println("(10>=11) || (2<3)"+(10>=11 || 2<3) );

        System.err.println(!true);
        System.out.println(!false);
        System.out.println(!(6>8));
        // how can user enter the input:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Input Age is:"+age);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("n:"+n);
        System.out.println("n:²"+n*n);
        System.out.println("n:² + n²"+((n*n)+(n*n)));

    }
}