public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double mounthpay = service.calculate(9.99,12,1000000);


        System.out.println(mounthpay);

    }
}
