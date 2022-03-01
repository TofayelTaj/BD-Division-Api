package division.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name= "districts")
public class District {

    @Id
    private int id;
    private String name;
    @OneToMany
    private List<Division> division_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Division> getDivision_id() {
        return division_id;
    }

    public void setDivision_id(List<Division> division_id) {
        this.division_id = division_id;
    }


    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", division_id=" + division_id +
                '}';
    }
}
