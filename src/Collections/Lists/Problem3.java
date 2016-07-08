package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Nikhil on 7/8/2016.
 */
class Animal {
    private int id;
    private String name;

    public Animal(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ']';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

//herE i HAVE USED COMPARATOR CLASS, WHICH IMPLEMENTS COMPARATOR AND
//IT WILL OVERRIDE COMPARE METHOD WHERE YOU CAN ADD YOUR LOGIC TO COMPARE ELEMENTS WITHIN OBJECT
//TO SORT OBJECTS ON BASIS OF THEIR TYPE WITHIN THEM
class AnimalComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
    //For reverseOrder
    /*public int compare(Animal o1, Animal o2) {
        return -o1.getName().compareTo(o2.getName());
    }*/
}
public class Problem3 {
    public static void main(String[] args) {

        List <Animal>  animalList = new ArrayList<>();
        animalList.add(new Animal(3, "Monkey"));
        animalList.add(new Animal(5, "Donkey"));
        animalList.add(new Animal(6, "Tiger"));
        animalList.add(new Animal(9, "Lion"));
        animalList.add(new Animal(4, "Giraffe"));
        animalList.add(new Animal(1, "Cat"));
        animalList.add(new Animal(2, "Dog"));

        Collections.sort(animalList, new AnimalComparator());

        for (Animal animal : animalList) {
            System.out.println(animal);
        }

    }
}
