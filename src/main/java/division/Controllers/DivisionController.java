package division.Controllers;


import division.Models.District;
import division.Models.Division;
import division.Models.Upazila;
import division.Repositories.DistrictRepo;
import division.Repositories.DivisionRepo;
import division.Repositories.UpazilaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DivisionController {

    @Autowired
    private DivisionRepo divisionRepo;

    @Autowired
    private DistrictRepo districtRepo;

    @Autowired
    private UpazilaRepo upazilaRepo;


//    ............GETTING ALL DIVISIONS................
    @GetMapping("/divisions")
    public ResponseEntity<List<Division>> getDivisions(){

        return ResponseEntity.of(Optional.of(divisionRepo.findAll()));
    }


//    ...........GETTING DISTRICTS BY DIVISION ID..................
    @GetMapping("/division/{id}")
    public ResponseEntity<List<District>> getDistrictsByDivisionId(@PathVariable int id){
        List<District> districts = districtRepo.getDistinctsByDivisionId(id);
        if(districts.size() == 0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(districts);
        }
        return  ResponseEntity.ok(districts);
    }



//    ..........................GETTING UPAZILAS BY DISTRICT ID.............
    @GetMapping("/district/{dis_id}")
    public ResponseEntity<List<Upazila>> getUpazilasByDistrictId(@PathVariable("dis_id") int disId){
        List<Upazila> upazilas = upazilaRepo.getUpazilasByDistrictId(disId);
        if(upazilas.size() <= 0)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(upazilas);
        return ResponseEntity.ok(upazilas);
    }



}
