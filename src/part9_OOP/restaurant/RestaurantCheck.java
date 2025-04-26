package part9_OOP.restaurant;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.178 レストランのお
public class RestaurantCheck {
    private int checkNumber;
    private double salesTaxPercent;
    private double subTotal;
    private int tableNumber;
    private String serverName;

    //Constructor
    public RestaurantCheck(int check, double tax, double subtotal, int table, String server){
        this.checkNumber = check;
        this.salesTaxPercent = tax;
        this.subTotal = subtotal;
        this.tableNumber = table;
        this.serverName = server;
    }

    //Getter
    public int getCheckNumber() {
        return checkNumber;
    }
    public double getSalesTaxPercent() {
        return salesTaxPercent;
    }
    public double getSubTotal() {
        return subTotal;
    }
    public int getTableNumber() {
        return tableNumber;
    }
    public String getServerName() {
        return serverName;
    }

    //Setter
    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }
    public void setSalesTaxPercent(double salesTaxPercent) {
        this.salesTaxPercent = salesTaxPercent;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    //Method
    public double calculateTotal(){
        return subTotal * (1 + this.getSalesTaxPercent());
    }

    public void printCheck(){
        String filename = String.format("check%03d.txt",this.checkNumber);

        try (PrintWriter checkWriter = new PrintWriter(filename)){
            checkWriter.println("=== CHECK DETAILS ===");
            checkWriter.printf("%-15s: %d%n", "Check Number", this.getCheckNumber());
            checkWriter.printf("%-15s: %.1f%%%n", "Sales Tax", this.getSalesTaxPercent());
            checkWriter.printf("%-15s: %s%n", "Subtotal",
                    NumberFormat.getCurrencyInstance().format(this.getSubTotal()));
            checkWriter.printf("%-15s: %s%n", "Total",
                    NumberFormat.getCurrencyInstance().format(this.calculateTotal()));
            checkWriter.printf("%-15s: %d%n", "Table Number", this.getTableNumber());
            checkWriter.printf("%-15s: %s%n", "Server", this.getServerName());
        } catch (FileNotFoundException e){
            System.out.printf("File %s not found.", filename);
        }


    }
}
