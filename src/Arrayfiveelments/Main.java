package Arrayfiveelments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> integerList= new ArrayList<>(List.of(33,4,3,2,6,77));
        System.out.println(integerList);
        //Stream api solution
        integerList.stream().map(n->n*n)
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //imperative way
        ListComparator listComparator=new ListComparator();
        integerList.sort(listComparator);
        System.out.println(integerList);
    }
}
