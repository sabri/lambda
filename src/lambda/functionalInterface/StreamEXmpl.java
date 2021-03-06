package lambda.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEXmpl {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        System.out.println("--------");
        System.out.println(names);

        names.remove("Syed");
        System.out.println("--------");
        System.out.println(names);

        for (String name:names){
            System.out.println(name);
        }
        System.out.println("--------");
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("--------");
        for (String name:names){
            System.out.println(name);
        }



        Stream<String> namesStream = names.stream();
        System.out.println("--------");
        namesStream.forEach(System.out::println);
        System.out.println("--------");
        List<String> list2 = names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
        System.out.println(list2);


    Predicate<Instructor> p1 = (i) -> i.isOnlinecourse()==true;
    Predicate<Instructor> p2 = (i) -> i.getYearsofexp()>1;

   Set<String> list = Instructors.getAll()
            .stream()
            .map(Instructor::getName)
            .map(String::toUpperCase)
            .peek(s-> System.out.println(s))
            .collect(Collectors.toSet());

       Set<String> listCOURSE = Instructors.getAll()
                .stream()
                .map(Instructor::getCourses)
               .flatMap(List::stream)
                .peek(s-> System.out.println(s))
                .collect(Collectors.toSet());
    }}
