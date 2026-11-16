//GradeBook.java
//Grade book using a two-dimensional array to strore grades

public class GradeBook {
    private String courseName; ///name of course this gradebook represents
    private int grades[][]; //two-dimensional array os student grades

    //two argument constructor intializes courseName and grades Array
    public GradeBook(String name,int gradesArray[][]) {
        courseName = name; //intializes courseName
        grades = gradesArray; //stores grades
    }//end two-argument GradeBook constructor

    //method to set courseName
    public void setCourseName(String name) {
        courseName = name;//store course name
    }//end method setCourseName

    //method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }//end method getCourseName

    //display a welcome message to the GradeBook user
    public void displayMessage() {
        //getCourseNme get the name of the course
        System.out.printf("Welcome to the grade book for \n%s!\n\n",getCourseName());
    }//end method displayMessage

    //perform various operations on the data
    public void processGrades(){
        //output grades array
        outputGrades();

        //call methods getMinimun and getMaximun
        System.out.printf("\n%s %d\n%s %d\n\n",
        "Lowest grade in the grade book is", getMinimun(),
        "Highest grade in the grade book is", getMaximun() );

        //output grade distribution chart of all grades on all tests
        outputBarChart();
    }//end method processGrades

    //find minimun grade
    public int getMinimun() {
        //assume firs element of grades array is smallest
        int lowGrade = grades[0][0];
        //loop through wrows of grades array
        for (int studentGrades[] : grades) {
            //loop through columns of current row
            for (int grade : studentGrades ) {
                //if grade less than low grade, assign it to low grade
                if (grade < lowGrade)
                    lowGrade = grade;
            }//end inner for
        }//end outer for

        return lowGrade; //return lowest grade
    }//end method getMinimun
    
    //find maximun grade
    public int getMaximun() {
        //assume firs ellement of grades is largest
        int highGrade = grades[0][0];
        //loop though rows of grades array
        for (int studentGrades[] : grades) {
            //loop through columns of current row
            for (int grade : studentGrades) {
                //if grade is hgher than highGrade, assign it to high grade
                if (grade > highGrade)
                    highGrade = grade;
            }//end inner for
        }//end outer for

        return highGrade;// return highest grade
    }//end method getMaximun

    //determine avaerage grade for particular set of gardes
    public double getAverage(int setofGrades[]) {
        int total =0; //initialize total

        //sum grades for one student
        for (int grade : setofGrades)
            total += grade;

        //return average of grades
        return (double) total / setofGrades.length;
    }//end method getAverage

    public void outputGrades() {
        System.out.println("The grades are:\n");
        System.out.print("              "); //align column heads

        //create a column heading for each of the tests
        for (int test = 0 ; test < grades[0].length; test++)
            System.out.printf("Test %d ", test+1);

        System.out.println("Average"); //student average column head

        //create rows/columns of text representing array grades
        for (int student = 0; student<grades.length; student++) {
            System.out.printf("Student %2d",student+1); 
            for (int test : grades[student]) //output student's grades
                System.out.printf("%8d", test);

            //call method getAverage to calculate student's average
            //pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f\n",average);

        }//end outer for
    }//end method outputGrades

    public void outputBarChart()
    {
    System.out.println( "Overall grade distribution:" );

    // stores frequency of grades in each range of 10 grades
    int frequency[] = new int[ 11 ];

    // for each grade in GradeBook, increment the appropriate frequency
    for ( int studentGrades[] : grades )
    {
    for ( int grade : studentGrades )
    ++frequency[ grade / 10 ];
    } // end outer for

    // for each grade frequency, print bar in chart
    for ( int count = 0; count < frequency.length; count++ )
    {
    // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
    if ( count == 10 )
    System.out.printf( "%5d: ", 100 );
    else
    System.out.printf( "%02d-%02d: ",
    count * 10, count * 10 + 9 );

    // print bar of asterisks
    for ( int stars = 0; stars < frequency[ count ]; stars++ )
    System.out.print( "*" );
    System.out.println(); // start a new line of output
    } // end outer for
    } // end method outputBarChart

}//end class GradeBook