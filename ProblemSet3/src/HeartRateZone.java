/* @file HeartRateZone.java
@brief Using user's heart rate to advise best target heart rate zones during exercise.
@author Sara Barker
@date 9/16/2018 */


import java.util.Scanner;

public class HeartRateZone {
    public static void main(String[] args) {

        //variable declarations

        int selection1;
        int selection2;
        int selection3;
        int selection4;
        int selection5;
        int UserAge;
        int RestingHR;
        int EstimatedMaxHR;
        int choice;
        int d;
        double ZoneOneLowEnd;
        double ZoneOneHighEnd;
        double ZoneTwoLowEnd;
        double ZoneTwoHighEnd;
        double ZoneThreeLowEnd;
        double ZoneThreeHighEnd;
        double ZoneFourLowEnd;
        double ZoneFourHighEnd;
        double ZoneFiveLowEnd;
        double ZoneFiveHighEnd;

        selection1 = 1;
        selection2 = 2;
        selection3 = 3;
        selection4 = 4;
        selection5 = 5;

        Scanner user = new Scanner(System.in);

        // ask user
        System.out.println("Target Heart Rate Calculator!");

        System.out.println("Input your age:");
        UserAge = user.nextInt();

        System.out.println("Enter resting heart rate:");
        RestingHR = user.nextInt();

        System.out.println("Choose your target:");
        System.out.println("1. Boost recovery, get ready to train at higher rates");
        System.out.println("2. Building endurance, weight loss");
        System.out.println("3. Improving cardio fitness, weight management");
        System.out.println("4. Speed endurance");
        System.out.println("5. Maximal effort, interval training");
        choice = user.nextInt();

        System.out.println("You have selected " + choice + ".");


        //calculations
        if (choice == 1) {
            EstimatedMaxHR = (220 - UserAge);
            d = (EstimatedMaxHR - RestingHR);
            ZoneOneLowEnd = (d * 0.70 + RestingHR);
            ZoneOneHighEnd = (d * 0.60 + RestingHR);
            System.out.printf("Exercise to keep your heart rate in the zone %.2f - %.2f beats per minute.", ZoneOneHighEnd, ZoneOneLowEnd);
        }

        else if (choice == 2) {
            EstimatedMaxHR = (220 - UserAge);
            d = (EstimatedMaxHR - RestingHR);
            ZoneTwoLowEnd = (d * 0.80 + RestingHR);
            ZoneTwoHighEnd = (d * 0.70 + RestingHR);
            System.out.printf("Exercise to keep your heart rate in the zone %.2f - %.2f beats per minute.", ZoneTwoHighEnd, ZoneTwoLowEnd);
        }

        else if (choice == 3) {
            EstimatedMaxHR = (220 - UserAge);
            d = (EstimatedMaxHR - RestingHR);
            ZoneThreeLowEnd = (d * 0.90 + RestingHR);
            ZoneThreeHighEnd = (d * 0.80 + RestingHR);
            System.out.printf("Exercise to keep your heart rate in the zone %.2f - %.2f beats per minute.", ZoneThreeHighEnd, ZoneThreeLowEnd);
        }

        else if (choice == 4) {
            EstimatedMaxHR = (220 - UserAge);
            d = (EstimatedMaxHR - RestingHR);
            ZoneFourLowEnd = (d * 1.00 + RestingHR);
            ZoneFourHighEnd = (d * 0.90 + RestingHR);
            System.out.printf("Exercise to keep your heart rate in the zone %.2f - %.2f beats per minute.", ZoneFourHighEnd, ZoneFourLowEnd);
        }

        else if (choice == 5) {
            EstimatedMaxHR = (220 - UserAge);
            d = (EstimatedMaxHR - RestingHR);
            ZoneFiveLowEnd = (d * 1.10 + RestingHR);
            ZoneFiveHighEnd = (d *  1.00 + RestingHR);
            System.out.printf("Exercise to keep your heart rate in the zone %.2f - %.2f beats per minute.", ZoneFiveHighEnd, ZoneFiveLowEnd);
        }

        //print results

        else {
            System.out.println("Invalid input. You must select an option from 1-5.");
        }


    }
}


