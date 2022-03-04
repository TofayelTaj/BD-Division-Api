package division.Repositories;

import division.Models.Upazila;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UpazilaRepo extends JpaRepository<Upazila, Integer> {


    @Query(value = "SELECT  * from upazila  where district_id = ?1", nativeQuery = true)
    List<Upazila> getUpazilasByDistrictId(int id);

}
