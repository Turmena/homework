class EquilateralTriangle extends RegularPolygon {
    public EquilateralTriangle(double length) {
        super(3, length);
    }

    @Override
    public double perimeter() {
        return 3 * length;
    }
}
