class Car extends Toy {
    double pricePerWheel;
    int wheels;
    double salonPrice;
    double additionalCosts;

    public Car(double pricePerWheel, int wheels, double salonPrice, double additionalCosts) {
        this.pricePerWheel = pricePerWheel;
        this.wheels = wheels;
        this.salonPrice = salonPrice;
        this.additionalCosts = additionalCosts;
    }

    @Override
    public double calculatePrice() {
        return salonPrice + (pricePerWheel * wheels) + additionalCosts;
    }
}
