package com.jpaternina.TalentoB_API_cuentas_de_cobro_Backend.Cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

/* Esta clase (Servicio) provee los servicios al controlador, el cual publica
 *  los endpoints o rutas para que sean consumidas. Para así manipular la tabla person
 */

@Service // Servicio
@RequiredArgsConstructor // Crea el constructor
public class ClienteService {

    // Inyección del repositorio: se genera al momento de crear el constructor | También con @Autowired
    private final ClienteRepository clienteRepo;

    // Obtener todos los clientes
    public List<Cliente> getAllClientes() {
        return clienteRepo.findAll();
    }

    // Guardar un nuevo cliente o modificar existente
    public void addCliente(Cliente cliente) {
        System.out.println("Nuevo cliente: " + cliente);
        clienteRepo.save(cliente);
    }

    // Obtener cliente por su Nit
    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepo.findById(id);
    }

    // Eliminar un cliente
    public void deleteCliente(Long id) {
        clienteRepo.deleteById(id);
    }

}
