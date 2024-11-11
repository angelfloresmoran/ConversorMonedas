<h1 align="center" color="#DA70D6"> Conversor de Monedas </h1>
<p align="Center">
   <img style="text-align:center;" height="300px"  width="600px" src="https://images.pexels.com/photos/14891541/pexels-photo-14891541.jpeg">
</p>
<p align="center">
  <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
  <img src="https://github.com/facebook/docusaurus/actions/workflows/tests.yml/badge.svg" alt="GitHub Actions status">
</p>

## Descripción
<p>
   El proyecto Conversor de monedas surge a raíz de un Challenge propuesto por Alura Latam en unión con ORACLE. Dónde se tiene como objetivo 
   consolidar los conocimientos obtenidos en la Ruta de Aprendizaje Java Orientado a Objetos .
</p>

## Características
Se hace uso de la API, Exchange Rate API la cuál ofrece hacer la conversión de Divisas de manera precisa y confiable. Esta API cuenta con 2 principales formatos para la versión gratuita.

- 'Standard': Admite un parámetro, **Moneda base**, con base a esta moneda base se devuelve una lista completa de otras monedas que soporte la API.
- 'Pair Converion': Esta opción principalmente admite 2 parámetros **Código de Moneda Base** y **Código de Moneda Objetivo**, con esto hace una conversión más directa. Adicional a esto se acepta un tercer parámetro **Amount = Monto a cambiar**, con esto se puede pasar directamente la cantidad sobre la que requerimos se haga la conversión.

Para este proyecto se utilizo la opción **Conversión por Pares** ya que después de analizar las funcionalidades de la API, se concluyó que es la más viable para cumplir con las necesidades actuales. 

### Paquetes
Para una mejor estructura, se crearon varios paquetes. 
- `dto`: Dónde se almacena el DTO que almacena los valores devueltos por JSON y ahí mismo formatea el texto de salida, esto con la clase **ToString**
- `modelos`: Contiene la clase **Filtra Códigos Monedas**. Dónde se creo un setter para asignar el código a Moneda base y Moneda objetivo, esto dea cuerdo a la opción que haya seleccionado el usuario del Menu en la clase principal. Se tiene también 2 getters para retornar los códigos de las monedas sobre las que se realizará la conversión. 
- `peticioneshttp`: Contiene la clase **PairConversionRequests** que es la encargada de realizar la petición http, de obtener una respuesta http y pasarlo a un Gson.
- `principal`: Contiene la clase principal que es con la que interactua el usuario, en esta se le presenta el menú de opciones y los espaciós para que ingrese tanto la conversión que quiere realizar así como el monto. 

## :hammer: Funcionalidades del proyecto

- `USD a MXN`: Permité hacer la conversión de Dólares Estadounidenses a Pesos Mexicanos.
- `MXN a USD`: Permite hacer la conversión de Pesos Mexicanos a Dólares Estadounidenses.
- `USD a ARS`: Permite hacer la conversión de Dólares Estadounidenses a Pesos Argentinos
- `ARS a USD`: Permite hacer la conversión de Pesos Argentinos a Dólares Estadounidenses.
- `USD a BRL`: Permite hacer la conversión de Dólares Estadounidenses a Real Brazileño.
- `BRL a USD`: Permite hacer la conversión de Real Brazileño a Dólares Estadounidenses.
- `USD a COP`: Permite hacer la conversión de Dólares Estadounidenses a Peso Colombianos.
- `COP a USD`: Permite hacer la conversión de Pesos colombianos a Dólares Estadounidenses.

## Ejemplos de Conversiones Realizadas
<img width="500" alt="conversion" src="https://github.com/user-attachments/assets/31075b55-2908-46f8-a67f-756d0f9866ae">
<img width="500" alt="conversionARS" src="https://github.com/user-attachments/assets/7a92e5f4-1ad3-4ba2-b88f-020ba5ccd376">

## Insignias 
### Insignia obtenida tras finalizar el desafío
![Badge-Conversor](https://github.com/user-attachments/assets/eb3cc1e7-3ed8-4790-bf98-fc240250a398)



