package lambda.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<String>  c1 = (x) -> System.out.println(x.length() + " the value of string "+ x);
        c1.accept("Mohamedsabribaazaoui");

        Consumer<Integer> d = (l) -> {
            System.out.println(l*l);
            System.out.println(l+l);
            System.out.println(l/l);
        };
        d.accept(5555);


        List<Instructor> instructor = Instructors.getAll();
        // looping throw all the instractors and printing value of instractors
        Consumer<Instructor> i = (s) -> System.out.println(s.getName());

        instructor.forEach(i);

        BiConsumer<String, List<String>> c = (name, course) -> System.out.println(name+ "course"+ course);

        instructor.forEach((instructr) -> {c.accept(instructr.getName(), instructr.getCourses());});
    }
}
