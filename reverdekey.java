package collection;
import java.sql.SQLOutput;
import java.util.*;
public class reverdekey {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        int m=0;
        for(int i=k-1;i<arr.length;i++,i=i+2){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=i;j>m;j--){
                list.add(arr[j]);
                m=m+3;
            }
            list1.add(list);

        }
        System.out.println(list1);
    }
}
