public class Gold extends BaseCard {
    protected Gold(double turnover) {
        super(turnover, 2);
        if(getTurnover()>=100){
        double temp=2+Math.ceil(getTurnover()/100);
        if(temp>10){
            temp=10;
        }
        super.setDiscountRate(temp);
        }
    }
}
