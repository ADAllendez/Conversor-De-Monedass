<h1>💱 Conversor de Monedas – Challenge ONE Back-End Java</h1>

Este repositorio contiene la resolución del **Desafío de Java Back-End** del programa **Oracle Next Education + Alura Latam**. El objetivo fue implementar una aplicación en Java que consuma una **API REST de divisas** en tiempo real y permita realizar conversiones entre múltiples monedas mediante un menú interactivo en consola 🧮🧑‍💻.

El programa está desarrollado en **Java puro (sin Spring Boot)** y hace uso de `HttpClient`, `Gson` y estructuras de datos como `Map`. La interfaz es por consola, utilizando `Scanner` y `System.out`.

---

<h1>📋 Requisitos cumplidos</h1>

✅ Consumo de API REST (ExchangeRate API) usando `HttpClient` 🌐  

✅ Lectura y parseo de JSON con `Gson` 📦  

✅ Menú interactivo en consola con bucle y opciones numeradas 📲  

✅ Ingreso y validación de divisas disponibles (códigos como USD, ARS, EUR...) 🏦  

✅ Cálculo de tasas y resultados con formato `printf` 💰  

✅ Listado de monedas disponibles en forma legible 📄  

✅ Formato limpio, claro y reutilizable 🧼

---

<h1>🧪 Funcionalidad principal</h1>

📌 El usuario:
- Visualiza un menú con opciones (realizar conversión / salir).

- Elige la moneda de origen.

- Ve todas las monedas disponibles para convertir.

- Elige la moneda destino.

- Ingresa el monto a convertir.

- Recibe:
  - La tasa actual
  - El resultado convertido
  - Un menú para repetir o salir

Todo en una interfaz limpia desde consola.

---

<h1>🛠️ Tecnologías usadas</h1>

☕ Java 17  
🔗 HttpClient (nativo en Java 11+)  
📦 Gson (parseo de JSON)  
📤 ExchangeRate API (https://www.exchangerate-api.com/)  
🖥️ IntelliJ IDEA  

---

<h1>🚀 Instrucciones para ejecutar</h1>

1. Clonar este repositorio  
2. Asegurarse de tener Java 11+  
3. Descargar y agregar la librería `gson-2.10.1.jar` al proyecto  
4. Ejecutar la clase `Main.java`  
5. Interactuar con el menú de consola  

---


🎓 Desafío desarrollado en el marco de **Oracle Next Education – Back-End con Java**  
💻 Autor: **Alejo Diaz Allendez**  
🌐 Proyecto realizado con fines de práctica profesional y mejora continua
