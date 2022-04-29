public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm, float interestRate) {
        int months = -(loanTerm * 12);
        float monthInterestRate = interestRate / (100 * 12); // Рассчет процентной ставки в месяц

        float value1 = 1 + monthInterestRate;               //Переменные расчета для подставления в общую формулу
        double value2 = Math.pow(value_1, months);

        int monthlyPay = (int) (loanAmount * (monthInterestRate / (1 - value_2))); // формула рассчета аннуитета

        return monthlyPay;
    }
}




