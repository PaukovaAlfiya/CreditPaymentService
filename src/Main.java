public class Main {
    public static void main(String[] args) {
        annuityPayment service = new annuityPayment();
        double loanAmount = 1_000_000.0; // сумма кредита
        double interestRate = 9.9; // годовая процентная ставка
        int month = 24; // срок кредита в месяцах
        double monthlyPayment = service.calculate(loanAmount, interestRate, month);
        System.out.println(monthlyPayment);
    }
}