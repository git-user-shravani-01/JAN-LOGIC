public class DAY1 {

    public static void main(String[] args) {
        
        System.out.println("hello");
        // Arthmetic Operations:(+,-,*,/,%)
        System.out.println("Add:"+(20+5));
        System.out.println("Sub:"+(20-5));
        System.out.println("Multi:"+(20*5));
        System.out.println("Quoe:"+(20/5));
        System.out.println("Rem:"+(20%5));

        // Total surface area = 2*(lb+bh+hl)
        int l=30;
        int b=20;
        int h=10;
        int formula = 2*(l*b+b*h+h*l);
        System.out.println("TSA:"+ formula+" cm.sq");

        // Area of Circle = 3.14*r^2
        int r=8;
        double Area = 3.14*r*r;
        System.out.println("Area of Circle :"+Area+" cm.sq");

        // Volume of Cylinder = 3.14*r^2*h
        int ra=4;
        int he=6;
        double Volume= 3.14*ra*ra*he;
        System.err.println("Volume of Cylinder:"+Volume+" cm.sq");

        //Mechnical Energy,Kinetic energy and potential energy.
        double m=12.5;
        double v=10;
        double hei= 100;
        double g= 9.8;
        //Kinetic Energy = 1/2*m*v^2
        double KE = 0.5*m*v*v;
        //Potential Energy = m*g*h
        double PE = m*g*h;
        // Mechincal energy = K.E + P.E
        double ME= KE + PE;

        System.err.println("Total Energy (ME)=" +ME+" Joules");




    }
}