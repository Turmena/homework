class Triangle extends Shape {
    double z;

    public Triangle(double x, double y, double z) {
        super(x, y, "Triangle");
        this.z = z;
    }

    @Override
    public void printData() {
        System.out.println(name + " - X: " + x + ", Y: " + y + ", Z: " + z);
    }

    @Override
    public double perimeter() {
        return x + y + z;
    }
}
