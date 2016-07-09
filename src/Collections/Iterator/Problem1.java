package Collections.Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Nikhil on 7/9/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        //TODO: 1 Printing using foreach loop
        System.out.println("Priting List using Foreach loop");
        //Way 1 : New way
        //Used only when accessing element
        //can not use to remove element
        for(String s : list){
            System.out.println(s);
            //s.remove ?  s.remove no such a function
        }

        //TODO: 2 Printing using iterator
        System.out.println("Printing value in using Iterator");
        //Way 2: Inside foreach
        //Have to use Iterator in case when want to delete an element
                Iterator<String> iterator = list.iterator();
        String value = iterator.next();
        System.out.println(value);


        System.out.println("Printing list using Iterator");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //TODO: 3 Remove element using iterator
        System.out.println("Removing element four");
        Iterator<String> iterator1 = list.iterator();
        while(iterator1.hasNext()) {
            //This is how we use remove
            //Way 1:
            /*if (iterator1.next().equals("Four")) {
                iterator1.remove();
            }*/

            //way2:
            String value1 = iterator1.next();
            if(value1.equals("Four")){
                iterator1.remove();
            }

        }

        //TODO:4  Rest Iterator
        System.out.println("Printing value in list Iterator");
        //How to reset Iterator to its first element position.
        //Solution just call List.iterator() method again
        iterator1 = list.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //TODO 5: Using List iterator for hasprevious hasnext use
        System.out.println("Using List iterator");
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //This remvoes last element
        listIterator.remove();

        //printing
        listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        list.add("Four");
        list.add("Five");

        System.out.println("\n Travel till middle and call remove");
        //TODO 6 : Travel till middle and call remove
        // and see which element is getting removed. previous for next.
        listIterator = list.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next().equals("Three")){
                break;
            }
        }
        listIterator.remove();
        //printing
        listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        System.out.println("\n Travel REVERSE till middle and call remove");
        //TODO 6 : Travel REVERESe till middle and call remove
        // and see which element is getting removed. previous for next.
        list.add(2, "Three");

        //printing
        System.out.println("BEFORE REMOVE");
        System.out.println("Printing in reverse Order");
        listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        //TODO 7: SET ITERATOR TO LAST ELEMENT BY PASSING SIZE OF LIST
        //TODO,  IN LIST ITERATOR CONSTRUCTOR
        listIterator = list.listIterator(list.size());

        while(listIterator.hasPrevious()){
            if(listIterator.previous().equals("Three")){
// ^  one ^ two ^ three ^ four  ^ five ^
// above previous method will check if its previous value is THREE
// SO, pointer is where Previous function gives direction. ... THREE (Cursor is here) FOUR
// Hence it will delete THREE which is previous element to position
// Between three ^ four
                //TODO 8: REMOVES PREVIOUS ELEMENT AND NOT NEXT
                listIterator.remove();
            }
        }

        //TODO: next() and previous() methods once executed then cursor shifts
        //TODO: Hence these two methods only tells in which direction element to delete

        //printing
        System.out.println("AFTER REMOVE");
        System.out.println("Printing in reverse Order");
        listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
