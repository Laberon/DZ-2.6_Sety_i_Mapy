import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 8, 10, 4, 5, 5, 6, 7));
        System.out.println(nums);
        number(nums);
        String lyrics = "Весь сад в дожде! Весь дождь в саду!";// Погибнут дождь и сад друг в друге,Оставив мне решать судьбу Зимы, явившейся на юге.
        System.out.println(lyrics);
        words(lyrics);
        printMap(lyrics);
    }
    public static void number(List<Integer> arr) {
        Set<Integer> even = new HashSet<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            if (x % 2 == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void words(String line) {
        String[] words = line.replaceAll("[^\\da-zA-Za-яёА-ЯЁ ]", "").toLowerCase().split(" ");
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            int count = 0;
            for (String s : words) {
                if (word.equalsIgnoreCase(s))
                    count++;
            }
            if (count == 1)
                wordList.add(word);
        }
        System.out.println(wordList);
    }
    private static void printMap(String map) {
        Set<String> unique = new HashSet<String>(Collections.singleton(map)); // в конструктор кладем наш список
        for (String key : unique) {
            System.out.println("Повторений: " + Collections.frequency(Collections.singleton(map), key));
        }
    }
}