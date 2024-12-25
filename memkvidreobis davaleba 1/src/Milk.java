class Milk extends Product {
    private double volume;

    public Milk(double price, int expiration, double volume) {
        super(price, expiration);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
