package lesson4;

import java.util.List;

public class User {
    private int userId;
    private List<Integer> list;

    public User(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public User setList(List<Integer> list) {
        this.list = list;
        return this;
    }

    public List<Integer> getList() {
        return list;
    }
}
