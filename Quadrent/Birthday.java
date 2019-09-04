package Quadrent;

/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int x;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("");  //prompt the user for a birth month
        x = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (x==1||x ==3||x==5||x==7||x==8||x==10||x==12){
            System.out.println("Your month has 31 days");
        }
        else if (x==4||x==6||x==9||x==11){
            System.out.println("Your month has 30 days");
        }
        else if (x==2){
            System.out.println("Your month has 28 days");
        }
        //output the result to the user
        System.out.println("");
    }
}
