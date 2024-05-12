public class Bond {
    private int term; // in months
    private double interestRate;
    private int monthsRemaining;

    public Bond(int term) {
        if (term < 1 || term > 60) {
            throw new IllegalArgumentException("Term must be between 1 and 60 months");
        }
        this.term = term;
        this.monthsRemaining = term;
        setInterestRate();
    }

    private void setInterestRate() {
        if (term <= 11) {
            interestRate = 0.005;
        } else if (term <= 23) {
            interestRate = 0.01;
        } else if (term <= 35) {
            interestRate = 0.015;
        } else if (term <= 47) {
            interestRate = 0.02;
        } else {
            interestRate = 0.025;
        }
    }

    public void earnInterest() {
        if (monthsRemaining > 0) {
            // calculate interest earned this month
            double interestEarned = interestRate;
            // update months remaining
            monthsRemaining--;
            if (monthsRemaining == 0) {
                System.out.println("Bond has matured!");
            }
        }
    }

    public int getTerm() {
        return term;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getMonthsRemaining() {
        return monthsRemaining;
    }
}