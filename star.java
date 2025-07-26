package collection;
import java.util.*;

public class star {
    public static void main(String[] args) {
        String s="lee*cod*e";
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));
        }
//        Stack<Character> st=new Stack<Character>();
//        for(char c:s.toCharArray()){
//            if(c=='*')
//                st.pop();
//            else
//                st.push(c);
//        }
//        String s1="";
//        for(char ch:st){
//            s1=s1+ch;
//        }
//        System.out.println(s1);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                str.deleteCharAt(i);
            str.deleteCharAt(i-1);}
        }
        System.out.print(str);
    }
}
