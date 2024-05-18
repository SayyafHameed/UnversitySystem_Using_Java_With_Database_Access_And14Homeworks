
package d_w_j11;
import java.util.Scanner;
public class D_W_J11 {

    public static void main(String[] args) {
         String fn,ln;
        String fn1,ln1;
        double sal,sal1;
        Scanner input=new Scanner(System.in);
          employee a=new  employee();
          employee b=new  employee();
          System.out.println("===================================================================");
          System.out.println("                            <<<SALARY1>>>                         ");
          System.out.println("===================================================================");

          System.out.println("enter first name:");
          fn=input.nextLine();
          a.setFirstname(fn);
          System.out.println("enter last name:");
           ln=input.nextLine();
          a.setLastname(ln);
            System.out.println("enter the salary:");
            sal=input.nextDouble();
            if(sal<0)
            {
                sal=0;
            }
            a.setSalary(sal);
             System.out.println("===================================================================");
          System.out.println("                            <<<SALARY2>>>                         ");
          System.out.println("===================================================================");
          
           System.out.println("enter first name:");
          fn1=input.next();/////يوجد هنا خلل في الادخال 
          b.setFirstname(fn1);
          System.out.println("enter last name:");
           ln1=input.next();
          b.setLastname(ln1);
            System.out.println("enter the salary:");
            sal1=input.nextDouble();
            if(sal1<0)
            {
                sal1=0;
            }
            b.setSalary(sal1);
          
          
          
          
          
          
          
          System.out.println("_______________________FIRST AN EMPLOYEE___________________________");
          System.out.println("===================================================================");
            System.out.println("the first name is:"+a.getFirstname());
            System.out.println("the last  name is:"+a.getLastname()); 
            System.out.println("the mounth salary is:"+a.getSalary()+"$");
          System.out.println("===================================================================");
          System.out.println("                        <<<THE YEAR SALARY>>>                      ");
          System.out.println("===================================================================");
              System.out.println("the year salary+10%is:"+a.getSalary()*13.2+"$");
             System.out.println("o______________________SECOND AN EMPLOYEE________________________");
         
              
              
              
               System.out.println("===================================================================");
            System.out.println("the first name is:"+b.getFirstname());
            System.out.println("the last  name is:"+b.getLastname()); 
            System.out.println("the mounth salary is:"+b.getSalary()+"$");
          System.out.println("===================================================================");
          System.out.println("                        <<<THE YEAR SALARY>>>                      ");
          System.out.println("===================================================================");
              System.out.println("the year salary+10%is:"+b.getSalary()*13.2+"$");
            
          
    }  
}
