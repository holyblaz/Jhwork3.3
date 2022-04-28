public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int firstCredit = service.calculate(1_000_000, 1, 9.99f);
        System.out.println("Ежемесячный платеж: " + firstCredit);

        int secondCredit = service.calculate(1_000_000, 2, 9.99f);
        System.out.println("Ежемесячный платеж: " + secondCredit);

        int thirdCredit = service.calculate(1_000_000, 3, 9.99f);
        System.out.println("Ежемесячный платеж: " + thirdCredit);
    }
}
