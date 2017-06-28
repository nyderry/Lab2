package grand.circus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	char contin1 = 'y';
	String contin2 = "";
    //Start while loop, reuse Lab1 example.
	while (contin1 != 'n') {

	    Scanner scnr = new Scanner(System.in);
	    int numInt = 0;
        //Ask for input
        System.out.print("Enter a number between 1 and 100: ");
        numInt = scnr.nextInt();
        //nested if-else, had to reorder them to help the code
        if (numInt % 2 == 1 && numInt > 60) {
            System.out.println(numInt + "Odd and over 60.");
        }
        else if (numInt % 2 == 0 && numInt < 26) {
            System.out.println("Even and less than 25");
        }
        else if(numInt % 2 == 0 && numInt > 24 && numInt <= 60){
            System.out.println("Even");
        }
        else if (numInt > 60) {
            System.out.println(numInt + "Even");// write your code here
        }
        else {
            System.out.println(numInt + " Odd");
        }

        System.out.print("Continue? (y/n): ");
        contin2 = scnr.next();
        contin1 = contin2.charAt(0);

        System.out.println (" ");
    }
    }
}
