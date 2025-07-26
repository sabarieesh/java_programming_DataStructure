package datastructure;
import java.util.*;
class dlll{
    Node start=null;
    Node end=null;
    Node tpr=start;
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
    public void deletelast(){
        Node tpr=start;
     while(tpr.next!=null){
         tpr=tpr.next;
     }
     tpr.prev.next=null;

    }

//    public void insertpos(int pos,int val){
//        Node newNode=new Node(val);
//        Node tpr=start;
//        if(pos==1){
//            insertbeg(val);
//        }
//        else{
//            for(int i=1;i<pos-1;i++){
//                tpr=tpr.next;
//            }
//            tpr.next.prev=newNode;
//            newNode.prev=tpr;
//            newNode.next=tpr.next;
//            tpr.next=newNode;
//        }
//    }

public void insertpos(int pos,int val){
        Node newnode=new Node(val);
        if(start==null){
            insertbeg(val);
        }
        else{
            start=tpr;
        }
}
    public void detelepos(int pos) {

        Node tpr = start;
        if (pos == 1) {
            start.next.prev = null;
            start.next = null;
        } else {
            for (int i = 1; i < pos - 1; i++) {
                tpr = tpr.next;
            }
        }
    }



//    public void deletefirst(){
//        if(start.next==null){
//            System.out.println("list is empty");
//        }
//        else{
//            start.next.prev=null;
//            start=start.next;}
//    }
    public void insertlast(int val){
        Node newnode=new Node(val);
        if(start==null){
            start=newnode;
            return;
        }
        else{
            Node tpr=start;
        while(tpr.next!=null){
           tpr=tpr.next;
        }
            tpr.next=newnode;
            newnode.prev=tpr;
        }
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

public class dlast {
    public static void main(String[] args) {
        dlll ob=new dlll();
        ob.insertbeg(10);
        ob.insertbeg(15);
        ob.insertbeg(26);
//        ob.insertlast(79);
//       ob.insertpos(2,19;);
//        ob.deletelast();

        ob.display();
    }
}
