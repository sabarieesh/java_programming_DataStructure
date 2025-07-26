package datastructure;
import java.util.*;
class dll{
    Node start=null;
    class Node{
    int data;
    Node next;
    Node  prev;
    Node (int d){
        data=d;
        prev=null;
        next=null;
    }
    }
    public void insertbeg(int val){
        Node newnode=new Node(val);
        if(start==null){
            start =newnode;
        }
        else{
            newnode.next=start;
            start.prev=newnode;
            start=newnode;
        }
    }
//    public void deletelast(){
//     Node end=null;
//     end.prev=end;
//    }

    public void deletefirst(){
        if(start.next==null){
            System.out.println("list is empty");
        }
        else{
        start.next.prev=null;
    start=start.next;}
    }

    public void display(){
        Node end=null;
        Node tpr=start;
//        System.out.println("forward");
        if(start.next==null){
            return;
        }
        else{
        while(tpr!=null){
            System.out.print(tpr.data+" <-> ");
            start=tpr;
            end=tpr;
            tpr=tpr.next;
        }}
//        while(end!=null)
//        {
//            System.out.print(end.data+" <-> ");
//            end=end.prev;
//
//        }
    }
}

public class dl {
    public static void main(String[] args) {
        dll ob=new dll();
        ob.insertbeg(10);
        ob.insertbeg(15);
        ob.insertbeg(26);
     ob.deletefirst();
//        ob.deletelast();
        ob.display();
    }
}
