package division.Repositories;

import division.Models.Division;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DivisionRepo {



    private List<Division> listOfDivision = new ArrayList<>();


    DivisionRepo(){
        listOfDivision = List.of(
                new Division(1, "Dhaka"),
                new Division(2, "Khulna"),
                new Division(3, "Rangpur"),
                new Division(4,"Mymansing"),
                new Division(5, "Sylhet")
        );
    }

    public List<Division> getAllDivision(){

        return listOfDivision;
    }

}
