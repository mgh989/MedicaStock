package pe.edu.upc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.model.Cliente;
import pe.edu.upc.repository.IClienteRepository;
import pe.edu.upc.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository cCliente;
	
	@Override
	@Transactional
	public boolean insertar(Cliente cliente) {
		Cliente objCliente = cCliente.save(cliente);
		if(objCliente!=null) return true;
		return false;
	}

	@Override
	@Transactional
	public boolean modificar(Cliente cliente) {
		boolean flag = false;
		try {
			cCliente.save(cliente);
			flag=true;
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return flag;
	}

	@Override
	@Transactional
	public void eliminar(int idCliente) {
		cCliente.deleteById(idCliente);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<Cliente> buscarId(int idCliente) {
		return cCliente.findById(idCliente);
	}

	@Override
	public Optional<Cliente> listarId(int idCliente) {
		return cCliente.findById(idCliente);
	}

	@Override
	public List<Cliente> listar() {
		return cCliente.findAll();
	}

}
