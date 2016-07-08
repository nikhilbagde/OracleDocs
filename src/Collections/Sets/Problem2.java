package Collections.Sets;

import java.util.*;

/**
 * Created by Nikhil on 7/8/2016.
 */
//Step 1: Implement comparable
//Now even I implement comparable and not comparator and override compare //
// Tree Set will of course compares objects internal elemets
// in this case it would be string
// and on basis of that string natural order
// It will add objects but It wont add objects with same length
// If I compare them on the basis of length, as all strings have same length.

class Person implements Comparable<Person> {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    //Case 1: Try out compare method on pure string
    // To get natural order of Objects private element
    //This will work for natural order for String name.
    // And It wont accept duplicate names

    /*public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
*/
    //Case 2: Try out compare method on basis of their length
    // Following function will add only 1 item why ?
    // Since all items have same lenth, when it store first eleemt of length 1
    // for all next items whose length is again 1, it wont add those elements as its a Set.
    /*public int compareTo(Person o) {
        int len1 = this.getName().length();
        int len2 = o.getName().length();

        if(len1 > len2){
            return 1;
        }else if( len1 < len2){
            return -1;
        }else{
            return 0;
        }
    }*/


    //Case 3: To solve above problem
    //Consider last case, when two strings are equal, they will return 0
    // So we can handle else case, and there when both string has same length
    // we can change logic
    // To accept that length but there again compare two string on natural order
    // and on basic of natural order again, store both string.
    // means if both strings are having same length
    // Then see if both are natural order equal or less or more. 1, -1, 0
    // if 1 means its in natural order , -1, before comes in natural order, and 0 means same, then skip adding
    public int compareTo(Person o) {
        int len1 = this.getName().length();
        int len2 = o.getName().length();

        if(len1 > len2){
            return 1;
        }else if( len1 < len2){
            return -1;
        }else{
            return  this.getName().compareTo(o.getName()); // at this case only string which are exactly will return 0, hence wont be added to set.
        }
    }
}
public class Problem2 {
    //To show what is exact difference between using Collection sort and Natural sort
    //Using TreeSet
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        Set<Person> set = new TreeSet<>();

        //When I try to insert and user defined type intem into tree set,
        //It wont allow me as user defiend type deinst have natureal order,
        // we have only hashCode of that object at hand
        // So to solve that, user defined type should implement comparable
        //And then override compare method to let Tree.put method know in which order
        // should items be inserted into treeSet.
        /**
         * 1. implement comparator
         * 2. Override compareto method
         * 3. Come back and add items to TreeSet.
         */
        putItem(set);
        printItem(set);

    }
    public static void putItem(Collection<Person> collection){
        collection.add(new Person("z"));
        collection.add(new Person("s"));
        collection.add(new Person("n"));
        collection.add(new Person("j"));
        collection.add(new Person("b"));
        collection.add(new Person("a"));
        collection.add(new Person("b"));
        collection.add(new Person("r"));
    }
    public static void printItem(Collection<Person> collection){
        for (Person person: collection) {
            System.out.println(person);

        }
    }
}

