package task3;

import java.lang.annotation.Annotation;

//public class Main {
//    public static void main(String[] args) {
//        Class<ChildClassWithInheritedAnnotation> childClass = ChildClassWithInheritedAnnotation.class;
//
//        SuperClassAnnotation superClassAnnotation = childClass.getAnnotation(SuperClassAnnotation.class);
//        if (superClassAnnotation != null) {
//            System.out.println("SuperClass Annotation: " + superClassAnnotation.value());
//        }
//
//        ChildClassAnnotation childClassAnnotation = childClass.getAnnotation(ChildClassAnnotation.class);
//        if (childClassAnnotation != null) {
//            System.out.println("ChildClass Annotation: " + childClassAnnotation.value());
//        }
//
//        Annotation[] annotations = childClass.getAnnotations();
//        System.out.println("Other Annotations:");
//        for (Annotation annotation : annotations) {
//            if (annotation instanceof SuperClassAnnotation || annotation instanceof ChildClassAnnotation) {
//                continue;
//            }
//            System.out.println(annotation.annotationType().getSimpleName());
//        }
//    }
//}



public class Main {
    public static void main(String[] args) {
        Class<ChildClassWithInheritedAnnotation> childClass = ChildClassWithInheritedAnnotation.class;

        Annotation[] annotations = childClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof SuperClassAnnotation || annotation instanceof ChildClassAnnotation) {
                System.out.println( annotation.annotationType().getSimpleName());
            }
        }
    }
}