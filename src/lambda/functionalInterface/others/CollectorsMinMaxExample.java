package lambda.functionalInterface.others;



import lambda.functionalInterface.Instructor;
import lambda.functionalInterface.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        //instructor with minimum years of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(
                        Instructor::getYearsofexp)));
        System.out.println("instructor = " + instructor);
        System.out.println("---------------");

        instructor = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsofexp));
        System.out.println("instructor = " + instructor);

       instructor = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(
                        Instructor::getYearsofexp)));
        System.out.println("instructor = " + instructor);
        System.out.println("---------------");

        instructor = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsofexp));
        System.out.println("instructor = " + instructor);


    }
}
