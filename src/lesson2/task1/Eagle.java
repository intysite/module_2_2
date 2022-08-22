package lesson2.task1;

public class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println("Орёл летит");
    }

    @Override
    public String toString() {
        return "Орёл";
    }
}
