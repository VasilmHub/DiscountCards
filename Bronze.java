public class Bronze extends BaseCard {
    public Bronze(double turnover) {
        super(turnover, 0);
        if(getTurnover()>=100&&getTurnover()<=300) {
            super.setDiscountRate(1);
        }else if(getTurnover()>300) {
            super.setDiscountRate(2.5);
        }
    }

}
