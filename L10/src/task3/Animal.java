package task3;

public class Animal {
    private String type;
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(String type, int age, String name) {
        this.type = type;
        this.age = age;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
