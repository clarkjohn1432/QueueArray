import java.util.*;

class Node{

   Object value;
   Node next;
   
   Node(Object value){
      this.value = value;
      this.next = null;
   }
}

class QueueNode{
   Node first;
   Node last;
   int count;
   
   QueueNode(){
      first = null;
      last = null;
      count = 0;
   }   
   
   public boolean isEmpty(){
      return count == 0;
   }
   
   public boolean inQueue(Object value){
      Node newNode = new Node(value);
      if(isEmpty()){
         first = newNode;
         last = newNode;
      }
      else{
         last.next = newNode;
         last = newNode;
      }
      count++;
      return true;
   }
   
   public boolean deQueue(){
      if(!isEmpty()){
         if(first == last){
            first = null;
            last = null;
         }
         else{
            first = first.next;
         }
            count--;
            return true;
     }
      else
         return false;
    
   }
   
   public Object getFirst(){
      if(!isEmpty()){
         return first.value;
      }
      else
         return null;
   }
   
   public Object getLast(){
      if(!isEmpty()){
         return last.value;
      }
      else 
         return null;
   }
   
   public void display(){
      if(!isEmpty()){
         Node temporary = first;
         while (temporary != null){
            System.out.println(temporary.value);
            temporary = temporary.next;
         }
         System.out.println();
      }
      else
         System.out.println("Queue is empty...");
   }
}


public class QueueNodeMain{
   public static void main(String[] args){
      QueueNode node = new QueueNode();
   
      node.inQueue(10);
      node.inQueue(20);
      node.inQueue(30);
      node.inQueue(40);
      node.display();
      node.deQueue();
      node.display();
        
   }

}

