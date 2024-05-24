class Superman extends Kryptonian implements IFlyer {
    private String name;

    Superman(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println("Leaping into the sky.");
    }

    public void land() {
        System.out.println("Lands with a thud.");
    }

    public void fly() {
        System.out.println("Flying faster than a speeding bullet.");
    }

    public void eat() {
        System.out.println("Eating at the Daily Planet cafeteria.");
    }

    // Method untuk mendapatkan nama Superman
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "I'm " + this.name + "\nBangsa : Kryptonian\nMakan : Nasi Goreng";
    }
}
