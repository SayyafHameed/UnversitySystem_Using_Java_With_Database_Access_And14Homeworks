
package d_w_j3;
import java.util.Scanner;
public class Deduction {
    Scanner read = new Scanner(System.in);
    float hrate;
    float nhour;
    float rate;
    float res;
    
    public void aleart()
    {
        System.out.println("Enter the rate in hour : ");
        hrate = read.nextFloat();
        System.out.println("Enter the number of hours : ");
        nhour = read.nextFloat();
        rate = hrate * nhour;
        res = rate-(rate * 0.062f) - (rate * 0.03f) - (rate * 0.085f) - 5.75f;
        System.out.println("Your rate is : " + res + "$");
    }
}
