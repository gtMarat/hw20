import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 10, 22, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);

        List words = new ArrayList<>(List.of("Four", "one", "one", "three", "two", "two"));
        task4(words);
    }

    public static void task1(List<Integer> list) {
        System.out.println("Первая аздача");
        for (Integer integer : list) {
            if (integer % 2 == 1) {
                System.out.println(integer);
            }
        }
    }

    public static void task2(List<Integer> list) {
        System.out.println("Вторая аздача");
        Collections.sort(list);
        Set<Integer> alreadyPrinterNumbers = new HashSet<>();
        for (Integer integer : list) {
            if (!alreadyPrinterNumbers.contains(integer)) {

                if (integer % 2 == 0) {
                    System.out.println(integer);
                    alreadyPrinterNumbers.add(integer);
                }
            }
        }
    }

    public static void task3(List<String> words) {
        System.out.println("Третья аздача");
        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println(uniqueWords);
    }

    public static void task4(List<String> words) {
        System.out.println("Четвертая аздача");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(words)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(" слово " +key +" встречается "+map.get(key) + "раз ");
            
        }
    }
}