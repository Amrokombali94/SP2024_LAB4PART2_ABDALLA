package org.example;

import java.util.Scanner;

public class SP2024_SaleEmployeeSalary_abdalla {
    public static void main(String[] args) {

        // Create an object Scanner to read the user input
        Scanner input = new Scanner(System.in);

        /*Declare the variable related to the user input.
          These are the placeholders for the user input
         */
        String name;
        String employeeId;
        float saleAmount;
        float baseSalary;

        // Storing the values of the user input in the previously created variable
        System.out.println("Please enter the employee name? ");
        name =  input.nextLine();

        System.out.println("Please enter the employee ID?");
        employeeId =  input.nextLine();

        System.out.println("Please enter the sales amount? ");
        saleAmount =  input.nextFloat();

        System.out.println("Please enter the base salary? ");
        baseSalary =  input.nextFloat();

        // Creating object type SP2024_SaleEmployeeInfo_abdalla and store the user input by the constructor
        SP2024_SaleEmployeeInfo_abdalla saleEmployee = new SP2024_SaleEmployeeInfo_abdalla(name, employeeId, saleAmount, baseSalary);

        //Display the output of the process
        System.out.println(saleEmployee.toString());
    }
}