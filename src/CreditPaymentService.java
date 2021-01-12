public class CreditPaymentService {
    public double calculate(double percent, int time, double sum) {
        double percentmounth = percent / 100 / 12;
        double pow = Math.pow(1 + percentmounth, time);
        double mounthpay = sum * (percentmounth * pow) / (pow - 1);
        return mounthpay;
    }

}
