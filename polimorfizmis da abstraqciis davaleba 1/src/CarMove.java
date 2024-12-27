class CarMove implements Move, Direction {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void left() {
        System.out.println("Car turned left");
    }

    @Override
    public void right() {
        System.out.println("Car turned right");
    }
}
