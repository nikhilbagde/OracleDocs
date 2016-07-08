package DataStructure.Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nikhil on 7/7/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        Set<String> unique = new HashSet<String>();
        Set<String> dups = new HashSet<String>();

        for (String a: args) {
            if(!unique.add(a)){
                dups.add(a);
            }
        }
        unique.removeAll(dups);
        System.out.println("Unique Words: " + unique);
        System.out.println("Duplicate Words: " + dups);

    }
}
