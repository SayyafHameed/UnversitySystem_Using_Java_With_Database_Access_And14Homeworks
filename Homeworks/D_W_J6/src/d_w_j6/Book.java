
package d_w_j6;

public class Book {
    String title;
    String auther;
    int price;

    public Book(String title, String auther, int price) {
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }

    public int getPrice() {
        return price;
    }
    
    public String tostring(){
        return title+auther+price;
    }
}
