abstract class Animal {
    abstract void eat();
    public String toString() {
        return this.getClass().getSimpleName();
    }
}