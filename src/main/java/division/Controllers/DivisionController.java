package division.Controllers;


import division.Models.Division;
import division.Repositories.DivisionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class DivisionController {

    @Autowired
    private DivisionRepo divisionRepo;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<String>(HttpStatus.OK);
    }


    @GetMapping("/divisions")
    public ResponseEntity<List<Division>> getDivisions(){
        return ResponseEntity.of(Optional.of(divisionRepo.getAllDivision()));
    }

}
