package model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService {
    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public double payment(Double amount, int months){
        if (months <1) {
            throw new InvalidParameterException("Months must be greater than 0");
        }
        return amount * Math.pow(1+interestRate/100, months);
    }

}