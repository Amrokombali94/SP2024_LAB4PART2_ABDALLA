package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SP2024_SaleEmployeeInfo_abdalla {

    //Data members of class
    private String name;
    private String employeeId;
    private float saleAmount;
    private float baseSalary;
    private float commissionRate;
    private float bonusRate;

    //Constructor and the initializer members of the class
    public SP2024_SaleEmployeeInfo_abdalla() {
        name = "";
        employeeId = "";
        saleAmount = 0;
        baseSalary = 0;
    }

    public SP2024_SaleEmployeeInfo_abdalla(String name, String employeeId, float saleAmount, float baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.saleAmount = saleAmount;
        this.baseSalary = baseSalary;

    }

    SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");  //When you do not need time

    Date date = new Date();



    //methods member of the class
    public float commissionAmount(float saleAmount){

        if(saleAmount >= 15000){
            commissionRate = 0.0319f;
        } else if (saleAmount >= 12000 && saleAmount < 15000) {
            commissionRate = 0.0239f;
        } else if (saleAmount > 8000 && saleAmount < 12000) {
            commissionRate = 0.0159f;
        } else {
            commissionRate = 0.0159f;
        }

        return commissionRate * saleAmount;
    }

    public float bonusAmount(float saleAmount){

        if(saleAmount >= 15000){
            bonusRate = 0.0189f;
        } else if (saleAmount >= 12000 && saleAmount < 15000) {
            bonusRate = 0.0159f;
        } else if (saleAmount > 8000 && saleAmount < 12000) {

            bonusRate = 0.0129f;
        } else {
            bonusRate = 0.0f;
            return 0;
        }
        return bonusRate * (saleAmount - 8000);
    }

    public float totalSalary (float baseSalary, float saleAmount){

        return baseSalary + commissionAmount(saleAmount)+ bonusAmount(saleAmount);
    }

    @Override
    public String toString() {
        return	"--------------------------------------------------\n" +
                "File: SP2024_SaleEmployeeSalary_abdalla.java \n" +
                "COMPANY KITCHEN PRODUCTS –  AMRO ABDALLA\n" +
                String.format("%-29s%15s\n", "Pay Date:", formatter1.format(date)) +
                "--------------------------------------------------\n" +
                String.format("%-29s%15s\n", "Sale Employee Name:", name) +
                String.format("%-29s%15s\n", "Employee ID:", employeeId) +
                String.format("%-29s%15.2f\n", "Sale amount:", saleAmount) +
                "--------------------------------------------------\n" +
                String.format("%-29s%15.2f\n", "Base Salary:", baseSalary) +
                String.format("%-29s%15.2f\n", "Commission:", commissionAmount(saleAmount)) +
                String.format("%-29s%15.2f\n", "Bonus:", bonusAmount(saleAmount)) +
                String.format("%-29s%15.2f\n", "Salary:", totalSalary(baseSalary,saleAmount)) +
                "---------------------------------------------------\n";
    }
}
