 <div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&height=180&color=0:263A29,50:4B5320,100:789262&text=GU%C3%8DA%20APE&fontColor=A3B18A&fontSize=50&fontAlignY=38&desc=Proyecto%20Java&descAlignY=60&descSize=20" width="100%" alt="Encabezado GUÍA APE"/>

<br>

<img src="https://github.com/user-attachments/assets/e0f2bb8b-2840-421f-8f8b-3ae0511d4453" alt="Logo del proyecto" width="50"/>

<br>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=700&size=22&pause=1200&color=A3B18A&center=true&vCenter=true&width=650&lines=Programaci%C3%B3n+Orientada+a+Objetos;Dieciocho+ejercicios+en+Java;Aprendiendo+a+programar" alt="Texto animado"/>

</div>

---

# 📚 Proyecto Examen — Programación Java

## 👥 Integrante
- Dávila Hernández Gabriel Marcelo

## 🎓 Curso

**Software "B" — Nivel 1**

## 📝 Descripción del proyecto

Este repositorio contiene dieciocho ejercicios desarrollados en Java para poner en práctica los fundamentos de la programación orientada a objetos (POO).

Cada ejercicio se encuentra organizado en una carpeta independiente y cuenta con una clase principal `Ejercicio#.java`, encargada de ejecutar el programa, además de las clases auxiliares necesarias.

Los ejercicios abarcan el manejo de clases y objetos, atributos, métodos, constructores, arreglos de objetos, parámetros, argumentos, tipos de retorno, referencias a objetos, composición, colaboración entre clases, estructuras condicionales y ciclos repetitivos.

## 📂 Organización del repositorio

```text
APE4-Inicio-de-POO-GABRIEL-DAVILA/
│
├── Ejercicio1/
├── Ejercicio2/
├── Ejercicio3/
├── Ejercicio4/
├── Ejercicio5/
├── Ejercicio6/
├── Ejercicio7/
├── Ejercicio8/
├── Ejercicio9/
├── Ejercicio10/
├── Ejercicio11/
├── Ejercicio12/
├── Ejercicio13/
├── Ejercicio14/
├── Ejercicio15/
├── Ejercicio16/
├── Ejercicio17/
├── Ejercicio18/
│
└── README.md
```

## 💻 Descripción de los ejercicios

### 🟢 Ejercicio 1: Notas del curso

El programa administra la información de cinco estudiantes mediante objetos de la clase `Estudiante`. Cada estudiante tiene un nombre y tres notas, con las cuales se calcula su promedio.

Mediante estructuras condicionales, se determina el estado académico de cada estudiante y se contabiliza el número de aprobados.

**Conceptos aplicados:**
- Creación de clases y objetos.
- Constructores y atributos.
- Métodos.
- Arreglos de objetos.
- Condicionales `if`, `else if` y `else`.
- Cálculo de promedios.

**Resultados:** muestra el nombre, el promedio y el estado académico de cada estudiante, además de la cantidad de aprobados.

### 🟢 Ejercicio 2: Inventario de una tienda

El programa administra un inventario de productos. Cada objeto de la clase `Producto` contiene el nombre, el precio y la cantidad disponible en stock.

Permite realizar ventas, actualizar las existencias, identificar los productos que necesitan reposición y calcular el valor total del inventario.

**Conceptos aplicados:**
- Clases y objetos.
- Métodos para modificar atributos.
- Arreglos de objetos.
- Estructuras condicionales.
- Operaciones aritméticas.
- Ciclos `for`.

**Resultados:** muestra los productos, sus precios, el stock disponible, las alertas de reposición y el valor total del inventario.

### 🟢 Ejercicio 3: Veterinaria

El programa registra información de varias mascotas, incluyendo su nombre, especie, edad y peso. Después, recorre un arreglo de objetos para mostrar los datos e identificar aquellas mascotas cuyo peso supera los 20 kg.

También demuestra cómo dos variables pueden hacer referencia al mismo objeto en memoria.

