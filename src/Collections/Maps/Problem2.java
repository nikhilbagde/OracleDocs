package Collections.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Nikhil on 7/8/2016.
 */
class Person{
    private int id;
    private String name;

    public Person(int idIn, String nameIn){
        this.id = idIn;
        this.name = nameIn;
    }

    public String toString(){
        return "[Id=" + id + " Name=" + name+"]";
    }

    /**
     * After generating hashcode and equals methods it will automatically checks for intenral values of
     * object before adding it to collection.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
public class Problem2 {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Person1");
        Person p2 = new Person(2, "Person2");
        Person p3 = new Person(3, "Person3");
        Person p4 = new Person(4, "Person4");

        //Notice person5 object has same 1 and person1 internal values as person1 object
        Person p5 = new Person(1, "Person1");
        Person p6 = new Person(3, "Person3");

        Map<Person, String> hashMap = new LinkedHashMap<>();

        hashMap.put(p1, "One");
        hashMap.put(p2, "Two");
        hashMap.put(p3, "three");
        hashMap.put(p4, "Four");
        //even thoguh object p5 and p1 are having same internal values,
        //still hashmap would add those as unique values
        //B/c hashmasp will not check its internal content, it will only check
        //hashvalue of its objects.
        hashMap.put(p5, "Five");
        hashMap.put(p6, "Six");

        /**
         * To check internal values of object we need to compare its internal elements for uniquness.
         * hence we need to override hashCode and equals method.
         */

        for(Person person : hashMap.keySet()){
            System.out.println(person + " " + hashMap.get(person));
        }



    }
}
