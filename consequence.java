package collection;
import java.util.*;

public class consequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length-1;i++){

            if(arr[i+1]==arr[i]+1)
                count++;

        }
        System.out.println(count);
    }
}
