package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Nikhil on 7/8/2016.
 */
class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ']';
    }
}
public class Problem2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(4,"Four"));
        people.add(new Person(3,"Three"));
        people.add(new Person(2,"Two"));
        people.add(new Person(5,"Five"));
        people.add(new Person(1,"One"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            //This will give output in natural sorted order of name
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
            //to reverse sorted name order only add - sign at start of return
            /*public int compare(Person o1, Person o2) {
                return -o1.getName().compareTo(o2.getName());
            }*/
            //to sort in order of Id , in asending order
            /*public int compare(Person o1, Person o2) {
                if(o1.getId()> o2.getId()){
                    return 1;
                }else if(o1.getId() < o2. getId()){
                    return -1;
                }
                return 0;
            }*/
            //to reverse sorted name order only add - sign at start of return
            /*public int compare(Person o1, Person o2) {
                if(o1.getId()> o2.getId()){
                    return -1;
                }else if(o1.getId() < o2. getId()){
                    return 1;
                }
                return 0;
            }*/
        });


        for (Person person  : people) {
            System.out.println(person);
        }

    }
}
