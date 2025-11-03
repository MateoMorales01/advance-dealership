package com.yearup.dealership;

import java.time.LocalDate;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private boolean isFinanced;
    private double processingFee;

    public SalesContract(LocalDate contractDate, String customerNames, String customerEmail, Vehicle vehicleSold, double salesTaxAmount, double recordingFee, boolean isFinanced, double processingFee) {
        super(contractDate, customerNames, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.isFinanced = isFinanced;
        this.processingFee = processingFee;
    }

    public double getSalesTaxAmount() {
        return getVehicleSold().getPrice()*.05;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return 100;
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

    public double getProcessingFee() {
        if (getVehicleSold().getPrice() < 10000) {
            return 295;
        }else{
            return 495;
        }
    }

    @Override
    public double getTotalPrice() {
        return getVehicleSold().getPrice()+getSalesTaxAmount()+getRecordingFee()+getProcessingFee();
    }

    @Override
    public double getMonthlyPayment() {
        double totalPrice = getTotalPrice();
        double interestRate;
        int numberOfMonths;

        if (totalPrice >= 10000) {
            interestRate = 0.0425; // 4.25% for 48 months
            numberOfMonths = 48;
        } else {
            interestRate = 0.0525; // 5.25% for 24 months
            numberOfMonths = 24;
        }

        // Calculate monthly payment using loan amortization formula
        // M = P * [r(1+r)^n] / [(1+r)^n - 1]
        // Where: M = monthly payment, P = principal, r = monthly interest rate, n = number of months

        double monthlyInterestRate = interestRate / 12;

        double monthlyPayment = totalPrice *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

}
