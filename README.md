# Email Service API 📧

Microservicio basado en **Spring Boot 3** diseñado para el envío automatizado de correos electrónicos profesionales mediante la carga de plantillas HTML. Este proyecto permite transformar archivos HTML físicos en cuerpos de correo electrónicos de manera dinámica.

---

## 🛠️ Stack Tecnológico
* **Java 17**
* **Spring Boot 3.x**
* **Maven**
* **Jakarta Mail** (Envío de correos)
* **Lombok** (Productividad de código)

---

## 🚀 1. Configuración del Servidor (SMTP)

Para que el servicio pueda enviar correos, debes configurar tus credenciales en el archivo:  
`src/main/resources/application.properties`

## 📩 2. Documentación de la API (Uso)

Este endpoint permite enviar correos electrónicos procesando un archivo HTML físico como cuerpo del mensaje.



* **URL:** `http://localhost:8080/api/email/enviar`
* **Método:** `POST`
* **Content-Type:** `multipart/form-data`

### Parámetros Requeridos (Body):

| Clave | Tipo | Descripción |
| :--- | :--- | :--- |
| `to` | `String` | Dirección de correo electrónico del destinatario. |
| `subject` | `String` | El asunto o título que aparecerá en el correo. |
| `htmlFile` | `File` | Archivo con extensión `.html` que contiene el diseño del correo. |

---

## 🛠️ 3. Ejemplos de Consumo

### Opción A: Desde Postman (Interfaz Visual)
1.  Crea una nueva pestaña de petición y selecciona el método **POST**.
2.  Ingresa la URL: `http://localhost:8080/api/email/enviar`.
3.  Dirígete a la pestaña **Body** y selecciona la opción **form-data**.
4.  Configura las siguientes filas:
    * `to`: Escribe el correo destino (ej. `usuario@correo.com`).
    * `subject`: Escribe el asunto (ej. `Prueba de envío`).
    * `htmlFile`: Cambia el tipo de dato de "Text" a **"File"** en el desplegable de la derecha y selecciona tu archivo `.html` desde tu computadora.
5.  Haz clic en **Send**.
