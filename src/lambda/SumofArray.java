package lambda;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;


public class SumofArray {
    public static int [] array = IntStream.rangeClosed(0,500).toArray();
    public static int totlal = IntStream.rangeClosed(0,500).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i =0; i<10; i++){
                    sum+=i;
                }
                System.out.println( "traditional way " +sum);
            }
        };
        new Thread(runnable).start();
        Runnable runnable1= () -> {
            int sum = 0;
            for (int i =0; i<10; i++){
                sum+=i;
            }
            System.out.println("lambda way "+ sum);
        };
        new Thread(runnable1).start();

        Callable callable = () -> {

            int sum=0;
            for (int i=0; i< array.length/2; i++ ){
                sum = sum + array[i];
            }
      return sum;
        };

        Callable callable2 = () -> {

            int sum=0;
            for (int i=array.length/2; i< array.length;i++){
                sum = sum + array[i];
            }
            return sum;
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> task = Arrays.asList(callable,callable2);
        List<Future<Integer>> results = executorService.invokeAll(task);
       int k=0;
       int sum = 0;
       for (Future<Integer> result:results){
           sum = sum+result.get();
           System.out.println(" sum of thread "+ ++k +" is "+sum);
       }
        System.out.println(sum);
        System.out.println(totlal);
        executorService.shutdown();
    }
}
