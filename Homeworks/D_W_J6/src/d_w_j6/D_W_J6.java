
package d_w_j6;

class bookdemo{
         String title="devloping java sofwere";
    String auther=" Russel Winderand";
    float price= 79.75f;
    }

public class D_W_J6 {

    public static void main(String[] args) {
        Book a=new Book("java","wleed",900);
        System.out.println("the book name:"+a.title);
        System.out.println("the auther name:"+a.auther);
        System.out.println("the price:"+a.price);
        
       
         a.setTitle("alnafees");
         a.setAuther("abn allnafees");
         a.setPrice(1200);
         
        System.out.println("the title is:"+a.getTitle());
        System.out.println("the auther :"+a.getAuther());
        System.out.println("the price is:"+a.getPrice());
        
        
        System.out.println(a.tostring());
        
        
        bookdemo book=new bookdemo();
        System.out.println("the titile is:"+book.title);
        System.out.println("the auther is:"+book.auther);
        System.out.println("the price is:"+book.price);
   
          
    }
    
}
