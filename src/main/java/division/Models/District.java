package division.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "districts")
public class District {

    @Id
    private int id;
    private String name;
    private String bn_name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "division_id")
    private Division division;


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getBn_name() {
        return bn_name;
    }

    public Division getDivision() {
        return division;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", bn_name='" + bn_name + '\'' +
                ", name='" + name + '\'' +
                ", division=" + division +
                '}';
    }
}
