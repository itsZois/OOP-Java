//BasePlusCommissionEmployee3.java
//BasePlusCommissionEmployee3 inherits from class CommissionEmployee2

public class BasePlusCommissionEmployee3 extends CommissionEmployee2 {

    private double baseSalary; //base salary per employee
    
    //six argument constructor
    public BasePlusCommissionEmployee3(String fname, String lname, String ssn, double gsales, double crate, double salary ) {
        super(fname,lname,ssn,gsales,crate);
        setBaseSalary(salary); //validate and store base salary
    }//end six argument BasePlusCommissionEmployee2 constructor

    //set base salary
    public void setBaseSalary(double salary) {
        baseSalary = ((salary < 0) ? 0.0 : salary);
    }//end method setBaseSalary

    //return base salary
    public double getBaseSalary() {
        return baseSalary;
    }//end method getBaseSalary

    //calculate earnings
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }//end method earnings

    //return String representation of CommissionEmployee object
    public String toString() {
        return String.format("%s: %s\n%s: %.2f", "base-salaried", super.toString() , "base salary ", getBaseSalary());
    }//end method toString

}//end classs BasePlusCommissionEmployee3
