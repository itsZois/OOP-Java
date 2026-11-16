//InitArray.java
//Creating an array.
//Initializing the elemtnts of an array with an array initializer
//Calculating values to be placed into elemts of an array
//Initializing two-dimenstional arrays

public class InitArray {
    public static void main(String[] args) {
        //int array[];//declare array named array

        //array = new int[10]; //create the space for array

        //initializer list specifies the value for each elemetn
        //int array[] = {32,27,64,18,95,14,90,70,60,37};

        //final int ARRAY_LENGTH = 10;//declare constant
        //int[] array = new int[ARRAY_LENGTH];//create array

        //calculate value for each array element
        /* 
        for (int counter=0; counter<array.length; counter++)
            array[counter] = 2 + 2*counter;

        System.out.printf("%s%8s\n","Index","Value"); //column headings
        
        //output each array element's value
        for (int counter=0 ; counter<array.length; counter++)
            System.out.printf("%5d%8d\n",counter,array[counter]);
        */
        int array1[][] = {{1,2,3},{4,5,6}};
        int array2[][] = {{1,2},{3},{4,5,6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1);//displayes array1 by row
        System.out.println("\nValues in array2 by row are");
        outputArray(array2);//displays array2 by row

    }//end main

    //output rows and colums of a two-dimensional array
    public static void outputArray(int array[][]) {
        //loop through arrays's rows
        for (int row=0; row<array.length; row++) {
            //loop through columns of current row
            for (int column = 0; column<array[row].length; column++)
                System.out.printf("%d ",array[row][column]);
            System.out.println();//start a new line
        }//end outer ofr
    }//end method outputArray
}//end class InitArray
