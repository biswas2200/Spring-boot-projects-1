package conceptCoding.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream object
public class StreamObject {
    public static void main(String[] args) {
       //1- Using blank
        Stream<Objects> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        //2- Using array,object,collection
        String[] words = {"cable","button","pad","keys","objects"};
        Stream<String> stream1 = Stream.of(words);
        stream1.forEach(e -> {
            System.out.println(e);
        });
        //same as above but using method reference.
        String[] words2 = {"cable","button","pad","keys","objects"};
        Stream<String> stream2 = Stream.of(words2);
       // stream2.forEach(System.out::println);

        //2.1 -Using array,object,collection
        IntStream intStream = Arrays.stream(new int[]{2,3,4,5,71,35,14,9});
        intStream.forEach(System.out::println);

        //3- Using StreamBuilder
        Stream<Object> streamBuilder = Stream.builder().build();

        //4- Using Lists/Sets etc.
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(List.of(12,14,27,75,85,23,42));
        Stream <Integer> stream = list1.stream();
       // stream.forEach(System.out::println);
        stream.forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
