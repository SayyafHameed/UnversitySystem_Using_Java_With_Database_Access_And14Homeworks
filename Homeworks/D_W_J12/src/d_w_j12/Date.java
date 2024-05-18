
package d_w_j12;

public class Date {
    int month;
   int day;
   int year;
   public void Date(int m,int d,int y){
       month=m;
       day=d;
       year=y;
   }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
   public void displayDate(){
       System.out.println(day+"/"+month+"/"+year);
   }
}
