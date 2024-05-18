
package d_w_j7;

public class Holiday {
    String name;
    String month;
    int day;
      int res=0;
      int fin;
      int tt=0;
      
    public Holiday(String name, String month, int day) 
    {
        this.name = name;
        this.month = month;
        this.day = day;
    }


    
    public boolean inSameMonth(Holiday a){
      return (a.month.equals(this.month));
    }
    
    public double avgdate()
    {
       //Holiday[] h=new Holiday[6];
   for(int n=0;n<6;n++)
   {
      //h[n]=new Holiday();
      tt=tt+1;
      //h[n].day=tt;
      //res=res+h[n].day;
   }
     fin=res/tt;
   return fin;
   }
}
