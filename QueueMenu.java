import java.util.*;

public class QueueMenu{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      QueueArray ra;
      int choice = 0;
      
      System.out.print("Enter Queue size: ");
      ra = new QueueArray(scan.nextInt());
      do{
         System.out.println("--Queue Array Menu-- ");
         System.out.println("1.) Enqueue Items ");
         System.out.println("2.) Dequeue Items ");
         System.out.println("3.) Front Items ");
         System.out.println("4.) Display Stack ");
         System.out.println("5.) Exit program ");
         
         System.out.print("Select a choice: ");
         choice = scan.nextInt();
         scan.nextLine();//eats whitespace
         switch(choice){
            case 1:
               String val = "";
               System.out.print("Enter an Object(s): ");
               val = scan.nextLine();
               
               if(ra.enQueue(val)){
                  System.out.println("Successfully added an Object(s) ");
                  }
               else{
                  System.out.println("Object(s) is full.");
               }
               break;
            case 2:
               if(ra.deQueue()){
                  System.out.println("Successfully Removed.");
               }
               else{
                  System.out.println("Queue is empty...");
               }
               break;
               
           case 3:
               if(ra.front() != null){
                  System.out.println(ra.front());
               }
               else{
                  System.out.println("Queue is empty...");
               }
               break;
           case 4:
               ra.display();
              break;
           case 5:
               System.out.println("Thankyu!");
           break;         
           default:
               System.out.println("Invalid, Your choice is beyond the choices");   
         }
      } while(choice != 5);
                   
   }
}