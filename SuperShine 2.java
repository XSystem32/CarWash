import java.util.Scanner;
public class SuperShine {
	public static void main(String[] args){
   
        Scanner login = new Scanner(System.in);
               //Creating customers here
        Cuztomer cuztomer1 = new Cuztomer();
        cuztomer1.setName ("Hans");
        cuztomer1.setBalance(130);
        cuztomer1.setPassword(1111);
        
        Cuztomer cuztomer2 = new Cuztomer();
        cuztomer2.setName ("John");
        cuztomer2.setBalance(250);
        cuztomer2.setPassword(2222);
        
        Cuztomer cuztomer3 = new Cuztomer();
        cuztomer3.setName ("Karl");
        cuztomer3.setBalance(380);
        cuztomer3.setPassword(3333);
        
        //Creating washtypes here
        WashType washtype1 = new WashType();
        washtype1.setType ("Basic wash");
        washtype1.setPrice (120);
        
        WashType washtype2 = new WashType();
        washtype2.setType ("Advanced wash");
        washtype2.setPrice (230);
        
        WashType washtype3 = new WashType();
        washtype3.setType ("Ultra wash");
        washtype3.setPrice (360);
        
        WashType washtype4 = new WashType();
        washtype4.setType ("Lux wash");
        washtype4.setPrice (480);
        
        //System.out.print(washtype1.toString());

        System.out.println("Enter your name: ");
        
        String userinput = login.nextLine();
        if (userinput.equals(cuztomer1.name) ||
            userinput.equals(cuztomer2.name) ||
            userinput.equals(cuztomer3.name)) {
               System.out.println("Enter your password :");
         
         int pincode = login.nextInt();
         
         if (pincode == cuztomer1.password ||
             pincode == cuztomer2.password || 
             pincode == cuztomer3.password)  {
               System.out.println("You are logged in, choose an option: \n 1. Show balance \n 2. Choose a wash \n 3. Recharge WashCard");
                  }
         
         else if (pincode != cuztomer1.password || 
                  pincode != cuztomer2.password || 
                  pincode != cuztomer3.password) {
                     System.out.println("Wrong password, try again");
                            }

         int menu = login.nextInt();
         
         if (menu == 1) {
              /* int show = login.nextInt();
               if (cuztomer1.name.equals(cuztomer1.password)) {*/
                     System.out.println(cuztomer1.getBalance());
               }
         //}
         
         if (menu == 2) {
               System.out.println(washtype1.toString());
               System.out.println(washtype2.toString());
               System.out.println(washtype3.toString());
               System.out.println(washtype4.toString());
                  }
                        
               }
               
      else {
         System.out.println("User cannot be found");
         }        
        
        
	}
}