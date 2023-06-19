package SalaryCalculator;

public class SalaryCalculator {
    private double basesalary = 1000.00;
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped < 5 ? 1 : .85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        int multiplier = multiplierPerProductsSold(productsSold);
        return productsSold * multiplier;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double multiplierPerDaysSkipped = multiplierPerDaysSkipped(daysSkipped);
        double bonusForProductSold = bonusForProductSold(productsSold);
        double result = basesalary * multiplierPerDaysSkipped + bonusForProductSold;
        return result < 2000 ? result : 2000;
    }
}
