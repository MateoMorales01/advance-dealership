package com.yearup.dealership.ui;

import com.yearup.dealership.model.Contracts.Contract;
import com.yearup.dealership.data.ContractDataManager;
import com.yearup.dealership.model.Contracts.SalesContract;
import com.yearup.dealership.model.Contracts.Dealership;
import com.yearup.dealership.data.DealershipFileManager;
import com.yearup.dealership.model.Vehicle;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public void display() {

        boolean mainRunning = true;
        mainRunning :
        while (mainRunning) {
            System.out.println("""
                
            1.Sales Contract
            2.Find vehicles by make/model
            3.Find vehicles by year range
            4.Find vehicles by color
            5.Find vehicles by mileage range
            6.Find vehicles by type(car, truck, SUV, van)
            7.List all vehicles
            8.Add a vehicle
            9.Remove a vehicle
            10.Sales Contract""");

            try {
                String usersMainChoice = scanner.nextLine();
                switch (usersMainChoice) {
                    case "1" -> {

                    }
                }
            }
            }
//        Vehicle vehicle = new Vehicle();
        ContractDataManager contractDataManager = new ContractDataManager();
        Contract contract = new MySalesContract();

        System.out.println("Dealership App");

        DealershipFileManager dealershipFileManager = new DealershipFileManager();

        // Print all vehicles in the inventory
        System.out.println("Inventory for " + dealership.getAllVehicles().size() + " vehicles ");
        System.out.println("Dealership Inventory:\n");

        for (Vehicle vehicle : dealership.getAllVehicles()) {
            System.out.println(vehicle);
            System.out.println("---------------------------");
        }
    }

    private static class MySalesContract extends SalesContract {
        public MySalesContract() {
            super(LocalDate.now(), "JohnDoe", "JohnDoe@Gmail.com", "Lexis LFA", );
        }
    }
}
