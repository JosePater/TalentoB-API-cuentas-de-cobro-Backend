package com.jpaternina.TalentoB_API_cuentas_de_cobro_Backend.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Repositorio                              <Entidad, Type primaryKey>
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
