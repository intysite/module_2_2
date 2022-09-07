package lesson6;

import java.util.Objects;

public class UserBroken {
    private int age;
    private String name;

    public UserBroken(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 25;
    }

    @Override
    public String toString() {
        return "UserBroken{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
