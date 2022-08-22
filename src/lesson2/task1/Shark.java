package lesson2.task1;

public class Shark implements Swimable {
    @Override
    public void swim() {
        System.out.println("Акула плывет");
    }

    @Override
    public String toString() {
        return "Акула";
    }
}
