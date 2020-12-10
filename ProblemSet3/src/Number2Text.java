/* @file Number2Text.java
@brief Using nested if-else statements to translate numbers to written form.
@author Sara Barker
@date 9/16/2018 */

import java.util.Scanner;
public class Number2Text {
    public static void main(String[] args) {
        System.out.println("Number to Text Translator!");
        System.out.println("Enter a number within the interval, [0, 50].");

        //variable declarations
        int num;

        Scanner scnr = new Scanner (System.in);
        num = scnr.nextInt();

        //if-else

        //exceptions
        if (num == 0) {
            System.out.print("Zero");
        }

        else if (num == 1) {
            System.out.println("One");
        }

        else if (num == 2) {
            System.out.println("Two");
        }

        else if (num == 3) {
            System.out.println("Three");
        }

        else if (num == 4) {
            System.out.println("Four");
        }

        else if (num == 5) {
            System.out.println("Five");
        }

        else if (num == 6) {
            System.out.println("Six");
        }

        else if (num == 7) {
            System.out.println("Seven");
        }

        else if (num == 8) {
            System.out.println("Eight");
        }

        else if (num == 9) {
            System.out.println("Nine");
        }

        else if (num == 10) {
            System.out.println("Ten");
        }

        else if (num == 11) {
            System.out.println("Eleven");
        }

        else if (num == 12) {
            System.out.println("Twelve");
        }

        else if (num == 13) {
            System.out.println("Thirteen");
        }

        else if (num == 14) {
            System.out.println("Fourteen");
        }

        else if (num == 15) {
            System.out.println("Fifteen");

        }

        else if (num == 16) {
            System.out.println("Sixteen");
        }

        else if (num == 16) {
            System.out.println("Seventeen");
        }

        else if (num == 18) {
            System.out.println("Eighteen");
        }

        else if (num == 16) {
            System.out.println("Nineteen");
        }

        //twenties

        else if (num == 20) {
            System.out.print("Twenty");
        }

        else if (num / 10 == 2) {

            if (num % 10 == 1) {
                System.out.println("Twenty one");
            }

            if (num % 10 == 2) {
                System.out.println("Twenty two");
            }

            if (num % 10 == 3) {
                System.out.println("Twenty three");
            }

            if (num % 10 == 4) {
                System.out.println("Twenty four");
            }

            if (num % 10 == 5) {
                System.out.println("Twenty five");
            }

            if (num % 10 == 6) {
                System.out.println("Twenty six");
            }

            if (num % 10 == 7) {
                System.out.println("Twenty seven");
            }

            if (num % 10 == 8) {
                System.out.println("Twenty eight");
            }

            if (num % 10 == 9) {
                System.out.println("Twenty nine");
            }
        }

        //thirties

        else if (num == 30) {
            System.out.print("Thirty");
        }

        else if (num / 10 == 3) {

            if (num % 10 == 1) {
                System.out.println("Thirty one");
            }

            if (num % 10 == 2) {
                System.out.println("Thirty two");
            }

            if (num % 10 == 3) {
                System.out.println("Thirty three");
            }

            if (num % 10 == 4) {
                System.out.println("Thirty four");
            }

            if (num % 10 == 5) {
                System.out.println("Thirty five");
            }

            if (num % 10 == 6) {
                System.out.println("Thirty six");
            }

            if (num % 10 == 7) {
                System.out.println("Thirty seven");
            }

            if (num % 10 == 8) {
                System.out.println("Thirty eight");
            }

            if (num % 10 == 9) {
                System.out.println("Thirty nine");
            }
        }

        //fourties

        else if (num == 40) {
            System.out.print("Fourty");
        }

        else if (num / 10 == 4) {

            if (num % 10 == 1) {
                System.out.println("Fourty one");
            }

            if (num % 10 == 2) {
                System.out.println("Fourty two");
            }

            if (num % 10 == 3) {
                System.out.println("Fourty three");
            }

            if (num % 10 == 4) {
                System.out.println("Fourty four");
            }

            if (num % 10 == 5) {
                System.out.println("Fourty five");
            }

            if (num % 10 == 6) {
                System.out.println("Fourty six");
            }

            if (num % 10 == 7) {
                System.out.println("Fourty seven");
            }

            if (num % 10 == 8) {
                System.out.println("Fourty eight");
            }

            if (num % 10 == 9) {
                System.out.println("Fourty nine");
            }
        }

        else if (num == 50) {
            System.out.print("Fifty");
        }

            else if (num < 0 || num > 50) {
            System.out.println("Invalid number entered (not within interval, [0, 50]).");
        }

    }
}