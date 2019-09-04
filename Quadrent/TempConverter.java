
/**
 * Skeleton of a program that convertes temperature from Fahrenheit to Celsius
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //used to get user input

public class TempConverter
{
    public static void main( String[] args) {
        double f;
        double c;
        
        
        //enable user input
        Scanner keys = new Scanner(System.in);
        System.out.println("212 F:  ");
        f = keys.nextDouble();  //converts keyboard input into a floating point number
        keys.close();  //close the keyboard scanner
        
        c=(5.0/9.0)*(f-32);
        
    
        //f degrees Fahrenheit is c degrees Celcius 
        System.out.println(f+"degres farenheit"+ c+ "degrees celcius");
    }
}