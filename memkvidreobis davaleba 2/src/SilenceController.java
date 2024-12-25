class SilenceController extends Employee {
    private double strictness;

    public SilenceController(String firstName, String lastName, String id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    public double getStrictness() {
        return strictness;
    }

    public void setStrictness(double strictness) {
        this.strictness = strictness;
    }

    @Override
    public String toString() {
        return super.toString() + ", SilenceController{strictness=" + strictness + "}";
    }
}
