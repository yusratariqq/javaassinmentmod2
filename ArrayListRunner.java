import java.util.ArrayList;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding integers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers in the ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

