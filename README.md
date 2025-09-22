# Tarea
-CRUD de Tareas con Spring Boot

Este proyecto es una aplicación de ejemplo desarrollada con Spring Boot que implementa un sistema básico de gestión de tareas mediante un CRUD (Create, Read, Update, Delete).

-Tecnologías utilizadas

Java 17+

Spring Boot 3+

Spring Web (para exponer la API REST)

Spring Data JPA (para acceder a la base de datos)

PostgreSQL

Maven (gestión de dependencias)

⚙ Configuración

En el archivo application.properties se define la configuración básica de la aplicación, como la conexión a la base de datos.

Ejemplo:

spring.datasource.url=jdbc:postgresql://localhost:5432/tareasdb
spring.datasource.username=postgres
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update

▶ Ejecución

Clonar el repositorio:

git clone https://github.com/usuario/crud-tareas.git
cd crud-tareas


Compilar y ejecutar con Maven:

./mvnw spring-boot:run


La aplicación quedará disponible en:
👉 http://localhost:8080/tareas

Endpoints principales

El controlador TareaController expone endpoints REST para gestionar tareas:

GET /tareas → listar todas las tareas

GET /tareas/{id} → obtener una tarea por ID

POST /tareas → crear una nueva tarea

PUT /tareas/{id} → actualizar una tarea existente

DELETE /tareas/{id} → eliminar una tarea

- Pruebas

Las pruebas de la API se realizaron con Postman, verificando el funcionamiento de cada endpoint.

- Autores

Jefferson Rueda

Thalía Vaquiro

David Burgos

¿Quieres que te lo prepare en formato .md (Markdown) para subir directo a GitHub, o en Word para entregar como documento junto al proyecto?
