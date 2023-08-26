public interface BankAccountInterface {

    String fetchbalance(String password);

    String addmoney(double amount);

    String withdraw(double amount,String password);

    String changepassword(String oldpassword,String newpassword);

    double rateofinterest(int year);



}
