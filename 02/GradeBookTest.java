//GradeBookTest.java
//Create a GradeBook object and call its displayMessage method
//Create and manipulate a GradeBook object
//Creade GradeBook object and invoke the determineClassAverage method

import java.util.Scanner; //program uses Scanner

public class GradeBookTest {

    //main method begins program execution
    public static void main(String[] args) {

        //create Scanner to obtain input from command windwo
        //Scanner input = new Scanner(System.in);

        //Create a GradeBook object and assign it to myGradebook
        GradeBook myGradeBook = new GradeBook("CS101 Introduction ot Java Programming");

        //display initial value of courseName
        //System.out.printf("Initial course name is: %s\n\n",myGradebook.getCourseName());

        //prompt for and read course name
        //System.out.println("Please enter the course name:");
        //String theName = input.nextLine(); //read a line of text
        //myGradebook.setCourseName(theName); //set the course name
        //System.out.println(); //Outputs a blank line

        //display welcome message after specifying course name
        myGradeBook.displayMessage();
        //myGradeBook.determineClassAverafe(); // find average
        myGradeBook.inputGrades();//reead grades from user
        myGradeBook.displayGradeReport();//display report on grades

    }//end main

}//end class GradeBookTest
