import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(Service.first(nums1));
        List<Integer> nums2 = new ArrayList<>(List.of(1, 3, 2, 3, 4, 1, 5, 2, 5, 7, 8, 6, 7));
        System.out.println(Service.second(nums2));
        List<String> words1 = new ArrayList<>(List.of("odin", "odin", "dva", "dva", "tri", "tri", "tri"));
        System.out.println(Service.third(words1));
        List<String> words2 = new ArrayList<>(List.of("odin", "odin", "dva", "tri", "tri", "tri"));
        System.out.println(Service.fourth(words2));
    }
}
