package division.Models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "divisions")
public class Division {

    @Id
    private int id;
    private String name;
    private String bn_name;

    public int getId() {
        return id;
    }

    public String getBn_name() {
        return bn_name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", bn_name='" + bn_name + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
