package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Farmacia;

@Repository
public interface IFarmaciaRepository extends JpaRepository<Farmacia, Integer>{

}