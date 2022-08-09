package entities;

public class Individual extends TaxPayer {

    public Individual() {
    }

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getAnualincome() < 20000.0) {
            basicTax = getAnualincome() * 0.15;
        } else {
            basicTax = getAnualincome() * 0.25;
        }
        basicTax -= getHealthExpenditures() * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
