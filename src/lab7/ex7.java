package lab7;

import java.util.Scanner;

public class ex7 {
    public static  void  main (String[] args) {

        Scanner Sc = new Scanner(System.in);

        int X;

       do {

            System.out.print("Enter an integer: ");
            X = Sc.nextInt();
        } while ( X !=0);

        System.out.println("Good Bey.");
    }
}


