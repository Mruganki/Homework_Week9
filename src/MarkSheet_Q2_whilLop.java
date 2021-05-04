


/*
. Re write the student mark sheet programme using if else and while loop.

 */

import java.util.Scanner;
public class MarkSheet_Q2_whilLop {

       static String name;
        static int rollNum;
        static int maths;
        static int english;
        static int science;
        static double percentage;
        static String result;
        static String grade;
        static int total;
    Scanner obj = new Scanner(System.in);
        public void getStudentInfo() {

            System.out.println("Enter your name");
            name = obj.nextLine();
            System.out.println("Enter roll no");
            rollNum = obj.nextInt();
            System.out.println("Enter maths mark (0 to 100):");
            maths = obj.nextInt();
            if (maths < 0 || maths > 100) {
                System.out.println("Invalid input, marks should be between 0 to 100");
                System.exit(0);
            }

            System.out.println("Enter science mark (0 to 100): ");
            science = obj.nextInt();
            if (science < 0 || science > 100) {
                System.out.println("Invalid input, marks should be between 0 to 100");
                System.exit(0);
            }
            System.out.println("Enter english mark (0 to 100):");
            english = obj.nextInt();
            if (english < 0 || english > 100) {
                System.out.println("Invalid input, marks should be between 0 to 100");
                System.exit(0);
            }
        }

        public void calculateresult(){
            total=maths+science+english;
            percentage=total/3.0;
            result=percentage>=35? "Pass":"Fail";

            if(percentage >= 80)
                grade = "A+";
            else if(percentage >= 60)
                grade = "A";
            else if(percentage >= 50)
                grade = "B";
            else if(percentage >= 35)
                grade = "C";
            else
                grade = "Fail";

        }

        public static void main(String[] args) {
            MarkSheet_Q2_whilLop hw3 = new MarkSheet_Q2_whilLop();// object of marksheet class
            char choice ='Y';//Variable to store user's choice
            while(choice == 'Y'){// if choice is yes than
                hw3.getStudentInfo();// calling method
                hw3.calculateresult();// calling method to main method
                Scanner obj = new Scanner(System.in);
                System.out.println(" _____________________________ ");
                System.out.println("|                             |");
                System.out.println("| Mark Sheet                  |");
                System.out.println("|_____________________________|");
                System.out.println("| Name :  " + name);
                System.out.println("| Roll No: " + rollNum);
                System.out.println("|_______________________________| ");
                System.out.println("| Subjects :  | ");
                System.out.println("|_______________________________|");
                System.out.println("| Math :   " + maths);
                System.out.println("| Science :   " + science);
                System.out.println("| English :   " + english);
                System.out.println("|____________________________");
                System.out.println("| Total :   " + total);
                System.out.println("|_______________________________|");
                System.out.println("| Percentage :   " + percentage);
                System.out.println("| Result :   " + result);
                System.out.println("| Grade :   " + grade);
                System.out.println("|_______________________________|  ");
                System.out.println("Do you want to enter more:");

                choice= hw3.obj.next().toUpperCase().charAt(0);// to read users choice
                hw3.obj.nextLine();//to clear the console

            }
        }

   }










