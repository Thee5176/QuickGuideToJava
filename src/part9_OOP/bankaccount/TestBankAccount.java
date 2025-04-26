package part9_OOP.bankaccount;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.172 test for BankAccount
public class TestBankAccount {
    public static void main(String[] args){
        BankAccount JuanAccount = new BankAccount(1000,0.03,"Juan De Hattatime");
        JuanAccount.applyInterest();
        JuanAccount.setInterestRate(0.02);
        JuanAccount.applyInterest();
    }
}
