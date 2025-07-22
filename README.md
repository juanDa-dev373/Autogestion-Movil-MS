# TICKET API

API para la gestión de tickets.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot** (Spring Web, Spring Data JPA, Spring GraphQL)
- **PostgreSQL**
- **Docker y Docker Compose**
- **Gradle**

## Instalación y Ejecución en Local

### 1. Clonar el repositorio
```sh
git clone <URL_DEL_REPOSITORIO>
cd <NOMBRE_DEL_PROYECTO>
```

### 2. Compilar y ejecutar la aplicación
```sh
./gradlew build
```

### 3. Iniciar los contenedores con Docker Compose
```sh
docker-compose -f deployment/docker-compose.yml up -d --build
```
Esto levantará un contenedor con PostgreSQL y el proyecto.



## Documentación de la API

La API está documentada en formato OpenAPI y soporta REST y GraphQL.

### Endpoints REST
| Método | Endpoint | Descripción |
|--------|---------|-------------|
| `GET` | `/api/v1/stats/{id}` | Obtener un stats por ID |
| `PUT` | `/api/v1/stats/{id}` | Actualizar un stats |
| `DELETE` | `/api/v1/stats/{id}` | Eliminar un stats |
| `POST` | `/api/v1/stats` | Crear un nuevo stats |
| `GET` | `/api/v1/stats/search` | Buscar tickets con filtros y paginación |

## Endpoints REST

Basado en OpenAPI 3.0:

- **Crear Ticket**  
  `POST /api/v1/stats`
  ```json
  {
    "user": "usuario123",
    "status": "OPEN"
  }
  ```

- **Obtener Ticket por ID**  
  `GET /api/v1/stats/{id}`

- **Actualizar Ticket**  
  `PUT /api/v1/stats/{id}`

- **Eliminar Ticket**  
  `DELETE /api/v1/stats/{id}`

- **Buscar Tickets con Filtros y Paginación**  
  `GET /api/v1/stats/search?page=0&size=10&status=OPEN`

### GraphQL
- La API también expone operaciones GraphQL en `/graphql`.
- Puedes usar herramientas como **GraphiQL** para consultar los tickets.

## Probar la API
### Swagger UI
La documentación Swagger está disponible en:
```
http://localhost:8082/actuator/swagger-ui/index.html#
```

### GraphQL Playground
Puedes acceder al Playground de GraphQL en:
```
http://localhost:8080/graphiql
```

### Consultar tickets con GraphQL
Ejemplo de consulta:
```graphql
curl --location 'http://localhost:8080/graphql' ^
--header 'accept: application/json' ^
--header 'Content-Type: application/json' ^
--data '{
  "query": "query { getTicket(id: 1) { id username status createdAt updatedAt } }"
}
'
```

## Apagar los contenedores
```sh
docker-compose -f deployment/docker-compose.yml down
```

