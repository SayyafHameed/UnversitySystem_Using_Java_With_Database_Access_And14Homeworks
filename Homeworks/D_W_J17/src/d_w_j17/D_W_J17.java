
package d_w_j17;

import java.util.Scanner;

public class D_W_J17 {

    public static void main(String[] args) {
       Scanner u=new Scanner(System.in);
    PhoneBook i=new PhoneBook();
    for (int y=0; y<=3; y++){
    System.out.println("Enter the phone for search :");
    i.phnum=u.nextInt();

 
   i.search();
   i.print();}
    

    }
    
}
