package com.yearup.dealership;

import java.time.LocalDate;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leasingFee;

    public LeaseContract(LocalDate contractDate, String customerNames, String customerEmail, Vehicle vehicleSold, double expectedEndingValue, double leasingFee) {
        super(contractDate, customerNames, customerEmail, vehicleSold);
        this.expectedEndingValue = expectedEndingValue;
        this.leasingFee = leasingFee;
    }
    public double getTotalPrice(){
        return 0;
    }
    public double getMonthlyPayment(){
        return 0;
    }
}
