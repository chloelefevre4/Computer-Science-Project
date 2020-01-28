
package com.mycompany.bmicalculator;
// importing scanner package for java user input
import java.util.Scanner;

public class BMIcalculatorMAIN
{
    //main function
    public static void main(String[] args)
    {
        //asking the user for their age
    System.out.print ("This is a BMI calculator. How old are you ");
    try (Scanner agerestriction = new Scanner (System.in)) 
    {
    // taking in answer from user
    int age = agerestriction.nextInt();
      
            
    // if this condition "age" is true, user is brought to this conditional clause
    if (age >= 18) {
        // user is asked for weight unit
        System.out.println("Enter your weight unit (kg or lbs): ");
        Scanner massunit = new Scanner (System.in);
        // program processes user's answer and stores it as variable "m"
        String m = massunit.next ();
        // usre is asked for their weight
        System.out.println ("Enter your Weight : ");
        Scanner weightvalue = new Scanner (System.in);
        double weight = weightvalue.nextDouble();
        // program processes user's answer and stores it as variabel "weight"
        
        //common double variable height is set for both conditional clauses
        double height = 0;
        // if variable "m" is read as  "lbs", user is brought to this 
        //conditional clause using the imperial unit system
        if ( "lbs".equals(m) ){
            // user is asked for their height
            System.out.println ("Enter your height in inches ");
            Scanner heightinches = new Scanner (System.in);
            height = heightinches.nextDouble();
            //program processes user's answer and stores it as variable "height"
         
         //if variable "m" is read as "kg"; user is brought to this
         //conditional clause using the metric system
        } else if (m.equals("kg")){
            // user is asked for their height
            System.out.println ("Enter your height in metres: ");
            Scanner heightinmetres= new Scanner (System.in);
            height = heightinmetres.nextDouble();
            //program processes user's answer and stores it as variable "height"
        }
        
        //declaring a double type parameter
        double bmi = 0;
        //switch cases according to the previous conditional clause, as
        // bmi is calculated differently according to the units used
        switch (m){
            //if unit chosen in previous conditional clause was "kg"
            case "kg":
                // variable bmi is calculated according to previous answers in case "kg"
                //variable stored as "bmi"
                bmi = ( weight / (Math.pow ( height , 2)));
                // bmi printed according to metric system
                System.out.println ("Your BMI is: " + bmi + " kg/m2");
                //when bmi is given, this clause ends
                break;
            //if unit chosen in previous conditional clause was "lbs"    
            case "lbs":
                // variable bmi is calculated according to previous answers in case "lbs"
                //variable stored as "bmi"
                 bmi = 703 * (weight / (Math.pow(height , 2)));
                 //bmi printed according to imperial unit system
                 System.out.println ("Your BMI is: " + bmi + " lbs/in2");
                 //when bmi is given, this clause ends
                 break;
        }
        // referring to the calculated bmi, a certain sentence is printed
        if (bmi<15){
            System.out.println ("You are extremely underweight");
        }else if (bmi>= 15 && bmi<16){
            System.out.println ("You are severely underweight");
        }else if (bmi>= 16 && bmi<18.5){
            System.out.println ("You are underweight");
        }else if (bmi>= 18.5 && bmi<25){
            System.out.println ("You are normal; of a healthy weight.");
        }else if (bmi>= 25 && bmi<30){
            System.out.println ("You are overweight");    
        }else if (bmi>= 30 && bmi<35){
            System.out.println ("You are moderately obese");    
        }else if (bmi>= 35 && bmi<40){
            System.out.println ("You are severely obese");         
        }else if (bmi>40){
            System.out.println ("You are extremely obese"); }   
            
    }
    // if this condition "age" is true, user is brought to this conditional clause
    if (age < 18 ) {
        System.out.println ("Sorry, the BMI calculator is more accurate for adults.");
        // if user is less than 18, the program will not ask, take in, or process further variables
    }
    } 
    

    catch (Exception e){
        System.out.println ("got exception: " + e);
        System.exit (1);
        }
    }
}
    
           