**Conceptos aplicados:**
- Clases y objetos.
- Constructores.
- Arreglos de objetos.
- Condicionales.
- Referencias a objetos.
- Modificación de atributos.

**Resultados:** presenta la información de las mascotas, identifica las que requieren una revisión de peso y demuestra cómo se modifica un objeto mediante una referencia.

### 🟢 Ejercicio 4: Cuenta de ahorro

El programa simula el ahorro de dos personas utilizando objetos de la clase `Cuenta`. Cada cuenta contiene el nombre del titular y su saldo actual.

Mediante un ciclo `while`, se realizan depósitos de $50 hasta alcanzar un saldo de $500. También se contabiliza cuántos meses necesita cada persona para llegar a esa cantidad.

**Conceptos aplicados:**
- Clases y objetos.
- Constructores.
- Métodos para depositar dinero.
- Ciclos `while`.
- Variables contadoras.
- Operaciones aritméticas.

**Resultados:** muestra la evolución del saldo de cada cuenta y la cantidad de meses necesarios para alcanzar la meta de ahorro.

### 🟢 Ejercicio 5: Biblioteca

El programa simula un sistema básico de préstamos de libros. La clase `Libro` almacena el título, el autor y la disponibilidad, mientras que la clase `Socio` registra el nombre del usuario y la cantidad de libros prestados.

Cuando un socio presta un libro disponible, el sistema actualiza su estado y aumenta el contador de préstamos del socio.

**Conceptos aplicados:**
- Creación de varias clases relacionadas.
- Clases y objetos.
- Métodos que reciben objetos como parámetros.
- Arreglos de objetos.
- Condicionales.
- Contadores y ciclos `for`.

**Resultados:** muestra los libros disponibles y prestados, la cantidad de libros prestados por cada socio y el número total de libros disponibles.

---

## 📗 Ejercicios del segundo documento: Métodos y parámetros

### 🟢 Ejercicio 6: Identificación de tipos de retorno

El ejercicio analiza un método llamado `calcularArea` que tiene un tipo de retorno `int`, pero realiza una operación que calcula el área utilizando variables `double`.

Se debe identificar por qué se produce un error de compilación y cómo corregirlo para que el método devuelva correctamente el resultado.

**Conceptos aplicados:**
- Tipos de retorno.
- Métodos.
- Variables `double` e `int`.
- Instrucción `return`.
- Errores de compilación.

**Resultados:** identifica el error y presenta la corrección del método para devolver el área calculada.

### 🟢 Ejercicio 7: Métodos void para acciones directas

Se crea una clase llamada `Bienvenida` con un método que recibe como parámetros el nombre de un usuario y su edad. El método imprime un mensaje de bienvenida en consola.

**Conceptos aplicados:**
- Creación de clases.
- Métodos `void`.
- Parámetros de tipo `String` e `int`.
- Impresión en consola.

**Resultados:** muestra un mensaje personalizado con el nombre y la edad del usuario.

### 🟢 Ejercicio 8: Parámetros vs. argumentos

El ejercicio analiza un método llamado `multiplicar`, que recibe dos valores de tipo `double` y devuelve el resultado de su multiplicación.

Se identifica cuáles son los parámetros y cuáles son los argumentos utilizados al invocar el método.

**Conceptos aplicados:**
- Métodos con parámetros.
- Argumentos.
- Tipos de datos `double`.
- Invocación de métodos.
- Instrucción `return`.

**Resultados:** identifica la diferencia entre parámetros y argumentos mediante un ejemplo de multiplicación.

### 🟢 Ejercicio 9: El comportamiento del paso por valor

Se analiza un método llamado `incrementar`, que recibe un número entero y le suma cinco a su valor.

El ejercicio permite comprobar qué sucede con la variable original cuando se modifica el parámetro dentro del método.

**Conceptos aplicados:**
- Métodos.
- Parámetros.
- Paso por valor.
- Variables enteras.
- Invocación de métodos.

**Resultados:** demuestra que la modificación de la copia del valor recibido no cambia la variable original del método `main`.

