// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        HDF viva = new HDF("hamzah","1234ham",2000.0);
        System.out.println(viva);


        System.out.println(viva.addmoney(100000));

        System.out.println(viva.fetchbalance("123ham"));
        System.out.println(viva.fetchbalance("1234ham"));

        System.out.println(viva.changepassword("1234ham","ham123"));

        System.out.println("the rate of interest for 6 years is " + viva.rateofinterest(6));


        System.out.println();

        SBA sba = new SBA("kiggundu","1233hey",20000.0);
        System.out.println(sba);

        System.out.println(sba.addmoney(150000));

        System.out.println(sba.fetchbalance("1233hey"));

        System.out.println(sba.changepassword("1233hey","ham234"));

        System.out.println("the rate of interest for 2 years is " + sba.rateofinterest(2));





    }
}