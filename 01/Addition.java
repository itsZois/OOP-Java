//Addition.java
//Addition program the displays the sum of two numbers.

import java.util.Scanner; //program uses class Scanner


public class Addition {

    //main method begins execution of Java application
    public static void main(String[] args) {
        //create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
    
        //First & second number to add + the sum of number 1 and 2
        int number1 , number2 , sum;

        System.out.print("Enter first integer: "); //prompt

        number1 = input.nextInt(); //read first number

        System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); //read second number from user

        sum = number1 + number2 ;

        System.out.printf("Sum is %d\n",sum);
    }//end method main
}//end class Addition
