class Rectangle extends Shape {
    public Rectangle(double x, double y) {
        super(x, y, "Rectangle");
    }

    @Override
    public void printData() {
        System.out.println(name + " - X: " + x + ", Y: " + y);
    }

    @Override
    public double perimeter() {
        return 2 * (x + y);
    }
}
