//Analysis.java
//Analysis of examination resluts
import java.util.Scanner;

public class Analysis {

    public void processExamResults() {
        //create scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        //initializing variable in declarations
        int passes = 0; //number of passes
        int failures = 0; //number of failures
        int studentCounter = 1; //student counter
        int result; // one exma result (obtains value from user)

        //process 10 students using counter-controlled loop
        while (studentCounter <= 10) {
            //prompt user for input and optain value from user
            System.out.println("Enter result (1 = pass , 2 = fail): ");
            result = input.nextInt();


            //if...esle nested in while
            if (result == 1) //if result is 1
                passes = passes + 1; //increment passes
            else //else result is not 1, so
                failures = failures + 1; //increment failures

            //increment studentCOunter so loop eventually terminates
            studentCounter = studentCounter + 1;

        }//end while

        //termination phase prepare and display results
        System.out.printf("Passed: %d\nFailed: %d\n",passes,failures);

        //determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Raise Tuition");
    }//end method processExamResults

}//end clas Analysis
