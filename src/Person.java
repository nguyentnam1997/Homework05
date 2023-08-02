public class Person {

    private int id;
    public static int auId;  //tạo biến tĩnh để cho id tự động tăng
    private String name;
    private int age;
    public Person(String name, int age) {
        this.id = ++auId;
        this.name = name;
        this.age = age;
    }
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", tên: " + name +
                ", tuổi: " + age +
                ", ";
    }
}
