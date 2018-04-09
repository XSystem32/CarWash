public class WashType {

      public String type;
      public int price;
      
      public int getPrice() {
            return price;
         }
         
      public String getType() {
            return type;
         }
         
      public void setPrice (int price) {
            this.price = price;
         }
      
      public void setType (String type) {
            this.type = type;
         }
         
      public String toString() {
         return type + " - " + price + " kr.";
      }
           
}