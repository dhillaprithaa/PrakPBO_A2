class Bird extends Animal implements IFlyer {
    public void takeOff() {
        System.out.println("Flapping wings to take off.");
    }

    public void land() {
        System.out.println("Landing smoothly.");
    }

    public void fly() {
        System.out.println("Flying high.");
    }

    public void eat() {
        System.out.println("Eating seeds.");
    }
}