package collection;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "banana", "orange" };
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
    }}








//        System.out.println(map);
//        map.put("apple",10);
//        map.put("bigapple",20);
//        map.put("apples",30);
//        map.put("orange",10);
//        map.put("banana",10);
//int sum=0;
//
//        System.out.println(map);
//
//        for(Integer value:map.values()){
//            sum=sum+value;
//        }
//        System.out.println(sum);
//    }
//}
