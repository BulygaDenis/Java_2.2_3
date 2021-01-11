public class CreditPaymentService {
    public double calculate (double percent, int time, double sum){
        double percentmounth = percent/100/12;
        double pow = (long) Math.pow(1+percent,time);
        double mounthpay = sum * (percentmounth*pow)/(pow-1);
        return mounthpay;
    }

}
