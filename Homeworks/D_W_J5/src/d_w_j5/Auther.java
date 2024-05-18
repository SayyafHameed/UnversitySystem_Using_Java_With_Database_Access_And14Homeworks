
package d_w_j5;

public class Auther {
    String fname;
    String lname;
    
    public void setfname(String fname)
    {
        this.fname = fname;
    }
    public void setlname(String lname)
    {
        this.lname = lname;
    }
    public String getfname()
    {
        return fname;
    }
    public String getlname()
    {
        return lname;
    }
    public String tostring()
    {
        return fname + lname;
    }
    
    public Auther(String fn , String ln)
    {
        fn = fname;
        ln = lname;
    }
}
