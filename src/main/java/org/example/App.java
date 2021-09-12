package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner (System.in);
        System.out.println("What is your height in inches?");
        int h = input1.nextInt();

        Scanner input2 = new Scanner (System.in);
        System.out.println("What is your weight to the nearest pound?");
        int w = input1.nextInt();

        float pt1 = h*h;
        float pt2 = w/pt1;
        float bmi = pt2 * 703;

        System.out.println("Your bmi is " + bmi);

        if(bmi > 18.5 && bmi < 25){
            System.out.println("You are in the normal weight range.");
        }
    }
}
