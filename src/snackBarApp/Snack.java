package snackBarApp;

import java.text.DecimalFormat;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getCost() {
        return cost;
    }
    public int getVendingMachineId() {
        return vendingMachineId;
    }

    // setters
    public void setName(String name) {
        this.name = name; 
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    // other methods
    public void addQuantity(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }
    public void quantityBought(int quantityToSubtract) {
        this.quantity -= quantityToSubtract;
    }
    public double getTotalCost(int quantity) {
        return quantity * cost;
    }
    public String toDollarFormat(double dollar) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return "$" + formatter.format(dollar);
    }
}