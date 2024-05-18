
package d_w_j13;

import java.util.Scanner;

public class car {
    private int model;
    private double price;

    public void setModel(int model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
 //Override
    public String toString()
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter model of car :");
        model=n.nextInt();
        System.out.println("enter price of car :");
        price=n.nextDouble();
      System.out.println(" model of car :"+model+"\n"+" price of car :"+price);
     return null;
      
    
    }
}
