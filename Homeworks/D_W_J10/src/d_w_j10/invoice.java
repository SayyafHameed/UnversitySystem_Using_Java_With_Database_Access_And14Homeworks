
package d_w_j10;
import java.util.Scanner;
public class invoice {
    String part_num;
    String part_descri;
    int quantity;
    double price;

    public invoice(String part_num, String part_descri, int quantity, double price) {
        this.part_num = part_num;
        this.part_descri = part_descri;
        this.quantity = quantity;
        this.price = price;
    }
    
    public invoice(){
    }

    public void setPart_num(String part_num) {
        this.part_num = part_num;
    }

    public void setPart_descri(String part_descri) {
        this.part_descri = part_descri;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  

    public String getPart_num() {
        return part_num;
    }

    public String getPart_descri() {
        return part_descri;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
   
    public double getInvoiceAmount(){
  Scanner input=new Scanner(System.in);
        System.out.println("==============================================================================");
        System.out.println("enter the part number:");
        part_num=input.nextLine();
         System.out.println("enter the part discription:");
         part_descri=input.nextLine();
          System.out.println("How much quantity of items?");
          quantity=input.nextInt();
          if(quantity<0)
          {
              quantity=0;
          }
           System.out.println("How much price int one item?");
           price=input.nextDouble();
           if( price<0)
           {
                price=0;
           }
     System.out.println("==============================================================================");
           System.out.println("the priceof Bills quantity is: ");
           
           return quantity*price; 
}
}
