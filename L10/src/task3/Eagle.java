package task3;

public class Eagle extends Animal implements Cloneable{
    public Eagle(String type, int age, String name) {
        super(type, age, name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
