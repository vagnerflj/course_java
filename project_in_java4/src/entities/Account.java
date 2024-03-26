package entities;
//Class
public class Account {
    private int number;
    private String holder;
    private double balance;
//Construtor com 2 argumentos
    public Account(int number, String holder){
       this.number = number;
       this.holder = holder;
    }
    //construtor com 3 argumentos
    public Account(int number, String holder, double inicialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);

    }
    public int getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(){
        this.holder = holder;
    }
    public  double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
