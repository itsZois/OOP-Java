//GradeBook.java
//Class declaration with one method
//GradeBook class the conatins aa courseName instance variable and methods to set and get its value
//GradeBook class that solves class-average problem using counter-controlled repetition

import java.util.Scanner;//program uses class Scanner

public class GradeBook {
    private String courseName; //course name for this GradeBook
    private int total; //sum of grades
    private int gradeCounter; //number of grader entered
    private int aCount , bCount , cCount , dCount , fCount ; //count of grades
    
    //constructor initializes courseName
    public GradeBook(String name) {
        courseName = name;//initializes courseName
    }//end constructor

    //method to set the course name
    public void setCourseName(String name) {
        courseName = name;
    }//end method setCourseName

    //method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }//end method getCourseName

    //display a welcome message to the Gradebook user
    public void displayMessage() {

        //this statemtn calls getCourseName to get the name of the course this Gradebook represents
        System.out.printf("Welcome to the Grade Book for \n%s!\n",getCourseName());

    }//end method display message

    //determine class average base on 10 grades entered by user
    public void determineClassAverafe() {
        //create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

       
        double average;//averafe of grades
        int total , gradeCounter , grade ;
        //sum of grades entered by the user
        //number of the frade to be
        //grade value entered by the user

        //initialization phase
        total = 0; //initialize total
        gradeCounter = 0; //initialize loop counter

        //processing phase
        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        while (grade != -1) { //loop until sentinel value is read from user  
            
            total = total + grade ; //add grade to total
            gradeCounter++; //increment coutner

            //prompt for input and read next grade from user
            System.out.print("Enter grade or -1 to quit: "); 
            grade = input.nextInt(); //input next grade
        }//end while

        //termination phase
        //if user enter at least one grade...
        if (gradeCounter != 0) {
            //calculate the average of all grades entered
            average = (double) total / 10 ; //integer division

            //display total and average of grades
            System.out.printf("\nTortal of all 10 grades is %n\n",total);
            System.out.printf("Class average is %.2f\n",average);
        }
        else //no grades were enterred , so output appropriate message
            System.out.println("No grades were entered");

    }//end method determineClassAverage

    //input arbitrary number of grades from user
    public void inputGrades() {
        Scanner input = new Scanner(System.in);

        int grade; //grade entered by user
        System.out.printf("%s\n%s\n  %s\n  %s\n","Enter the integer grades in the range 0-100.","Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <ctrl> d then predd Enter","On Windows type <ctrl> z then press Enter");
        
        //loop intil user enters the end-of-file indicator
        while (input.hasNext()) {
            grade = input.nextInt();//read grade
            total += grade;//add grade to total
            ++gradeCounter;//increment number of grades

            //call method to incrememnt appropriate counter
            incrementLetterGradeCounter(grade);

        }//end while
    }//end method inputGrades

    public void incrementLetterGradeCounter(int numericGrade) {
        //determine which grade was entered
        switch (numericGrade/10) {
            case 9: //grade was between 90
            case 10: //and 100
                ++aCount; //increment aCount
                break; //necessary to exit switch
            case 8: //grade was bwetween 80 and 89
                ++bCount; //increment bCount
                break; //exit switch
            case 7: //grade was bwetween 70 and 79
                ++cCount; //increment cCount
                break;
            case 6: //grade was between 60 and 69
                ++dCount; //increment dCount
                break; //exit switch
            default: //grade was less than 60
                ++fCount; //increment fCount
                break; //optional; will exit switch anyway
        }//end switch
    }

    public void displayGradeReport() {
        System.out.println("\nGrade Report:");

        //if user enetered at least one gade...
        if (gradeCounter != 0) {
            //calculate aveerage of all grades entered 
            double average = (double) total / gradeCounter;

            //output summary of results
            System.out.printf("Total of the %d grades entered is %d\n",gradeCounter,total);
            System.out.printf("Class average is %.2f\n",average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                "Number of sudents who received each grade:",
                "A: ", aCount, //display number of A grades
                "B: ", bCount, //display numebr of B grades
                "C: ", cCount, //display number of C grades
                "D: ", dCount, //display number of D grades
                "F: ", fCount //display number of F grades
                );
                
        }//end if
    else //no grades were enetered , so output appropriate message
        System.out.println("No grades were entered");
    }//end method displayGradeReport

}//end class GradeBook
