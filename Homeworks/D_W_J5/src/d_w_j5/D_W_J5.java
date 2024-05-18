
package d_w_j5;

public class D_W_J5 {

    public static void main(String[] args) {
        Auther au = new Auther("Sayaf" , "Hamid");
        
        System.out.println("First Name is : "+ au.fname);
        System.out.println("Last Name is : "+ au.lname);
        
        
        au.setfname("Sayaf");
        au.setlname("Hamid");
        System.out.println("Your first Name is : "+ au.getfname());
        System.out.println("Your first Name is : "+ au.getlname());
        System.out.println(au.tostring());
    }
    
}
