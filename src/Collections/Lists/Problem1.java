package Collections.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikhil on 7/7/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Item1");
        list1.add("Item2");
        list1.add("Item3");
        list1.add("Item4");
        list1.add("Item5");
        list1.add("Item6");

        System.out.println(list1);

        //Remove:
        list1.remove(0);

        System.out.println(list1);

    }
}
