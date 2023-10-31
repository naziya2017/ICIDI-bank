package Management;

public class InterestCalculator {
    // Property
    protected static double interestRate = 3.15; 
    public InterestCalculator(double interestRate) {
        this.interestRate = interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public static double calculateSimpleInterest(double principal, int time) {
        return (principal * interestRate * time) / 100.0;
    }
    public static double calculateCompoundInterest(double principal, int time, int compoundingFrequency) {
        double ratePerPeriod = (interestRate / 100) / compoundingFrequency;
        int totalCompoundingPeriods = time * compoundingFrequency;
        return principal * Math.pow(1 + ratePerPeriod, totalCompoundingPeriods) - principal;
    }
    
}

