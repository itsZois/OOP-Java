//Scope.java
//Scope class demonstrates field and local variable scopes

public class Scope {
    //field that is accessible to all methods of this class
    private int x = 1;

    //method begins created and initializes local variable x
    //and calls method useLocalVariable and useField
    public void begin() {
        int x = 5; //method's local variable x shadows field x

        System.out.printf("local x in method begin in %d\n",x);

        useLocalVariable(); //useLocalVariable has local x
        useField(); //useField uses class Scope's field x
        useLocalVariable(); //useLocalVariable reinitializes local x
        useField(); //class Scope's field x retains its value
    }//end method begin

    //create and initialize local variable x during each call
    public void useLocalVariable() {
        int x = 25; //initialized each time useLocalVariable is called
        
        System.out.printf("\nlocal x on entering method useLocalVariable's is %d\n",x);
        ++x; //modifies this method's local variable x
        System.out.printf("local x before exiting method useLocalVariable is %d\n",x);
    }//end method useLocalVariable

    public void useField() {
        System.out.printf("\nfield x on entering method useField is %d\n",x);
        x *= 10; //modifies class Scope's field x
        System.out.printf("field x before exiting method useField is %d\n",x);
    }//end method useField

}//end class Scope
