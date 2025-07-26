package datastructure;
public class ll22{
    private Node head;
    private Node tail;

    private int size;
    public ll22(){

        this.size=0;
    }
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size=size+1;
    }
    public void reverse(){
        Node tpr=head,temp=null,prev=null;
        while(tpr!=null){
            temp=tpr.next;
            tpr.next=prev;
            prev=tpr;
            tpr=temp;
        }
        head=prev;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
System.out.println("End");
    }
    private class Node{
        private int value;
        private Node next;

        public Node( int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

        
    }
}
