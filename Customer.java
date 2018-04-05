import java.util.Scanner;
public class Customer {
   
   public static void main (String[] args) {
      Scanner login = new Scanner (System.in);

      /*private String[] = name[3];
      
      name[0] = ("John");
      name[1] = ("Lone");
      name[2] = ("Khorne");*/
      System.out.println("Enter your name: ");
      String name = login.nextLine();
      
      if (name.equals("John")) {
         System.out.println("Enter your pincode :");
         int pincode = login.nextInt();
         if (pincode == 1234) {
            System.out.println("You are logged in, choose a wash: ");
         }
         else if (pincode != 1234) {
            System.out.println("Wrong password, try again");
         }
      
      }
      else {
         System.out.println("User cannot be found");
         }
      }
      
      /*private int[] = pinCode[3];
      
      pinCode[0] = 1111;
      pinCode[1] = 2222;
      pinCode[2] = 3333;*/
      
         /*if (name.equals("John")) {
            System.out.println("Hi John, enter your pincode: ");
            }
         else if (name.equals("Lars"))  {
            System.out.println("Hi Lars, enter your pincode:");
         }*/
   }
