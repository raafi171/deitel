package com.company.deitel;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Sue", "Jones",
                "333-33-3333", 10000, .06, 100);
        System.out.printf("%s",employee);
    }
}