### 🟢 Ejercicio 10: Creación de un método con múltiples parámetros

Se agrega un método llamado `calcularPromedio` a la clase `Calculadora`. Este método recibe tres notas de tipo `double`, realiza la suma y divide el resultado para tres.

**Conceptos aplicados:**
- Creación de métodos.
- Múltiples parámetros.
- Tipo de retorno `double`.
- Operaciones aritméticas.
- Instrucción `return`.

**Resultados:** calcula y devuelve el promedio de las tres notas ingresadas.

### 🟢 Ejercicio 11: Validación de datos (Control de errores)

Se crea un método llamado `verificarEdad`, que recibe una edad de tipo entero. Comprueba que el valor se encuentre dentro del rango permitido, desde 0 hasta 120.

Si la edad no es válida, imprime un mensaje de error y devuelve `false`. Si es correcta, devuelve `true`.

**Conceptos aplicados:**
- Métodos booleanos.
- Parámetros.
- Estructuras condicionales.
- Validación de datos.
- Valores `true` y `false`.

**Resultados:** determina si una edad es válida o inválida mediante una condición.

### 🟢 Ejercicio 12: Completar la clase Producto

El ejercicio consiste en completar los espacios vacíos de la clase `Producto` para implementar un método llamado `calcularValorTotal`.

Este método utiliza el stock y el precio unitario para obtener el valor total del inventario de un producto.

**Conceptos aplicados:**
- Clases y atributos.
- Métodos.
- Tipo de retorno `double`.
- Operaciones aritméticas.
- Instrucción `return`.

**Resultados:** obtiene el valor total del inventario multiplicando el stock por el precio unitario.

### 🟢 Ejercicio 13: Instanciación e invocación en el Main

Se escribe el código necesario dentro del método `main` para crear un objeto de la clase `Producto`, asignarle un stock de 10 unidades y un precio unitario de 25.5.

Después, se invoca el método `calcularValorTotal`, se almacena el resultado en una variable llamada `totalInventario` y se imprime en consola.

**Conceptos aplicados:**
- Instanciación de objetos.
- Asignación de atributos.
- Invocación de métodos.
- Variables `double`.
- Método principal `main`.

**Resultados:** muestra el valor total del inventario del producto.

---

## 📘 Ejercicios del tercer documento: Integración de clases, objetos y métodos

### 🟢 Ejercicio 14: Libro y Autor

Se crean las clases `Autor` y `Libro`. La clase `Autor` contiene el nombre y la nacionalidad, mientras que la clase `Libro` almacena el título, el año y un objeto de tipo `Autor` como atributo.

Se implementa el método `mostrarInformacion()` para imprimir los datos de cada libro. En el método `main` se crean dos libros.

**Conceptos aplicados:**
- Creación de clases y objetos.
- Composición de objetos.
- Objetos como atributos.
- Métodos `void`.
- Constructores.

**Resultados:** muestra la información de dos libros junto con los datos de sus respectivos autores.

### 🟢 Ejercicio 15: Rectángulo

Se crea la clase `Rectangulo`, que contiene los atributos base y altura. Se implementan métodos para calcular el área, el perímetro, comprobar si es un cuadrado y obtener una descripción de sus dimensiones.

También se utiliza el método `mostrar()` para presentar los resultados.

**Conceptos aplicados:**
- Clases y atributos.
- Métodos con diferentes tipos de retorno.
- Operaciones matemáticas.
- Condicionales.
- Métodos `double`, `boolean`, `String` y `void`.

**Resultados:** muestra el área, el perímetro, si el rectángulo es un cuadrado y su descripción.

### 🟢 Ejercicio 16: Producto y Venta

Se crean las clases `Producto` y `Venta`. La clase `Producto` almacena el nombre, el precio y el stock, mientras que la clase `Venta` registra la cantidad de productos que se desean vender.

El método `aplicar(Producto producto)` recibe un objeto como parámetro, reduce el stock si existe suficiente cantidad y muestra el total a pagar.

