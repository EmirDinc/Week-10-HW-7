package hw10.pkg7;

import java.util.Scanner;

public class HW107 {
    //task1:
//    1. showChar Method
//    Write a method named showChar. The method should accept two arguments: a reference to
//    a String object and an integer. The integer argument is a character position within the
//    String, with the first character being at position 0. When the method executes, it should
//    display the character at that character position. Here is an example of a call to the method:
//    showChar("New York", 2);
//    In this call, the method will display the character w because it is in position 2. Demonstrate
//    the method in a complete program.
    public static void main(String[] args){
        showChar("Emir", 3);
    }
    public static void showChar(String noun, int num) {
        if (num >= 0){
            if ( num < noun.length() ){
                char x = noun.charAt(num);
                System.out.println(x);
            }
        }
    }
    //task2:
//    2. Retail Price Calculator
//    Write a program that asks the user to enter an item’s wholesale cost and its markup percentage. It should then display the item’s retail price. For example:
//    •	 If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
//    item’s retail price is 10.00.
//    •	 If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the
//    item’s retail price is 7.50.
//    The program should have a method named calculateRetail that receives the wholesale
//    cost and the markup percentage as arguments, and returns the retail price of the item.
    public static void main(String[] args){
        double wholeSalePriceIn;
        double markupPercentageIn;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("What's the wholesale cost?");
        wholeSalePriceIn = keyIn.nextDouble();
        System.out.println("What's the markup percentage? ");
        markupPercentageIn = keyIn.nextDouble();
        System.out.println("Your wholesale cost is $" + wholeSalePriceIn + " and your markup percentage is $" +
                           markupPercentageIn + ", then the retail price is $" +calculateRetail(wholeSalePriceIn, markupPercentageIn));
        
    }
    public static double calculateRetail(double wholeSalePrice, double markupPercentage){
        double retailPrice;
        double markupPercentageInCal = (markupPercentage / 100) + 1;
        retailPrice = wholeSalePrice * markupPercentageInCal;
        
        return retailPrice;
        
    }
    //task3:
//    7. Test Average and Grade
//    Write a program that asks the user to enter five test scores. The program should display
//    a letter grade for each score and the average test score. Write the following methods in
//    the program:
//    •	 calcAverage—This method should accept five test scores as arguments and return the
//    average of the scores.
//    •	 determineGrade—This method should accept a test score as an argument and return a
//    letter grade for the score, based on the following grading scale
    public static void main(String[] args){
        Scanner keyIn = new Scanner(System.in);
        System.out.println("What's the first score?");
        int firstScoreIn = keyIn.nextInt();
        System.out.println("What's the second score?");
        int secondScoreIn = keyIn.nextInt();
        System.out.println("What's the third score?");
        int thirdScoreIn = keyIn.nextInt();
        System.out.println("What's the fourth score?");
        int fourthScoreIn = keyIn.nextInt();
        System.out.println("What's the fifth score?");
        int fifthScoreIn = keyIn.nextInt();
        System.out.println("First Grade is: \t" + determineGrade(firstScoreIn) +
                           "\nSecond Grade is: \t" + determineGrade(secondScoreIn) +
                           "\nThird Grade is: \t" + determineGrade(thirdScoreIn) +
                           "\nFouth Grade is: \t" + determineGrade(fourthScoreIn) +
                           "\nFifth Grade is: \t" + determineGrade(fifthScoreIn) +
                           "\nAverage score is: \t" + calcAverage(firstScoreIn, secondScoreIn, thirdScoreIn, fourthScoreIn, fifthScoreIn));
    }
    public static double calcAverage(int firstScore, int secondScore, int thirdScore, int fourthScore, int fifthScore){
        double average = (firstScore + secondScore + thirdScore + fourthScore + fifthScore)/5;
        return average;
    }
    public static char determineGrade(int score){
        if ( score >= 90)    return 'A';
        
        if ( score >= 80)    return 'B';
        
        if ( score >= 70)    return 'C';
        
        if ( score >=60)     return 'D';
        else                 return 'F';
        
    }
    
    
}
