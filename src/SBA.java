import java.util.UUID;

public class SBA implements BankAccountInterface{

    private String name;

    private String acctno;

    private String password;

    private double balance;

    final double rate_of_interest = 6.1;

    //default constructor
    public SBA() {
    }

    //paramaterised constructor


    public SBA(String name,String password, double balance) {
        this.name = name;
        this.acctno = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate_of_interest() {
        return rate_of_interest;
    }




    @Override
    public String fetchbalance(String password) {
         if(this.password.equals(password)){
             return "your account balance is " + this.balance;
         }
         return "incorrect password please put correct password to view your balance";
    }

    @Override
    public String addmoney(double amount) {
         this.balance += amount;
         return  "your money has been deposited successfully and your new acct balance is " + this.balance;
    }

    @Override
    public String withdraw(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance < amount){
                return "insufficient balance";
            }
            this.balance -= amount;
            return "Amount deducted successfully your current balance is " + this.balance;
        }
        return "incorrect password";
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword)){
            newpassword = oldpassword;
            return  "password changed successfully";
        }
        return "incorrect old password";
    }

    @Override
    public double rateofinterest(int year) {
        return (this.balance*year*rate_of_interest)/100.0;
    }
}
