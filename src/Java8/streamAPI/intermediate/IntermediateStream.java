package Java8.streamAPI.intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class IntermediateStream {
    public static void main(String[] args) {

        /*These are interview gold:

        groupingBy() → grouping
        partitioningBy() → boolean split
        flatMap() → flatten
        sorted + limit → top N
        reduce / max → aggregation*/

        List<Integer> list= Arrays.asList(1,2,3,4,4,3,5);

        // 1 Find Second Highest Number

       Optional<Integer> number=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(number);


        // 2 Print duplicate numbers.
        //Set contains unique elements only that why which element cannot be added comes under the dublicate category

        Set<Integer> set= new HashSet<>();
        list.stream().filter(x->!set.add(x)).forEach(System.out::println);


        // 3 Count occurrences of each number.

       Map<Integer,Long>map= list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);

        // 4 Split numbers into even and odd.

       Map<Boolean,List<Integer>> p= list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(p);

        //5 Get top 3 maximum numbers.
     List<Integer>numbers=   list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(numbers);

    }
}
