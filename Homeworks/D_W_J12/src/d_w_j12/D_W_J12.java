
package d_w_j12;

import java.util.Scanner;

public class D_W_J12 {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        Date j=new Date();
        System.out.println("enter day :");j.day=n.nextInt();
        System.out.println("enter month :");j.month=n.nextInt();
        System.out.println("enter year :");j.year=n.nextInt();
        j.displayDate();
    }
    
}
