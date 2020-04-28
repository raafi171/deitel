package com.company.deitel;

public class CommissionEmployee {
    //declare protected instance variables
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double  grossSales;
    protected double commissionRate;

    //constructor
    public CommissionEmployee(String first, String last, String ssn, double sales, double rate){
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    //set firstName
    public void setFirstName(String first){
        firstName = first;
    }

    //get firstName
    public String getFirstName(){
        return firstName;
    }

    //set lastName
    public void setLastName(String last){
        lastName = last;
    }

    //return lastName
    public String getLastName(){
        return lastName;
    }

    //set social security number
    public void setSocialSecurityNumber(String ssn){
        socialSecurityNumber = ssn;
    }

    //return social security number
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    //set gross sales
    public void setGrossSales(double sales){
        grossSales = ( sales < 0.0) ? 0.0 : sales ;
    }

    //return gross Sales
    public double getGrossSales(){
        return grossSales;
    }

    //set commission rates
    public void setCommissionRate(double rate){
        commissionRate = ( rate < 0.0) ? 0.0 : rate;
    }

    //return commission rate
    public double getCommissionRate(){
        return commissionRate;
    }

    //calculate earnings
    public double earnings(){
        System.out.printf("We are from CommissionEmployee %.2f\n",grossSales*commissionRate);
        return grossSales * commissionRate;
    }

    //return String statements
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s\n%s: %s\n","Commission employee",firstName,lastName
        ,"Social security number",socialSecurityNumber,"Gross sales",grossSales,
                "Commission rate",commissionRate,
                "Earnings from CommissionEmployee class","Earnings",earnings());
    }

}
