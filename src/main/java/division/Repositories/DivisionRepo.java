package division.Repositories;

import division.Models.Division;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DivisionRepo  extends JpaRepository<Division, Integer> {


    List<Division> findAll();


}
