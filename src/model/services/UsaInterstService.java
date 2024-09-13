package model.services;

public class UsaInterstService implements InterestService {
    private Double interestRate;

    public UsaInterstService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}