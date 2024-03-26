package entities;

public class BusinessAccount extends Account{

    private Double loanLimit;
    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
}
