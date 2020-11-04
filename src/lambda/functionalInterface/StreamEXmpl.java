package lambda.functionalInterface;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEXmpl {

    public static void main(String[] args) {


    Predicate<Instructor> p1 = (i) -> i.isOnlinecourse()==true;
    Predicate<Instructor> p2 = (i) -> i.getYearsofexp()>1;

    Map<String, List<String>> map = Instructors.getAll()
            .stream()
            .filter(p1)
            .filter(p2)
            .peek(s-> System.out.println(s))
            .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
    }}
