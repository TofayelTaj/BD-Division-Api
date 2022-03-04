package division.Models;

import javax.persistence.*;

@Entity
public class Upazila {


    @Id
    private int id;
    private String name;
    private String bn_name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "district_id")
    private District district;


    public int getId() {
        return id;
    }

    public String getBn_name() {
        return bn_name;
    }

    public String getName() {
        return name;
    }

    public District getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "Upazila{" +
                "id=" + id +
                ", bn_name='" + bn_name + '\'' +
                ", name='" + name + '\'' +
                ", district=" + district +
                '}';
    }
}
