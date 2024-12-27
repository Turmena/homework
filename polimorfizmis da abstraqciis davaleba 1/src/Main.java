public class Main {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon(5, 6);
        System.out.println("Regular Polygon Perimeter: " + regularPolygon.perimeter());

        Square square = new Square(4);
        System.out.println("Square Perimeter: " + square.perimeter());

        EquilateralTriangle triangle = new EquilateralTriangle(5);
        System.out.println("Equilateral Triangle Perimeter: " + triangle.perimeter());

        Triangle triangleShape = new Triangle(3, 4, 5);
        triangleShape.printData();
        System.out.println("Triangle Perimeter: " + triangleShape.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.printData();
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Car toyCar = new Car(5, 4, 50, 10);
        System.out.println("Car price: " + toyCar.calculatePrice());

        Dolly dolly = new Dolly(10, 20, 5);
        System.out.println("Dolly price: " + dolly.calculatePrice());

        FixedSalaryEmployee fixedEmployee = new FixedSalaryEmployee("John", "Doe", "123-4567", 3000);
        System.out.println(fixedEmployee.firstName + " " + fixedEmployee.lastName + " salary: " + fixedEmployee.salary());

        HourlySalaryEmployee hourlyEmployee = new HourlySalaryEmployee("Jane", "Doe", "234-5678", 20, 150);
        System.out.println(hourlyEmployee.firstName + " " + hourlyEmployee.lastName + " salary: " + hourlyEmployee.salary());

        CarMove carMove = new CarMove();
        carMove.start();
        carMove.left();
        carMove.right();
        carMove.stop();
    }
}
