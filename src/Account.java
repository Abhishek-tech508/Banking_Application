public class Account {
    private String AC_Number;
    private double Balance;
    private String Email;
    private String Phone_number;
    private String Name;

    public Account(String AC_Number, double balance, String email, String phone_number, String name) {
        this.AC_Number = AC_Number;
        Balance = balance;
        Email = email;
        Phone_number = phone_number;
        Name = name;
    }

    public String getAC_Number() {
        return AC_Number;
    }

    public void setAC_Number(String AC_Number) {
        this.AC_Number = AC_Number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void deposit_money(double deposited_money){
        Balance+=deposited_money;
        System.out.println(Balance);
    }
    public void withdraw_money(double withdraw_money){
       if(Balance-withdraw_money<0){
           System.out.println("Withdraw unsuccessful because your current balance does not enough:"+Balance);
       }
       else {
           Balance-=withdraw_money;
           System.out.println(" Withdraw is successful and your current balancce is :"+Balance);

       }
    }
}
