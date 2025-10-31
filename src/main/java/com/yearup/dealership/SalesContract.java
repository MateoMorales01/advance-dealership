package com.yearup.dealership;

import java.time.LocalDate;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private boolean isFinanced;

    public SalesContract(LocalDate contractDate, String customerNames, String customerEmail, Vehicle vehicleSold, double salesTaxAmount, double recordingFee, boolean isFinanced) {
        super(contractDate, customerNames, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.isFinanced = isFinanced;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public double getTotalPrice(){
        return 0;
    }
    public double getMonthlyPayment(){
        return 0;
    }

}
