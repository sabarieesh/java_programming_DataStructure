package stackbasics;
import java.util.*;
public class stack1 {
    public static void main(String[] args) {
//       Stack<Integer> stack=new Stack<Integer>();

//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
////        stack.pop();
////        stack.pop();
//////        stack.pop();
//
////        System.out.println(stack.search(3));  if not present return -1
//int arr[]={1,2,3,5,7,8};
//int top=arr.length-1;
//
//        for(int i=arr.length-1;i>=0;i--){
//            stack.push(arr[i]);
//        }

//while(top>=0) {
//    stack.pop();
//    top--;
//    System.out.println(stack);}

//        System.out.println(stack.peek());
//        System.out.println(stack);

//        for(int i=0;i<arr.length;i++){
//            stack.push(arr[i]);
//        }
//        System.out.println(stack);
//        Stack<Integer> temp=new Stack<Integer>();
//   int middle=stack.size()/2;
//
//       for(int i=0;i<middle;i++){
//           temp.push(stack.pop());
//       }
//       stack.pop();
//        while(!temp.isEmpty()){
//            stack.push(temp.pop());
//        }
//        System.out.println(stack);


//import java.util.Stack;
//
//        public class SortStackNoFunction {
//            public static void main(String[] args) {
//                Stack<Integer> stack = new Stack<>();
//
//                // Push unsorted elements
//                stack.push(34);
//                stack.push(3);
//                stack.push(31);
//                stack.push(98);
//                stack.push(92);
//                stack.push(23);
//
//                System.out.println("Original Stack: " + stack);
//
//                Stack<Integer> tempStack = new Stack<>();
//
//                // Sorting using another stack
//                while (!stack.isEmpty()) {
//                    int temp = stack.pop();
//
//                    // Move elements back to original if they're greater than temp
//                    while (!tempStack.isEmpty() && tempStack.peek() > temp) {
//                        stack.push(tempStack.pop());
//                    }
//
//                    // Push current element to its sorted position
//                    tempStack.push(temp);
//                }
//
//                // Result: sorted stack in tempStack
//                System.out.println("Sorted Stack: " + tempStack);
//            }
//        }


//        int[] digits={4,3,2,1};
//        int num=0;
//        for(int i=0;i<digits.length;i++){
//            num=num*10+digits[i];
//        }
//        System.out.println(num);

        int b = 153;
        int a=b;
        double sum = 0;
        String str = Integer.toString(a);
        int size = str.length();
        while (a > 0) {
            int digit = a % 10;
            sum = sum + Math.pow(digit, size);
            a = a / 10;
        }
        System.out.println(b);
        System.out.println();
        long ans = (long) sum;
        System.out.println(ans);
        if(ans==b)
            System.out.println(1);
            else
                System.out.print(ans);
    }
}