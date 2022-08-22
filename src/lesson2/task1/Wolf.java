package lesson2.task1;

public class Wolf implements Bitable {
    @Override
    public void bite() {
        System.out.println("Волк кусает");
    }

    @Override
    public String toString() {
        return "Волк";
    }
}
