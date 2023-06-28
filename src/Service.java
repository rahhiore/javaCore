import java.util.*;
import java.util.stream.Collectors;

public class Service {

    public static List<Integer> first(List<Integer> numbers) {
        List<Integer> temp = new ArrayList<>();
        for (int num:numbers) {
            if (!(num % 2 == 0)) {
                temp.add(num);
            }
        }
        return temp;
    }
    public static List<Integer> second(List<Integer> numbers) {
        List<Integer> temp = new ArrayList<>();
        for (int num:numbers) {
            if ((num % 2 == 0)) {
                if (temp.size() == 0) {
                    temp.add(num);
                } else if (!temp.contains(num)) {
                    int checker = 0;
                    for (int number : temp) {
                        checker = num == number ? 1 : 0;
                    }
                    if (checker == 0) {
                        temp.add(num);
                    }
                }
            }

        }
        Collections.sort(temp);
        return temp;
    }
    public static List<String> third(List<String> words) {
        List<String> temps = new ArrayList<>();
        for (String word: words) {
            int checker = 0;
            if (temps.size() == 0) {
                temps.add(word);
            } else {
                for (String temp : temps) {
                    checker = word.equals(temp) ? 1 : 0;
                }
                if (checker == 0) {
                    temps.add(word);
                }
            }
        }
        Collections.sort(temps);
        return temps;
    }
    public static List<Integer> fourth(List<String> words) {

        Map<String, Integer> temp = new HashMap<>();
        for (String word : words) {

            if (temp.containsKey(word)) {
                int counter = temp.get(word) + 1;
                temp.put(word, counter);
            } else {
                temp.put(word, 1);
            }

        }
        List<Integer> result = new ArrayList<>();
        result.addAll(temp.values());
        return result;
    }
}
