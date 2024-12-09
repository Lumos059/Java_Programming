import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annualInterestRate,int numberOfYear,double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYear(int numberOfYear){
        this.numberOfYear = numberOfYear;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/(12 * 100);
        double f = (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));
        double monthlyPayment = loanAmount * monthlyInterestRate / f;
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYear * 12;
        return totalPayment;
    }

    public Date getLoanDate(){
        return loanDate;
    }
}