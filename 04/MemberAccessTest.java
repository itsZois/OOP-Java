//MemberAccessTest.java

public class MemberAccessTest {
    public static void main(String[] args) {
        Time1 time = new Time1(); //create and initizlize Time1 object

        time.hour = 34; //Error: hour has private access in Time1
        time.minute = 66; //Error: minute has private access in Time1
        time.second =73; //Error: second has private acces in Time1
    }//end main

}//end class MemberAccessTest
