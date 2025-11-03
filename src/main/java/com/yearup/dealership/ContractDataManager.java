package com.yearup.dealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
    private final String filePath = "contracts.csv";
    public void saveContract(Contract contract){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String contractData = formatContractData(contract);
            writer.write(contractData);
            writer.newLine();
            System.out.println("Contract saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving contract: " + e.getMessage());
        }

    }

    private String formatContractData(Contract contract) {
        Vehicle vehicle = contract.getVehicleSold();
        StringBuilder stringBuilder = new StringBuilder();

        if (contract instanceof SalesContract) {
            SalesContract salesContract = (SalesContract) contract;

            // Format: SALE|date|customerName|customerEmail|vin|year|make|model|type|color|odometer|price|salesTax|recordingFee|totalPrice|financed|monthlyPayment
            stringBuilder.append("SALE|");
            stringBuilder.append(contract.getContractDate()).append("|");
            stringBuilder.append(contract.getCustomerNames()).append("|");
            stringBuilder.append(contract.getCustomerEmail()).append("|");
            stringBuilder.append(vehicle.getVin()).append("|");
            stringBuilder.append(vehicle.getYear()).append("|");
            stringBuilder.append(vehicle.getMake()).append("|");
            stringBuilder.append(vehicle.getModel()).append("|");
            stringBuilder.append(vehicle.getVehicleType()).append("|");
            stringBuilder.append(vehicle.getColor()).append("|");
            stringBuilder.append(vehicle.getOdometer()).append("|");
            stringBuilder.append(vehicle.getPrice()).append("|");
            stringBuilder.append(salesContract.getSalesTaxAmount()).append("|");
            stringBuilder.append(salesContract.getRecordingFee()).append("|");
            stringBuilder.append(salesContract.getTotalPrice()).append("|");
            stringBuilder.append(salesContract.isFinanced() ? "YES" : "NO").append("|");
            stringBuilder.append(salesContract.getMonthlyPayment());

        } else if (contract instanceof LeaseContract) {
            LeaseContract leaseContract = (LeaseContract) contract;

            // Format: LEASE|date|customerName|customerEmail|vin|year|make|model|type|color|odometer|price|expectedEndingValue|leaseFee|totalPrice|monthlyPayment
            stringBuilder.append("LEASE|");
            stringBuilder.append(contract.getContractDate()).append("|");
            stringBuilder.append(contract.getCustomerNames()).append("|");
            stringBuilder.append(contract.getCustomerEmail()).append("|");
            stringBuilder.append(vehicle.getVin()).append("|");
            stringBuilder.append(vehicle.getYear()).append("|");
            stringBuilder.append(vehicle.getMake()).append("|");
            stringBuilder.append(vehicle.getModel()).append("|");
            stringBuilder.append(vehicle.getVehicleType()).append("|");
            stringBuilder.append(vehicle.getColor()).append("|");
            stringBuilder.append(vehicle.getOdometer()).append("|");
            stringBuilder.append(vehicle.getPrice()).append("|");
            stringBuilder.append(leaseContract.getTotalPrice()).append("|");
            stringBuilder.append(leaseContract.getMonthlyPayment());
        }

        return stringBuilder.toString();
    }


}
