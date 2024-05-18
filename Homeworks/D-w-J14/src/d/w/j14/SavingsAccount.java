
package d.w.j14;

import java.util.Scanner;

public class SavingsAccount {
    static double annualinterestrate ;//نسبة الفائده السنوية
   private double savingsbalance;//تشير الى الكمية التي يملكها المدخر في حساب الودائع

   public void calculatemonthlyinterest(){
       Scanner n=new Scanner(System.in);
       System.out.println("enter annualinterestrate :");
       annualinterestrate=n.nextDouble();
       System.out.println("enter savingsbalance :");
       savingsbalance=n.nextDouble();
       savingsbalance*=annualinterestrate/12;
       System.out.println(savingsbalance+200000+300000);
       System.out.println(annualinterestrate=5);
       
   }
   public static void mogifyinterestrate(){
      annualinterestrate=50; 
   }
}
