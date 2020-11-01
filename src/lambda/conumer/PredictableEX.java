package lambda.conumer;

import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredictableEX {
    public static void main(String[] args) {
        Predicate<Integer> p1 = j -> j>10;
        System.out.println(p1.test(100));

        Predicate<Integer> p2 = j -> j%2 ==0;
        System.out.println(p1.or(p2).test(20));

        System.out.println(p1.and(p2).test(4));

        Predicate<Instructor> p3 = (i) -> i.isOnlinecourse()==false;
        //instructor experience is >10 years
        Predicate<Instructor> p4 = (i) -> i.getYearsofexp() >1;

        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            if (p3.test(instructor)){
                System.out.println(instructor);
            }
        });

        // is instructor teaches online and exprience is > 10 years
        System.out.println("---------------------");
        instructors.forEach(instructor ->  {
            if(p3.and(p4).test(instructor)){
                System.out.println(instructor);
            }
        });
        IntPredicate p5 = (i) -> i>100;
        System.out.println(p5.test(100));

        LongPredicate p6 = (i) -> i>100L;
        System.out.println(p6.test(1111111111111111111L));

        DoublePredicate p7 = (i) -> i<100.25;
        DoublePredicate p8 = (i) -> i>100.10;
        System.out.println(p7.and(p8).test(100.15));
    }
}
