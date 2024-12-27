abstract class Shape {
    double x, y;
    String name;

    public Shape(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void printData() {
        System.out.println(name + " - X: " + x + ", Y: " + y);
    }

    public abstract double perimeter();
}
