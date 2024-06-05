# API Spring Boot: Generador de cuentas de cobro

<p>
    <img src="https://img.shields.io/badge/STATUS-TERMINADO-green">
    <img src="https://img.shields.io/badge/SPRING BOOT-3.3.0-green">
    <img src="https://img.shields.io/badge/DATABASE-MySQL-blue">

</p>

## Descripción

API que genera cuentas de cobros a sus clientes. Está vinculada a una base de datos en MySQL
llamada `Api_Bancolombia_collection_accounts`.
Cuando se ejecuta la app de Spring Boot se crea una tabla llamada `cliente`.

###

### Datos:

Campos de la tabla `cliente` de la base de datos`Api_Bancolombia_collection_accounts`:

| Entidad Backend      | Campos de la tabla SQL    |
|----------------------|---------------------------|
| Long nit             | nit bigint(20) PK         |
| String razonSocial   | razon_social varchar(255) |
| String celular       | celular varchar(255)      |
| String email         | varchar(255) email        |
| String direccion     | direccion varchar(255)    |
|                      |                           |
| String servicio      | servicio varchar(255)     |
| Integer valorActivo  | valor_activo int(11)      |
| Integer plazoMaximo  | plazo_maximo int(11)      |
| Integer periodoCanon | periodo_canon int(11)     |

###

### Endpoints

| Método | Ruta                 | Descripción                                       |
|--------|----------------------|---------------------------------------------------|
| GET    | `/clientes`          | Obtiene todos los clientes de la tabla `cliente`. |
| POST   | `/solicitud-leasing` | Guarda un nuevo cliente en la tabla.              |
| POST   | `/cliente`           | Busca a un cliente por su Id.                     |
| PUT    | `/cliente`           | Modifica los datos de un cliente.                 |
| DELETE | `/{id}`              | Elimina a un cliente por su Id.                   |

##       

## Desarrollador:

| [<img src="https://avatars.githubusercontent.com/u/120583187?v=4" width=115><br><sub>José Luis Paternina Martínez</sub>](https://github.com/JosePater) 
|:------------------------------------------------------------------------------------------------------------------------------------------------------:| 

