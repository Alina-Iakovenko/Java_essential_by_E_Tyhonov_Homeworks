package task3;

@SuperClassAnnotation("This is a superclass annotation")
class SuperClassWithAnnotation {
    @FieldAnnotation("This is a field annotation")
    private int field;

    @MethodAnnotation("This is a method annotation")
    public void method(@ParameterAnnotation("This is a parameter annotation") int param) {
        // ...
    }
}
