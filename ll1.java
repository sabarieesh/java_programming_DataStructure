package datastructure;
public class ll1 {
    Node start;
    class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public void insertend(int val){
        Node newNode=new Node(val);
        Node tptr=start;
        while(tptr.next!=null){
            tptr.next=tptr;
        }
        tptr.next=newNode;
    }
    public void insert(int value){
        Node newNode=new Node(value);
        newNode.next=start;
        start=newNode;
    }
    public void display(){
        Node tptr=start;
        while(tptr!=null){
            System.out.print(tptr.data+"->");
            tptr=tptr.next;
        }
    }
}
    class main{
        public static void main(String[] args){
            ll1 ob=new ll1();
            ob.insert(10);
            ob.insert(15);
            ob.insert(20);
            ob.display();
            System.out.println();
            ob.insertend(15);
            ob.display();
            System.out.println();
        }

    }

