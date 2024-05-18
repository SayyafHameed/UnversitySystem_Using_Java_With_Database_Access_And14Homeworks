
package d_w_j7;

public class D_W_J7 {

    public static void main(String[] args) {
       Holiday a = new Holiday("ramathen" , "march" , 20);
       Holiday b = new Holiday("after" , "march" , 4);
       
        System.out.println(b.inSameMonth(a));
        
        
        System.out.println("Tha average of days is : " + a.avgdate());
        
    
        b.day = 4;
        b.month = "July";
        System.out.println("independence day : " + b.month + "/" + b.day);
        
    }
    
}
