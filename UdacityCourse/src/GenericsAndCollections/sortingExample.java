package GenericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;

public class sortingExample {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ram");
        names.add("Adarsh");
        names.add("Rakesh");
        names.add("Sunny");
        names.add("Tushar");
        System.out.println("----Before Sorting-----");
        for(String name:names)
            System.out.println(name);
        Collections.sort(names);
        System.out.println("----After Sorting-----");
        for(String name:names)
            System.out.println(name);
    }
}
