
package d_w_j2;
import java.util.Scanner;
public class Simpleinterest {
    Scanner input = new Scanner(System.in);
    float interest;
    float pric;
    float rate;
    float day;
    public void set()
    {
        System.out.println("Enetr the pricevalue : ");
        pric = input.nextFloat();
        System.out.println("Enetr the rate : ");
        rate = input.nextFloat();
        System.out.println("Enetr the day : ");
        day = input.nextFloat();
        
        interest = (pric * (rate / 100) * (day / 365));
        System.out.println("The interest = " + interest);
    }
}
