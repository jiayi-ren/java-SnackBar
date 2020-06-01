package snackBarApp;

import java.text.DecimalFormat;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCashOnHand() {
        return cashOnHand;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void addCashOnHand(double cash) {
        this.cashOnHand += cash;
    }
    public void buySnacks(double totalCost) {
        this.cashOnHand -= totalCost;
    }

    // other methods
    public String toDollarFormat(double dollar) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return "$" + formatter.format(dollar);
    }
}