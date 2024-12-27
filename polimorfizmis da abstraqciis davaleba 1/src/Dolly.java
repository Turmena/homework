class Dolly extends Toy {
    double hairCost;
    double clothingCost;
    double additionalCosts;

    public Dolly(double hairCost, double clothingCost, double additionalCosts) {
        this.hairCost = hairCost;
        this.clothingCost = clothingCost;
        this.additionalCosts = additionalCosts;
    }

    @Override
    public double calculatePrice() {
        return hairCost + clothingCost + additionalCosts;
    }
}
