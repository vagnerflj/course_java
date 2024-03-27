package entities;

public class OutsorcedEmployee extends Employee {
    private Double addtionalCharge;
    public OutsorcedEmployee(){
        super();
    }
    public OutsorcedEmployee(String name, Integer hours, double valuePerhour, Double addtionalCharge) {
        super(name, hours, valuePerhour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }
    @Override
    public double payment(){
        return super.payment() + addtionalCharge * 1.1;
    }
}
