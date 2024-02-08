package conceptCoding.streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods1 {
    public static void main(String[] args) {
        List<String> listofWords = List.of("Aman","Stroke","Animal","Atanu","Moonbeam","Salt","Andrew");
        List<String> listOfwordsNew = listofWords.stream().filter(e -> e.startsWith(String.valueOf('A'))).collect(Collectors.toList());
        System.out.println(listOfwordsNew);

        List<Integer> list = List.of(2,35,67,8,12,567,22,56);
        List <Integer>newList = list.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(newList);
        newList.stream().sorted().forEach(System.out::println);
        list.stream().sorted().forEach(System.out::println);

        Integer max = newList.stream().max((x,y) -> x.compareTo(y)).get();
        Integer min = list.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);


    }
}
