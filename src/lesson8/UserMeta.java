package lesson8;
@GetMetaData
public class UserMeta {
    @GetMetaData
    private String name;
    private Integer count;

    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }
    @GetMetaData
    public void getSuperName(String prefix) {
        name = prefix + " " + name;
        System.out.println(name);
    }
}
