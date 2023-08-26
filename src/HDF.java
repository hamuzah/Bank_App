import java.util.UUID;

public class HDF implements BankAccountInterface{


   private String name;

   private String password;

   private String acctno;//unique

   private double balance;

   final double rateofinterest=7.1;

  //default constructor
    public HDF() {
       }
       //parameterised constructor
    public HDF(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.acctno = String.valueOf(UUID.randomUUID());
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    public double getBalance() {
        return balance;
    }





    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    @Override
    public String fetchbalance(String password) {
         if(this.password.equals(password)){
             return "your account balance is "+ this.balance;
         }
         return "incorrect password!!!";
    }

    @Override
    public String addmoney(double amount) {
        this.balance += amount;

        return "amount added successfully, your new balance is " + this.balance;
    }

    @Override
    public String withdraw(double amount, String password) {
        if(this.password.equals(password)){
           if(this.balance < amount){
               return "insufficient balance";
           }
           this.balance -=amount;
           return "amount deducted successfully, your balance is"+ this.balance;
        }

        return "incorrect password";
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword)){
            newpassword = oldpassword;
            return "password changed successfully";
        }
        return "incorrect old password";
    }

    @Override
    public double rateofinterest(int year) {
        return (this.balance*year*rateofinterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDF{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", acctno='" + acctno + '\'' +
                ", balance=" + balance +
                ", rateofinterest=" + rateofinterest +
                '}';
    }
}
