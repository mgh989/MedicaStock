package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

}