package com.example;

public class MyClass {

    public static void main(String args[])
    {

        int meters = 28;
        int kilometers = 168;
        int centimeters = 47;
        int kph = 27;
        int liters = 92;
        int kilograms = 200;

        double inches, yards, miles, mph, gallons, lbs;

        //Conversions from metric to english;

        //Centimeters to Inches:
         inches = 0.39 * centimeters;
        //Meters to yards:
         yards = 1.0936 * meters;
       // Kilometers to miles:
         miles = kilometers / 0.6214;
        //Kilometers per Hour to miles per Hour:
        mph = kph / 0.6214;
       // Liters to gallons:
         gallons = liters / 0.2642;
        //Kilograms to pounds:
        lbs = kilograms * 2.2046;

        System.out.println("\t\tConversions from Metric to English Table:");
        System.out.println("Metric:\t\t English:");
        System.out.println(meters +" m" + "\t\t " + yards +" yards");
        System.out.println(centimeters + " cm" + "\t\t " + inches + " in");
        System.out.println(kilograms + " kg" + "\t\t " + lbs + " lbs");
        System.out.println(kilometers + " km" + "\t\t " + miles + " miles");
        System.out.println(liters + " L" + "\t\t " + gallons + "gallons");
        System.out.println(kph + " kph" + "\t\t " + mph + " mph");

    }


}
