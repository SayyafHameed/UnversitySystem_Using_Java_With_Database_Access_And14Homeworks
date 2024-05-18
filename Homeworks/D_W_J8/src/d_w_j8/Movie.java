
package d_w_j8;
import java.util.Scanner;
public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating="PG";
    }

    Movie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getPG(){
 String film,pg;
        Movie[] arr=new Movie[6];
   for(int n=1;n<6;n++){

Scanner input=new Scanner(System.in);
  arr[n]=new Movie();
         System.out.println("enter the name of film("+n+")"); 
         film=input.nextLine();
         System.out.println("enter the PG rating of film ("+n+")"); 
         pg=input.nextLine();
         arr[n].title=film;
         arr[n].rating=pg;
        
   }
     for(int n=1;n<6;n++){
          System.out.println("=====================================");
        System.out.println(" the name of film"+n+" is:"+arr[n].title);
        System.out.println(" the PG rating of film ("+n+")is:"+arr[n].rating); 
   
     }
        return null;    
}
}
