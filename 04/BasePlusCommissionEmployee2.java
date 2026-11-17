//BasePlusCommissionEmployee2.java
//BasePlusCommissionEmployee2 inherits from class CommissionEmployee

public class BasePlusCommissionEmployee2 extends CommissionEmployee {

    private double baseSalary; //base salary per employee
    
    //six argument constructor
    public BasePlusCommissionEmployee2(String fname, String lname, String ssn, double gsales, double crate, double salary ) {
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
        return baseSalary + ( super.getCommissionRate() * super.getGrossSales());
    }//end method earnings

    //return String representation of CommissionEmployee object
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "commission employee", super.getFirstName(), super.getLastName(),
            "social security number", super.getSocialSecurityNumber(),
            "gross sales", super.getGrossSales(),
            "commission rate", super.getCommissionRate(),
            "base salary", getBaseSalary());
    }//end method toString

}
