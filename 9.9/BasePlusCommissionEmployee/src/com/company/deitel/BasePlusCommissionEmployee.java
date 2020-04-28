package com.company.deitel;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    //instance variables
    private double baseSalary;
    public BasePlusCommissionEmployee(String first, String last,String ssn,
                                      double sales, double rate, double salary){
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }

    //set baseSalary
    public void setBaseSalary(double salary){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    }

    //return salary
    public double getBaseSalary(){
        return baseSalary;
    }

    //calculate earnings
    @Override
    public double earnings(){
        System.out.printf("We are from BasePlusCommissionEmployee %.2f\n",getBaseSalary() + super.earnings());
        return getBaseSalary() + super.earnings();
    }

    //return String representation of this class
    @Override
    public String toString(){
        return String.format("%s\n%s\n%s: %s\n",super.toString(),"Earnings from BasePlusCommissionEmployee class",
                "Earnings",earnings());
    }

}
