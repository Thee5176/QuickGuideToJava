package part9_OOP.bankaccount;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.171 BankAccount
public class BankAccount {
    private double amount;           //amount of money
    private double interestRate;     //saving interest rate
    private String name;             //account holder's name

    //Constructor
    public BankAccount(double amount, double interestRate, String name){
        this.amount = amount;
        this.interestRate = interestRate;
        this.name = name;
    }

    //Setter
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public double getAmount() {
        return amount;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public String getName() {
        return name;
    }

    //Method
    public void applyInterest(){
        double prev = this.amount;
        this.amount = this.amount * (1.00 + this.interestRate);
        System.out.printf("Account Balance: $%.2f -> $%.2f \n",prev,this.getAmount());
    }

    public static void main(String[] args){
        BankAccount MyAccount = new BankAccount(1000.00, 0.03, "Thee");

        MyAccount.applyInterest();
        System.out.println(MyAccount.getAmount()); //1030.00
    }
}
