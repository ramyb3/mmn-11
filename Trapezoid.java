/**
 * The Trapezoid class recevieng 3 inputes from each of two parallel to x-line bases:
 * x+y coordinates + base length,
 * then the program calculates the perimeter and the area of the trapezoid. 
 */
import java.util.Scanner;
public class Trapezoid
{
    public static void main (String [] args)
    {
        Scanner scan= new Scanner (System.in);
        System.out.println ("Please enter the left point coordinates of the " +
            "base followed by its length:");

        //point A coordinates
        int xa = scan.nextInt();
        int ya = scan.nextInt();
        int lengthAD = scan.nextInt();//length of the base AD

        System.out.println ("Please enter the left point coordinates of the " +
            "other base followed by its length:");
            
        //point B coordinates
        int xb = scan.nextInt();
        int yb = scan.nextInt();
        int lengthBC = scan.nextInt();//length of the base BC

        //calculation of distance between AB
        double xab2 = Math.pow(xb-xa,2);
        double yab2 = Math.pow(yb-ya,2);
        double lengthAB = Math.sqrt(xab2+yab2);//length of AB

        //point C coordinates
        int xc = lengthBC-xb;
        int yc = yb;

        //point D coordinates
        int xd = lengthAD-xa;
        int yd = ya;

        //calculation of distance between CD
        double xcd2 = Math.pow(xc-xd,2);
        double ycd2 = Math.pow(yc-yd,2);
        double lengthCD = Math.sqrt(xcd2+ycd2);//length of CD

        double perimeter = lengthAD+lengthBC+lengthAB+lengthCD;//perimeter calculation
        double area = Math.abs(((yb-ya)*(lengthAD+lengthBC))/2.0);//area calculation

        System.out.println ("The area of the trapezoid is: " +area) ;
        System.out.println ("The perimeter of the trapezoid is: " +perimeter) ;
    } //end of method main 
}   //end of class Trapezoid     