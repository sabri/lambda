package lambda.functionalInterface.others;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll() {
        Instructor i1 = new Instructor("sabr", 1, "Male", true, Arrays.asList("java", "c", "python"));
        Instructor i2 = new Instructor("sabr", 2, "Male", false, Arrays.asList("java", "c", "python"));
        Instructor i3 = new Instructor("sabr", 3, "Male", true, Arrays.asList("java", "c", "python"));
List<Instructor> list = Arrays.asList(i1,i2,i3);
return list;
    }

}
