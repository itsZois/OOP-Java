//BasePlusCommissionEmployee.java

public class BasePlusCommissionEmployee {
    private String firstName, lastName, socialSecurityNumber;
    private double grossSales, commissionRate; //gross weekly sales and commission percentage
    private double baseSalary; //base salary per week

    //six-argument constructor
    public BasePlusCommissionEmployee(String fname, String lname, String ssn, double gsales, double crate, double salary) {
        setFirstName(fname);
        setLastName(lname);
        setSocialSecurityNumber(ssn);
        setGrossSales(crate); //validate and store gross sales
        setCommissionRate(crate); //validate and store comission rate
        setBaseSalary(salary); //base salary per week
    }//end six-argument CommissionEmployee constructor

    //set first name
    public void setFirstName(String fname) {
        firstName = fname;
    }//end method firstName

    //return first name
    public String getFirstName() {
        return firstName;
    }//end method gitFirstName
    
    //set last name
    public void setLastName (String lname) {
        lastName = lname;
    }//end method setLastName

    //get last name
    public String getLastName () {
        return lastName;
    }//end method getLastName

    //set social security number
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }//end method setSocialSecurityNumber

    //get social securuity number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }//end method getSocialSecurityNumber

    //set gross sales amount
    public void setGrossSales(double sales) {
        grossSales = (sales< 0.0) ? 0 : sales;
    }//end method setGrossSales
    
    //return gross sales ammount
    public double getGrossSales() {
        return grossSales;
    }//end method getGrossSales

    //set commission rate
    public void setCommissionRate(double rate) {
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }//end method setCommissionRate

    //return commission reate
    public double getCommissionRate() {
        return commissionRate;
    }//end method getCommissionRate

    //set base salary
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }//end method setBaseSalary

    //return base salary
    public double getBaseSalary() {
        return baseSalary;
    }//end method getBaseSalary

    //calculate earnings
    public double earnings() {
        return baseSalary + ( commissionRate * grossSales );
    }//end method earnings

    //return String representation of CommissionEmployee object
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "commission employee",firstName,lastName,
            "social security number", socialSecurityNumber,
            "gross sales",grossSales,
            "commission rate", commissionRate,
            "base salary", baseSalary );
    }//end method toString

}//end class BasePlusCommissionEmployee
