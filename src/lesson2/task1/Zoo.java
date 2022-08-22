package lesson2.task1;

public class Zoo<K extends Flyable, T extends Swimable, V extends Bitable> {
    private K flyingAnimal;
    private T swimmingAnimal;
    private V bitingAnimal;

    public Zoo(K flyingAnimal, T swimmingAnimal, V bitingAnimal) {
        this.flyingAnimal = flyingAnimal;
        this.swimmingAnimal = swimmingAnimal;
        this.bitingAnimal = bitingAnimal;
    }

    public K getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(K flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public T getSwimmingAnimal() {
        return swimmingAnimal;
    }

    public void setSwimmingAnimal(T swimmingAnimal) {
        this.swimmingAnimal = swimmingAnimal;
    }

    public V getBitingAnimal() {
        return bitingAnimal;
    }

    public void setBitingAnimal(V bitingAnimal) {
        this.bitingAnimal = bitingAnimal;
    }

    public void feedFlyable() {
        System.out.println(flyingAnimal + " ест");
        flyingAnimal.fly();
    }

    public void feedSwimable() {
        System.out.println(swimmingAnimal + " ест");
        swimmingAnimal.swim();
    }

    public void feedBitable() {
        System.out.println(bitingAnimal + " ест");
        bitingAnimal.bite();
    }
}
