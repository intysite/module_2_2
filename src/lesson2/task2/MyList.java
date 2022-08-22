package lesson2.task2;

import java.util.Arrays;

public class MyList<T> {
    private T[] objects = (T[]) new Object[3];
    private int size = 0;

    public boolean add(T object) {
        if(size == objects.length) {
            T[] newArray = (T[]) new Object[objects.length * 2];
            for (int i = 0; i < objects.length; i++) {
                newArray[i] = objects[i];
            }
            this.objects = newArray;
        }
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] == null) {
                objects[i] = object;
                break;
            }
        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        return "MyList {" +
                "objects = " + Arrays.toString(objects) +
                '}';
    }
}
