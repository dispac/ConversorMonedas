# ConversorMonedas
Implementación de un conversor de monedas usando una API externa para obtener las respectivas tasas de cambio en tiempo real

# Funcionalidades
Esta aplicación permite realizar la conversión de pesos colombianos a Dólares y Euros y viceversa por ser las monedas de cambios más representativas en la actualidad.

# Recursos utilizados

- Lenguaje de Programación: Java
- API de Tasas de Cambio: Se utilizó la API de tasas de cambio de ExchagenRate-API para obtener las tasas de conversión entre diferentes monedas.
- Biblioteca Gson: Gson se utilizó para analizar la respuesta JSON de la API y convertirla en objetos Java para su manipulación.
- Entorno de Desarrollo utilizado: Netbeans IDE 25.

# Clases y funcionalidades

- ConversorApp.java : Clase en la cual se implementa la conversión de divisas usando la librería Gson de google para consultar y extraer información sobre las divisas. Al usuario se le muestra un menú de opciones dentro de las cuales deberá de escoger la opción deseada para que éste le arroje como resultado la conversión explícita a la moneda de interés
- En la documentación de la API se encontró que ésta ofrece la funcionalidad de realizar la conversión explícita a la moneda deseada, para ello solo basta con modificar la URL de la API en la cual se le especifican: la moneda base, la moneda de destino y la cantidad a convertir para que nos arroje una respuesta Json con la información de conversión; ejemplo: https://v6.exchangerate-api.com/v6/92d7b426499dfc23087ee9f2/pair/USD/COP/1 le estamos solicitando a la API que nos informe a cuantos pesos colombianos equivale un dólar.  
  
# Desarrollado

Desarrollado por Alex Bejarano
