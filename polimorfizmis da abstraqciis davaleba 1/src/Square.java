class Square extends RegularPolygon {
    public Square(double length) {
        super(4, length);
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}
