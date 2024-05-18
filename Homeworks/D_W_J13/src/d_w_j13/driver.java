
package d_w_j13;

import java.util.Scanner;

public class driver {
    private String nameemp;
    private int age;

    public void setNameemp(String nameemp) {
        this.nameemp = nameemp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameemp() {
        return nameemp;
    }

    public int getAge() {
        return age;
    }
    //Override
    public String toString()
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter name of emp :");
        nameemp=n.next();
        System.out.println("enter age emp :");
        age=n.nextInt();
      System.out.println(" name of emp :"+nameemp+"\n"+"age emp :"+age);
      
      return nameemp + age;
    }
}
