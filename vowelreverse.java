package collection;
import java.util.*;
public class vowelreverse {
    public static void main(String[] args) {
        String s="character";
        char[] arr={'c','h','a'};
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                list.add(s.charAt(i));
        }
        int m=list.size()-1;
         char arr1[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                arr1[i] =list.get(m);
                m--;
            }
            else
                arr1[i]=s.charAt(i);
        }
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
