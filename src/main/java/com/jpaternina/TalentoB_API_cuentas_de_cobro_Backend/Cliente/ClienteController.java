package com.jpaternina.TalentoB_API_cuentas_de_cobro_Backend.Cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller // Controlador
@RestController
@RequiredArgsConstructor
@RequestMapping
public class ClienteController {

    private final ClienteService clienteService; // Inyección del servicio

    // Obtener todos los clientes
    @GetMapping("/clientes")
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    // Agregar un nuevo cliente
    @PostMapping("/solicitud-leasing")
    public void addCliente(@RequestBody Cliente cliente) {
        clienteService.addCliente(cliente);
    }

    // Obtener cliente por su Nit
    @PostMapping("/cliente")
    public Optional<Cliente> findClienteById(@RequestBody Long id) {
        return clienteService.getClienteById(id);
    }

    // Actualizar cliente
    @PutMapping("cliente")
    public void updateCliente(@RequestBody Cliente cliente) {
        clienteService.addCliente(cliente);
    }

    // Eliminar en cliente
    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }

}
