package lambda.functionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class MedhodRefrencesExp {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = instructor -> instructor.isOnlinecourse();
        Predicate<Instructor> p2 = Instructor::isOnlinecourse;

        Function<Integer, Double> sqrt= a -> Math.sqrt(a);
        Function<Integer, Double> sqrt1 = Math::sqrt;

        Function<String, String> lowercaseFunction = s -> s.toLowerCase();
        Function<String, String> lowercaseFunction1 = String::toLowerCase;

    }
}
