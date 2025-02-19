public class Day4 {

    public static void main(String[] args) {
        //negation:
        System.out.println("(~4):"+((~4)));
        //Left shift :
        System.out.println("9 << 3:"+(9 << 3));
        System.out.println("14 << 5:"+(14 << 5));
        System.out.println("6 << 3:"+(6 << 3));
        //Right Shift:
        System.out.println("27 >> 2:"+(27 >> 2));
        //Swapping:-
        int a=3;
        int b=4;
         System.out.println("a:"+a);
         System.out.println("b:"+b);

         int temp= a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("temp:"+temp);
        //swap 2:
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        //Swap 3:-
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        //swap 4:-
        a=a^b; // a=0111 => 7
        b=a^b; // b=0011 => 3
        a=a^b; //a=0100 => 4
        System.out.println("a:"+a);
        System.out.println("b:"+b);



    }
}