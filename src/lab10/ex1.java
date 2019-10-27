package lab10;

public class ex1 {

    public static void B(int X){
        System.out.println("Hello B "+X);
    }//B
    public  static void main (String[] args) {
        System.out.println("Hello Main");
        A();
        A();
        B(10);
        int s = C(10, 20);
        System.out.println(s);
        System.out.println(C(50,50)*5);
    }//main
    public static void A () {
        System.out.println("Hello A");
    }//A
    public static int C(int X, int y){
      int Z =X+y;
      System.out.println("Hello C "+Z);
      B(Z);

      return Z;

    }




}
