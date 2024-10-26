public class QueueArray{
   private Object[] items;
   private int count;
   
   public QueueArray(int size){
      items = new Object[size];
      count = 0;   
   }
   
   public QueueArray(){
   this(10);
   }
   
   public boolean isEmpty(){
      return count==0;
   }
   
   public boolean isFull(){
      return count == items.length;
   }
   
   public boolean enQueue(Object val){
      if(!isFull()){
         items[count++] = val;
         return true;
      }
      return false;
   }
   
   public boolean deQueue(){
      if(!isEmpty()){
         for(int i = 1; i < count; i++){
            items[i - 1] = items[i];
         }
         items[count - 1] = null;
         count--;
         return true;
      }
      return false;
   }
   
   public Object front(){
      if(!isEmpty()){
         return items[0];
      }
      return null;
   }
   
   public void display(){
      if(!isEmpty()){
         for(int i = 0; i < count; i++){
            System.out.println("["+ items[i] + "]");
         } 
         System.out.println();
      }
      else
         System.out.println("Queue is empty...");
   }
}