# Nivel 3: TDD — Desarrollo Guiado por Pruebas

## 📌 Enunciat del exercici
En este ejercicio trabajaremos con Test-Driven Development (TDD) para construir paso a paso una calculadora con estado interno .

Este enfoque nos ayudará a entender cómo escribir una prueba a la vez nos permite modelar mejor las clases y asegurar su correcta funcionalidad.

#### Objetivo
Aprender a aplicar el ciclo Red → Green → Refactor para diseñar una clase de forma iterativa, empezando por las necesidades expresadas en cada test.

### Ejercicio 1: Calculadora
Implementaremos una clase llamada Calculatorque gestiona un total acumulado , inicialmente 0, y que ofrece operaciones como sumar, restar, multiplicar, dividir y reiniciar.

🔴 Paso 1 (RED):Crear una clase de pruebas llamada CalculatorTest. Empieza por escribir un único test muy simple (por ejemplo: "el total inicial es cero"):

🟢 Paso 2 (GREEN): Haz pasar los tests: Implementando sólo el mínimo necesario en clase Calculator.

♻️ Paso 3 (REFACTOR): Refactoriza si es necesario.

A medida que vayas implementando la clase, cubre los siguientes comportamientos con tests:

- El total inicial es 0.
- El método add(x)incrementa el total.
- El método subtract(x)lo disminuye.
- El método multiply(x)multiplica el total por el valor pasado.
- El método divide(x)actualiza correctamente el total dividiendo por el valor.
- Dividir por cero debe generar una excepción ( ArithmeticException).
- El método reset()debe devolver el total a 0.
- El método getTotal()debe devolver el valor actual del total.

## ✨ Funcionalitats
- TDD

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Execution
- He hecho la clase Calculator con un solo atributo result que al instanciar la clase es 0.
- he creado la clase test y ahi comprobado que efectivamente se crea la clase con 0.
- he creado la prueba shouldAddToResult y el metodo .add()
- he hecho lo mismo con rest,mutiply y divide.
- El test shoudlGiveException valida la excepcion ArithmeticException
- 