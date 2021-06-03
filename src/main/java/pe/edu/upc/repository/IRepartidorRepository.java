package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Repartidor;

@Repository
public interface IRepartidorRepository extends JpaRepository<Repartidor, Integer>{

}
