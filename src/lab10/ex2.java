package lab10;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        //max
        int max = Max(10,20);
        System.out.println("The maximum number is : "+max);

        //min
        System.out.println("The maximum number is : "+Min(10,20));
        //Multiple
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter an integer 1: ");
        int num2 = SC.nextInt();

        int num1 = 0;
        String num;
        System.out.println("THe multiple value is :"+ num1);
  }

    private static int Multiple(int num1, int num2) {

        return num1*num2;
    }

    private static int Min(int X, int y) {
        int rs;
        if (X <y)
            rs = X;
        else
            rs = y;
        return rs;
    }
    private static int Max(int X, int y) {
        int rs;
        if (X >y)
            rs = X;
        else
            rs = y;
        return rs;
    }

}



