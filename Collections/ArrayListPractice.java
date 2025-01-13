import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        // ArrayList creation
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // All methods in ArrayList from here
        System.out.println(numbers);

        System.out.println(numbers.get(2));

        numbers.remove(3);
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(30));
        System.out.println(numbers);

        numbers.set(1, 100);
        System.out.println(numbers);

        boolean contains50 = numbers.contains(50);
        System.out.println(contains50);

        int indexOf100 = numbers.indexOf(100);
        System.out.println(indexOf100);

        System.out.println(numbers.size());

        // for-each loop iteration
        System.out.println("ArrayList using for-each loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Using Iterator
        System.out.println("ArrayList using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numbers.add(2, 60);
        System.out.println(numbers);
        List<Integer> sublist = numbers.subList(1, 4);
        System.out.println(sublist);
        numbers.clear();
        System.out.println(numbers);
    }
}


