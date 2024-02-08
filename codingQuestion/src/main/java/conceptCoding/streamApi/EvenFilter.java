package conceptCoding.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenFilter {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(List.of(1,2,3,4,5,6,7,8,9,10,21,23,24,18));
        list1.add(87);
        System.out.println(list1);

        Stream <Integer> stream = list1.stream();
        List<Integer> streamList = stream.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(streamList);

        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(2,4,6,10,12,1,54,8,71,34,80,57));
        List<Integer> filterList = list.stream().filter(i -> i>12).collect(Collectors.toList());
        System.out.println(filterList);
    }
}
