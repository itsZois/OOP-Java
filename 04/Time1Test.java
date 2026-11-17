//Time1Test.java
//Time1 object used in an application

public class Time1Test {
    public static void main(String[] args) {
        //create and initialize a Time1 object
        Time1 time = new Time1();//invokes Time1 constructor

        //output string representations of the tie
        System.out.printf("\nThe initial universal time is: %s\n",time.toUniversalString());
        System.out.printf("The initial standart time is: %s\n",time.toString());

        //change time and output updated time
        time.setTime(9,27,6); 

        System.out.printf("\nThe initial universal time is: %s\n",time.toUniversalString());
        System.out.printf("The initial standart time is: %s\n",time.toString());

        //set time with invalid values; output updated time 
        time.setTime(99,99, 99);

        System.out.printf("\nThe initial universal time is: %s\n",time.toUniversalString());
        System.out.printf("The initial standart time is: %s\n",time.toString());

    }//end main

}//end class Time1Test
