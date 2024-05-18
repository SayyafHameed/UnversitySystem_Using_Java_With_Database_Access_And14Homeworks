
package d_w_j11;

public class employee {
   String firstname;
    String lastname;
    double salary;

    public employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    
    //SETTER

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
        //GETTER

    public employee() {
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    } 
}
