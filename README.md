
---

# **Sistema de Gestión de Registros**
Una aplicación en **Spring Boot** para la gestión de usuarios. Este sistema proporciona **APIs RESTful** para manejar operaciones básicas de los usuarios.

## **Tecnologías utilizadas**

- **Java 17**
- **Spring Boot 3.3.4**
- **PostgreSQL**
- **JWT para autenticación**
- **Gradle**

## **Requisitos previos**

- **JDK 17** o superior
- **PostgreSQL**
- **Docker** (opcional)

## **Configuración e instalación**

### **Configuración de la base de datos**

Crea una base de datos en PostgreSQL:

```sql
CREATE DATABASE movie;
```

### **Configuración de la aplicación**

Clona el repositorio:

```bash
git clone <repository-url>
cd movie-system
```

Configura la conexión a la base de datos en `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/movie
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

Compila la aplicación:

```bash
./gradlew build
```

Ejecuta la aplicación:

```bash
./gradlew bootRun
```

La aplicación estará disponible en **[http://localhost:8080](http://localhost:8080)**

---

## **Documentación de la API**

### **Gestión de Usuarios**

#### **Registrar un usuario**, (usar para obtener el token).

**POST** `/api/users`  
**Content-Type:** `application/json`

```json
{
    "name": "Juan Pérez",
    "email": "juan@example.com",
    "address": "Calle Principal 123",
    "password": "100nmm#H"
}
```

**Respuesta:**

```json
{
    "id": 1,
    "name": "Juan Pérez",
    "email": "juan@example.com",
    "password": "password",
    "address": "Calle Principal 123",
    "token": "token"
}
```

#### **Obtener un usuario**

**GET** `/api/users/{id}`

**Respuesta:**

```json
{
    "id": 1,
    "name": "Juan Pérez",
    "email": "juan@example.com",
    "password": "password",
    "address": "Calle Principal 123",
    "token": "token"
}
```

---

### **Gestión de Productos**

#### **Crear un producto**

**POST** `/api/products`  
**Content-Type:** `application/json`

```json
{
    "name": "Teléfono Inteligente",
    "description": "Último modelo de smartphone",
    "price": 699.99,
    "stockQuantity": 50
}
```

**Respuesta:**

```json
{
    "id": 1,
    "name": "Teléfono Inteligente",
    "description": "Último modelo de smartphone",
    "price": 699.99,
    "stockQuantity": 50
}
```

#### **Obtener todos los productos**

**GET** `/api/products`

**Respuesta:**

```json
[
    {
        "id": 1,
        "name": "Teléfono Inteligente",
        "description": "Último modelo de smartphone",
        "price": 699.99,
        "stockQuantity": 50
    }
]
```

#### **Actualizar un producto**

**PUT** `/api/products/{id}`  
**Content-Type:** `application/json`

```json
{
    "name": "Teléfono Inteligente",
    "description": "Descripción actualizada",
    "price": 649.99,
    "stockQuantity": 45
}
```

#### **Eliminar un producto**

**DELETE** `/api/products/{id}`

---



## **Manejo de errores**

La API utiliza los siguientes códigos de estado HTTP:

- **200**: Éxito
- **400**: Solicitud incorrecta
- **401**: No autorizado
- **404**: No encontrado
- **500**: Error interno del servidor

**Ejemplo de respuesta de error:**

```json
{
    "timestamp": "2024-02-11T10:00:00Z",
    "status": 400,
    "error": "Bad Request",
    "message": "Message error",
    "path": "/api/products"
}
```

---

## **Pruebas**

Para ejecutar las pruebas:

```bash
./gradlew test
```

La aplicación incluye:

- **Pruebas unitarias** para servicios y controladores.

---

## **Seguridad**

La aplicación utiliza **JWT** para autenticación.  
Incluye el token en el encabezado `Authorization`:

```http
Authorization: Bearer <tu-token>
```

---
