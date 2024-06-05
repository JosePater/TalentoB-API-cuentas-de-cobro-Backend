package com.jpaternina.TalentoB_API_cuentas_de_cobro_Backend.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Entidad
@Data                // Lombok
@AllArgsConstructor  // Genera el constructor con todos los parámetros
@NoArgsConstructor   // Genera el constructor sin parámetros
public class Cliente {
    // Datos del cliente
    @Id // Identificador (primaryKey)
    private Long nit;
    private String razonSocial;
    private String celular;
    private String email;
    private String direccion;

    // Datos del servicio
    private String servicio;     // Tipo de servicio Leasing
    private Integer valorActivo;  // Valor del préstamo al banco
    private Integer plazoMaximo;  // Plazo máximo del pago en meses
    private Integer periodoCanon; // Cuotas de pago
}
