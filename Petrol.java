/**
 * The Petrol class convert a calculation of miles/gallon consumption
 * to a liters/100km consumption.
 */
import java.util.Scanner;
public class Petrol
{
  public static void main (String [] args)
   {
    final int MAX = 100;
    final double KM_IN_MILE = (1/1.609);//1 km=(1/1.609)mile
    final double LITER_IN_GALLON = (1/3.785);//1 liter=(1/3.785)gallon
     
    System.out.println ("Please enter the car's petrol consumption " +
                        "measurd in miles/gallon:");
     
    Scanner scan= new Scanner (System.in);
     
    double milesPerGallon = scan.nextDouble();
    
    double LitersPerHundredKm= 100/((milesPerGallon/KM_IN_MILE)*LITER_IN_GALLON);
    //calculation of a liters/100km consumption
    
    double LitersPerHundredKmRound = Math.round (LitersPerHundredKm*MAX)/(MAX*1.0);
    //rounding the consumption result above 
   
    System.out.println ("The car's petrol consumption converted to " +
                        "liters/100km is:\n" + (LitersPerHundredKmRound));
   }  //end of method main 
}  //end of class Petrol      