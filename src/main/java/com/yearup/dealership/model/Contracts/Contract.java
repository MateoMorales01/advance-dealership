package com.yearup.dealership.model.Contracts;

import com.yearup.dealership.model.Vehicle;

import java.time.LocalDate;

public abstract class Contract {
    private LocalDate contractDate;
    private String customerNames;
    private String customerEmail;
    private Vehicle vehicleSold;

    public Contract(LocalDate contractDate, String customerNames, String customerEmail, Vehicle vehicleSold) {
        this.contractDate = contractDate;
        this.customerNames = customerNames;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerNames() {
        return customerNames;
    }

    public void setCustomerNames(String customerNames) {
        this.customerNames = customerNames;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
