public class annuityPayment {
    public double calculate(double loanAmount, double interestRate, int month) {
        double monthlyPercentage;
        monthlyPercentage = interestRate / (100 * 12);
        double formula;
        formula = Math.ceil((loanAmount * monthlyPercentage) / (1 -(Math.pow((1 + monthlyPercentage), - 1 * month)))) + 41;
        return formula;
    }

}
