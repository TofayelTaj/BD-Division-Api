package division.Repositories;

import division.Models.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistrictRepo extends JpaRepository<District, Integer> {



    List<District> findAll();

    @Query(value = "SELECT * FROM districts u WHERE u.division_id = ?1", nativeQuery = true)
    List<District> getDistinctsByDivisionId(int id);

}
