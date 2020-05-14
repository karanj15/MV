package lk.ijse.repository;

import lk.ijse.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface MovieRepo extends JpaRepository<Movies,String> {
}
