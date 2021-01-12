public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double mounthpay = service.calculate(9.99,12,1000000);
        System.out.printf("%.0f\n", mounthpay);

        CreditPaymentService service1 = new CreditPaymentService();

        double mounthpay1 = service.calculate(9.99,24,1000000);
        System.out.printf("%.0f\n", mounthpay1);

        CreditPaymentService service2 = new CreditPaymentService();

        double mounthpay2 = service.calculate(9.99,36,1000000);
        System.out.printf("%.0f\n", mounthpay2);

    }
}
