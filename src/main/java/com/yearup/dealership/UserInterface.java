package com.yearup.dealership;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public void display() {

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
