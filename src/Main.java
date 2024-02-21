import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    //Scanner class has been defineted.
    Scanner art= new Scanner(System.in);

    //The variable data types have been defined.
    Integer a,b,c,t ;

    //Get values from the user.
    System.out.print("Please enter number =");
    a=art.nextInt();

    System.out.print("Please enter number =");
    b=art.nextInt();

    System.out.print("Please enter number =");
    c=art.nextInt();

    //The result has been calculated.
    t= a+b*c-b;
    System.out.print("Result =" + t);

    }
}