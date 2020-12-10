/* @file SemesterGPAPredictor.java
@brief Using user credit hours and expected grades in semester to predict GPA.
@author Sara Barker
@date 9/16/2018 */



    public class SemesterGPAPredictor {
        public static void main(String[] args) {

            //variable declarations

            double HoursNumber1;
            double ExpectedGrade1 = 0.0;

            double HoursNumber2;
            double ExpectedGrade2 = 0.0;

            double HoursNumber3;
            double ExpectedGrade3 = 0.0;

            double HoursNumber4;
            double ExpectedGrade4 = 0.0;

            String letter1;
            String letter2;
            String letter3;
            String letter4;

            double GPAResult;

            Scanner user = new Scanner(System.in);

            //ask user

            //class 1
            System.out.println("Welcome to the Semester GPA Predictor!");
            System.out.println("Course 1: Number of Hours?");
            HoursNumber1 = user.nextDouble();
            System.out.println("Course 1: Expected Grade?");
            letter1 = user.next();

            //letter 1
            if (letter1.equals("A")) {
                ExpectedGrade1 = 4.0;
            }
            else if (letter1.equals("A-")) {
                ExpectedGrade1 = 3.67;
            }
            else if (letter1.equals("B+")){
                ExpectedGrade1 = 3.33;
            }
            else if (letter1.equals("B")){
                ExpectedGrade1 = 3.0;
            }
            else if (letter1.equals("B-")){
                ExpectedGrade1 = 2.67;
            }
            else if (letter1.equals("C+")){
                ExpectedGrade1 = 2.33;
            }
            else if (letter1.equals("C")){
                ExpectedGrade1 = 2.0;
            }
            else if (letter1.equals("C-")){
                ExpectedGrade1 = 1.67;
            }
            else if (letter1.equals("D+")){
                ExpectedGrade1 = 1.33;
            }
            else if (letter1.equals("D")){
                ExpectedGrade1 = 1.0;
            }
            else if (letter1.equals("D-")){
                ExpectedGrade1 = .67;
            }

            //class 2
            System.out.println("Course 2: Number of Hours?");
            HoursNumber2 = user.nextDouble();
            System.out.println("Course 2: Expected Grade?");
            letter2 = user.next();

            //letter2
            if (letter2.equals("A")) {
                ExpectedGrade2 = 4.0;
            }
            else if (letter2.equals("A-")) {
                ExpectedGrade2 = 3.67;
            }
            else if (letter2.equals("B+")){
                ExpectedGrade2 = 3.33;
            }
            else if (letter2.equals("B")){
                ExpectedGrade2 = 3.0;
            }
            else if (letter2.equals("B-")){
                ExpectedGrade2 = 2.67;
            }
            else if (letter2.equals("C+")){
                ExpectedGrade2 = 2.33;
            }
            else if (letter2.equals("C")){
                ExpectedGrade2 = 2.0;
            }
            else if (letter2.equals("C-")){
                ExpectedGrade2 = 1.67;
            }
            else if (letter2.equals("D+")){
                ExpectedGrade2 = 1.33;
            }
            else if (letter2.equals("D")){
                ExpectedGrade2 = 1.0;
            }
            else if (letter2.equals("D-")){
                ExpectedGrade2 = .67;
            }

            //class 3
            System.out.println("Course 3: Number of Hours?");
            HoursNumber3 = user.nextDouble();
            System.out.println("Course 3: Expected Grade?");
            letter3 = user.next();

            //letter3
            if (letter3.equals("A")) {
                ExpectedGrade3 = 4.0;
            }
            else if (letter3.equals("A-")) {
                ExpectedGrade3 = 3.67;
            }
            else if (letter3.equals("B+")){
                ExpectedGrade3 = 3.33;
            }
            else if (letter3.equals("B")){
                ExpectedGrade3 = 3.0;
            }
            else if (letter3.equals("B-")){
                ExpectedGrade3 = 2.67;
            }
            else if (letter3.equals("C+")){
                ExpectedGrade3 = 2.33;
            }
            else if (letter3.equals("C")){
                ExpectedGrade3 = 2.0;
            }
            else if (letter3.equals("C-")){
                ExpectedGrade3 = 1.67;
            }
            else if (letter3.equals("D+")){
                ExpectedGrade3 = 1.33;
            }
            else if (letter3.equals("D")){
                ExpectedGrade3 = 1.0;
            }
            else if (letter3.equals("D-")){
                ExpectedGrade3 = .67;
            }

            //class 4
            System.out.println("Course 4: Number of Hours?");
            HoursNumber4 = user.nextDouble();
            System.out.println("Course 4: Expected Grade?");
            letter4 = user.next();

            //letter4
            if (letter4.equals("A")) {
                        ExpectedGrade4 = 4.0;
            }
            else if (letter4.equals("A-")) {
                        ExpectedGrade4 = 3.67;
            }
            else if (letter4.equals("B+")){
                        ExpectedGrade4 = 3.33;
            }
            else if (letter4.equals("B")){
                        ExpectedGrade4 = 3.0;
            }
            else if (letter4.equals("B-")){
                        ExpectedGrade4 = 2.67;
            }
            else if (letter4.equals("C+")){
                        ExpectedGrade4 = 2.33;
            }
            else if (letter4.equals("C")){
                        ExpectedGrade4 = 2.0;
            }
            else if (letter4.equals("C-")){
                        ExpectedGrade4 = 1.67;
            }
            else if (letter4.equals("D+")){
                        ExpectedGrade4 = 1.33;
            }
            else if (letter4.equals("D")){
                        ExpectedGrade4 = 1.0;
            }
            else if (letter4.equals("D-")){
                        ExpectedGrade4 = .67;
            }

            //calculations
            GPAResult = ((HoursNumber1 * ExpectedGrade1) + (HoursNumber2 * ExpectedGrade2) + (HoursNumber3 * ExpectedGrade3) + (HoursNumber4 * ExpectedGrade4))/(HoursNumber1 + HoursNumber2 + HoursNumber3 + HoursNumber4);

            //print
            System.out.printf("Your expected semester GPA: %.2f", GPAResult);
        }
}
