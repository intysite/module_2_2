package lesson2.task1;

public class Tiger implements Bitable {
    @Override
    public void bite() {
        System.out.println("Тигр кусает");
    }

    @Override
    public String toString() {
        return "Тигр";
    }
}
