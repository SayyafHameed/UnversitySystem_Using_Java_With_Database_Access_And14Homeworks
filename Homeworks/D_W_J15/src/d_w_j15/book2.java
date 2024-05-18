
package d_w_j15;

public class book2 {
    String bname;//اسم الكتاب
    int isbnnumber;//رقم 
    String authorname;//اسم المؤلف
    String publisher;//اسم الناشر
    public void book2(String bname,int isbnnumber,String authorname,String publisher){
        this.bname=bname;
        this.isbnnumber=isbnnumber;
        this.authorname=authorname;
        this.publisher=publisher;
        
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setIsbnnumber(int isbnnumber) {
        this.isbnnumber = isbnnumber;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBname() {
        return bname;
    }

    public int getIsbnnumber() {
        return isbnnumber;
    }

    public String getAuthorname() {
        return authorname;
    }

    public String getPublisher() {
        return publisher;
    }
    public String getbookinfo(){
        String desc=bname+"\n"+isbnnumber+"\n"+authorname+"\n"+publisher;
        return desc;
    }
}
