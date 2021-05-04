package calculate;

import java.util.Scanner;

public class Main_Calculator extends Calculator {

    public static void main(String[] args) {
       char input;
        Scanner obj = new Scanner(System.in);
        Main_Calculator cal = new Main_Calculator();

        do {
            System.out.println("Enter First number :");
            int a = obj.nextInt();
            System.out.println("Enter Second number :");
            int b = obj.nextInt();
            System.out.println("Enter Symbol here :");
            char symbol = obj.next().charAt(0);
            cal.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculate please enter 'Y' for yes or 'N' for No");
            input = obj.next().charAt(0);
        }while(input == 'Y' || input == 'Y');
    }
}