**Conceptos aplicados:**
- Clases y objetos.
- Objetos como parámetros.
- Métodos.
- Control de stock.
- Estructuras condicionales.
- Operaciones aritméticas.

**Resultados:** permite realizar una venta, actualizar las existencias y mostrar el total a pagar o un mensaje de stock insuficiente.

### 🟢 Ejercicio 17: Transferencias

Se utiliza la clase `Cuenta`, que contiene el titular y el saldo. Se agrega el método `transferir(Cuenta destino, double monto)`, encargado de retirar dinero de una cuenta y depositarlo en otra, siempre que existan fondos suficientes.

En el método `main` se crean dos cuentas y se realizan dos transferencias: una válida y otra que falla.

**Conceptos aplicados:**
- Clases y objetos.
- Objetos como parámetros.
- Métodos.
- Manipulación de atributos.
- Condicionales.
- Operaciones aritméticas.

**Resultados:** muestra el funcionamiento de las transferencias entre dos cuentas, incluyendo una operación exitosa y otra que no se puede realizar por falta de fondos.

### 🟢 Ejercicio 18: Biblioteca y colaboración entre clases

Se desarrolla un sistema de biblioteca mediante tres clases: `Usuario`, `Libro` y `Prestamo`.

La clase `Usuario` almacena el nombre y la cédula. La clase `Libro` contiene el título y su disponibilidad. La clase `Prestamo` relaciona un usuario con un libro mediante objetos como atributos.

El método `registrar()` intenta realizar el préstamo y muestra un mensaje según el resultado. En el método `main`, dos usuarios intentan solicitar el mismo libro.

**Conceptos aplicados:**
- Creación de varias clases.
- Colaboración entre clases.
- Composición de objetos.
- Objetos como atributos.
- Métodos booleanos.
- Control de disponibilidad.
- Estructuras condicionales.

**Resultados:** permite comprobar la disponibilidad de un libro y evita que dos usuarios puedan obtener el mismo libro cuando ya se encuentra prestado.

---

## ⚙️ Requisitos para ejecutar los programas

- Tener instalado el JDK de Java.
- Disponer de un entorno de desarrollo compatible, como NetBeans, Eclipse o IntelliJ IDEA.
- Descargar o clonar el repositorio de GitHub.
- Mantener los archivos de cada ejercicio en su carpeta correspondiente.

## ▶️ Instrucciones de uso

1. Descargue o clone el repositorio en su computadora.
2. Abra el proyecto en su entorno de desarrollo Java.
3. Seleccione la carpeta del ejercicio que desea ejecutar.
4. Abra el archivo `Ejercicio#.java`.
5. Ejecute el método `main`.
6. Observe los resultados que aparecen en la consola.
7. Repita el procedimiento con los demás ejercicios.

**Nota:** cada carpeta contiene su propia clase principal `Ejercicio#.java`. Por eso, los ejercicios se ejecutan de manera independiente.

## 📖 Aprendizajes obtenidos

Durante el desarrollo del proyecto se reforzaron los conocimientos sobre programación orientada a objetos, creación de clases, instanciación de objetos, constructores, atributos y métodos.

También se practicó el uso de arreglos de objetos, estructuras condicionales, ciclos repetitivos, parámetros, argumentos, tipos de retorno, referencias a objetos, composición y colaboración entre clases.

La integración de los dieciocho ejercicios permitió fortalecer la lógica de programación y comprender cómo se relacionan diferentes clases y objetos para desarrollar programas en Java.

## 🛠️ Tecnologías utilizadas

- **Lenguaje de programación:** Java.
- **Paradigma:** Programación orientada a objetos.
- **Control de versiones:** Git.
- **Plataforma de alojamiento:** GitHub.
- **Entornos de desarrollo:** NetBeans, Eclipse e IntelliJ IDEA.

---

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:263A29,100:4B5320&height=3&section=footer" alt="Separador verde militar" width="100%"/>

**Desarrollado por Dávila Hernández Gabriel Marcelo**

**Software "B" — Nivel 1**

*Si lo puedes imaginar, lo puedes programar.* 🌿

</div>
