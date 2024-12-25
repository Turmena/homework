public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(2.5, 5, 1.0);
        Cake cake = new Cake(4.0, 7, 0.5);
        Sandwich sandwich = new Sandwich(3.0, 2, 15.0);

        Product[] products = {milk, cake, sandwich};
        Store store = new Store(products);

        for (Product product : store.getProducts()) {
            if (product instanceof Milk) {
                Milk m = (Milk) product;
                System.out.println("Milk: Price = " + m.getPrice() + ", Expiration = " + m.getExpiration() + ", Volume = " + m.getVolume());
            } else if (product instanceof Cake) {
                Cake c = (Cake) product;
                System.out.println("Cake: Price = " + c.getPrice() + ", Expiration = " + c.getExpiration() + ", Weight = " + c.getWeight());
            } else if (product instanceof Sandwich) {
                Sandwich s = (Sandwich) product;
                System.out.println("Sandwich: Price = " + s.getPrice() + ", Expiration = " + s.getExpiration() + ", Length = " + s.getLength());
            }
        }
    }
}
