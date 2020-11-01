package lambda.functionalInterface;

import java.util.function.Predicate;

public class ConvertToMethodRef {
    public static void main(String[] args) {
        Predicate<Instructor> p3 = Instructor::isOnlinecourse;

     Instructors.getAll().forEach(instructor -> {
         if (p3.test(instructor)){
             System.out.println(instructor);
         }
     });

    }


}
