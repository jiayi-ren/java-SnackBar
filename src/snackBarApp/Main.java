package snackBarApp;

import java.lang.reflect.Array;

import snackBarApp.Snack;
import snackBarApp.VendingMachine;

public class Main {

    private static void snackBar() {
        
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);

        // Jane buys 3 Soda
        int quantity = 3;
        soda.quantityBought(quantity);
        jane.buySnacks(soda.getTotalCost(quantity));
        System.out.println("Customer 1 cash on hand $" + jane.getCashOnHand());
        System.out.println("Quantity of snack 4 is " + soda.getQuantity() + "\n");

        // Jane buys 1 Pretzel
        quantity = 1;
        pretzel.quantityBought(quantity);
        jane.buySnacks(pretzel.getTotalCost(quantity));
        System.out.println("Customer 1 cash on hand $" + jane.getCashOnHand());
        System.out.println("Quantity of snack 3 is " + pretzel.getQuantity() + "\n");

        // Bob buys 2 Soda
        quantity = 2;
        soda.quantityBought(quantity);
        bob.buySnacks(soda.getTotalCost(quantity));
        System.out.println("Customer 2 cash on hand $" + bob.getCashOnHand());
        System.out.println("Quantity of snack 4 is " + soda.getQuantity() + "\n");

        // Jane finds $10
        jane.addCashOnHand(10);
        System.out.println("Customer 1 cash on hand $" + jane.getCashOnHand() + "\n");

        // Jane buys 1 Chocolate Bar
        quantity = 1;
        chocolateBar.quantityBought(quantity);
        jane.buySnacks(chocolateBar.getTotalCost(1));
        System.out.println("Customer 1 cash on hand $" + jane.getCashOnHand());
        System.out.println("Quantity of snack 2 is " + chocolateBar.getQuantity() + "\n");

        // add 12 to Pretzel
        pretzel.addQuantity(12);
        System.out.println("Quantity of snack 3 is "+ pretzel.getQuantity() + "\n");

        // Bob buys 3 Pretzel
        quantity = 3;
        pretzel.quantityBought(quantity);
        bob.buySnacks(pretzel.getTotalCost(3));
        System.out.println("Customer 2 cash on hand $" + bob.getCashOnHand());
        System.out.println("Quantity of snack 3 is " + pretzel.getQuantity() +"\n");


        // STRETCH
        System.out.println("Stretch Goals\n");

        // vending machine list
        VendingMachine[] vendingMachineList ;
        vendingMachineList = new VendingMachine[3];
        vendingMachineList[0] = food;
        vendingMachineList[1] = drink;
        vendingMachineList[2] = office;

        String vendingMachineName = "";  
        int vendingMachineId;

        // Chips
        Snack snack = chips;
        // Get Chips Vending Machine Name
        vendingMachineId = snack.getVendingMachineId();
        for (int i = 0; i < vendingMachineList.length; i++) {
            if(vendingMachineList[i].getId() == vendingMachineId) {
                vendingMachineName = vendingMachineList[i].getName();
            }
        }

        System.out.println("Snack: " + snack.getName());
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + snack.getQuantity());
        System.out.println("Vending Machine: " + snack.toDollarFormat(snack.getTotalCost(snack.getQuantity())) +"\n");

        // Chocolate Bar
        snack = chocolateBar;
        // Get Chocolate Bar Vending Machine Name
        vendingMachineId = chocolateBar.getVendingMachineId();
        for (int i = 0; i < vendingMachineList.length; i++) {
            if(vendingMachineList[i].getId() == vendingMachineId) {
                vendingMachineName = vendingMachineList[i].getName();
            }
        }

        System.out.println("Snack: " + snack.getName());
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + snack.getQuantity());
        System.out.println("Vending Machine: " + snack.toDollarFormat(snack.getTotalCost(snack.getQuantity())) +"\n");

        // Pretzel
        snack = pretzel;
        // Get Pretzel Vending Machine Name
        vendingMachineId = snack.getVendingMachineId();
        for (int i = 0; i < vendingMachineList.length; i++) {
            if(vendingMachineList[i].getId() == vendingMachineId) {
                vendingMachineName = vendingMachineList[i].getName();
            }
        }

        System.out.println("Snack: " + snack.getName());
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + snack.getQuantity());
        System.out.println("Vending Machine: " + snack.toDollarFormat(snack.getTotalCost(snack.getQuantity())) +"\n");

        // Soda
        snack = soda;
        // Get Soda Vending Machine Name
        vendingMachineId = snack.getVendingMachineId();
        for (int i = 0; i < vendingMachineList.length; i++) {
            if(vendingMachineList[i].getId() == vendingMachineId) {
                vendingMachineName = vendingMachineList[i].getName();
            }
        }

        System.out.println("Snack: " + snack.getName());
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + snack.getQuantity());
        System.out.println("Vending Machine: " + snack.toDollarFormat(snack.getTotalCost(snack.getQuantity())) +"\n");

        // Water
        snack = water;
        // Get Water Vending Machine Name
        vendingMachineId = snack.getVendingMachineId();
        for (int i = 0; i < vendingMachineList.length; i++) {
            if(vendingMachineList[i].getId() == vendingMachineId) {
                vendingMachineName = vendingMachineList[i].getName();
            }
        }

        System.out.println("Snack: " + snack.getName());
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + snack.getQuantity());
        System.out.println("Vending Machine: " + snack.toDollarFormat(snack.getTotalCost(snack.getQuantity())) +"\n");

    }

    public static void main(String[] args) {
        snackBar();
    }
}