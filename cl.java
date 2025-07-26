package datastructure;
public class cl {
             Node last=null;
             class Node{
                 int data;
                 Node next;
                 Node(int d) {
                     data = d;
                     next = null;
                 }
             }
             public void insertbeg(int val) {
                 Node newnode = new Node(val);
                 if (last == null) {
                     newnode.next = newnode;
                     last = newnode;

                 } else {
                     newnode.next = last.next;
                     last.next = newnode;

                 }
             }
             public void insertend(int val){
                 Node newnode=new Node(val);
                 if (last == null) {
                     newnode.next = newnode;
                     last = newnode;

                 } else {
                     newnode.next = last.next;
                     last.next = newnode;
                     last=newnode;

                 }

}
             public void delete(){
                 if(last==null)
                     System.out.println(" ot is empty");
                 if(last.next==last)
                     last=null;
                 else{
                     last.next=last.next.next;

                 }
             }
             public void display(){
                 Node tpr=last.next;
                 do{
                     System.out.print(tpr.data+" -> ");
                     tpr=tpr.next;
                 }
                 while(tpr!=last.next);
             }
             }

