package lab7;

import java.util.Scanner;

public class ex5 {

    public static void main (String[]args)
        Scanner sc = new Scanner(System.in);
    int totalEven = 0;
    int totalOdd = 0,
    int X =0;
    for (int i = 0; i < 10; i++) {

        System.out.print("Enter an integer: ");
        X = sc.nextInt();
        if (X%2 ==0)
            totalEven += X; //total = total+x;
        else
            totalOdd += X;



        System.out.println("Total of even numb:"+



    }//main

}
