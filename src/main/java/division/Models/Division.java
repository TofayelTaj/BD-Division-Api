package division.Models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "divisions")
public class Division {

    @Id
    private int idl;
    private String name;


    public Division(int idl, String name) {
        this.idl = idl;
        this.name = name;
    }

    public Division() {
    }

    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Division{" +
                "idl=" + idl +
                ", name='" + name + '\'' +
                '}';
    }
}
