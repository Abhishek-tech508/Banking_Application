public class Main {
    public static void main(String[] args) {
       Account Abhishek = new Account("30862629229",5000,"saabhishek1@gmail.com","8265815489","Abhishek sharma");
       Abhishek.deposit_money(600);
       Abhishek.getAC_Number();
        System.out.println( "your current balance is "+Abhishek.getBalance());
       Abhishek.withdraw_money(1600);
        System.out.println( "your current balance is "+Abhishek.getBalance());
        System.out.println(Abhishek.getEmail());
        Abhishek.withdraw_money(500);
        Abhishek.withdraw_money(3200);
        Abhishek.withdraw_money(200);
        Abhishek.withdraw_money(50);
        Abhishek.withdraw_money(50);
    }
}