import interfaces.Card;

public abstract class BaseCard implements Card {
    private double turnover;
    private double discountRate;

    protected BaseCard(double turnover, double discountRate) {
        this.setTurnover(turnover);
        this.setDiscountRate(discountRate);
    }

    protected double getTurnover() {
        return turnover;
    }

    private void setTurnover(double turnover) {
        if(turnover<0){
            System.out.println("Incorrect turnover, it is set as 0!");
            this.turnover=0;
        }
        this.turnover = turnover;
    }

    protected void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String toString(double value) {
        return String.format("Purchase value: $%.2f%n" +
                "Discount rate: %.1f%%%n" +
                "Discount: $%.2f%n" +
                "Total: $%.2f",
                value,
                this.discountRate,
                this.calculateDiscount(value),
                value - this.calculateDiscount(value));
    }

    @Override
    public double calculateDiscount(double valueOfPurchase) {
        return valueOfPurchase * (this.discountRate/100) ;
    }
}
