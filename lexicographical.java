package collection;
import java.util.*;

public class lexicographical {
    public static void main(String[] args) {
        String s="abcde";
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();i++){
                list.add(s.substring(i,j));
            }
        }

    }
}
