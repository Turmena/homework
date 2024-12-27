class RegularPolygon {
    int sides;
    double length;

    public RegularPolygon(int sides, double length) {
        this.sides = sides;
        this.length = length;
    }

    public double perimeter() {
        return sides * length;
    }
}
