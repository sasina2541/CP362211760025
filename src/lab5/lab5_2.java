package lab5;

import java.util.Scanner;

public class lab5_2 {


    public static  void main (String[]args){
        Scanner SC = new Scanner(System.in);
        final  double PI = 3.141;

        System.out.println("Enter r: ");
        double r = SC.nextDouble();

        double C = 2 * PI * r;
        System.out.println("Circle round: " + C);

        double v = (4/3)*PI*r*r*r;
        System.out.println("ปริมาตรทรงกลม: " + v);


    }
}
