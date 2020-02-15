public class Silver extends BaseCard {
    public Silver(double turnover) {
        super(turnover, 2);
        if(getTurnover()>300){
            super.setDiscountRate(3.5);
        }
    }
}
