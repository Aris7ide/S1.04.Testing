# Ejercicio 3: Control de Excepciones

## 📌 Enunciat del exercici
Crea una clase Java que contenga un método público que provoque una excepción del tipo ArrayIndexOutOfBoundsException. Este método puede, por ejemplo, intentar acceder a una posición inexistente de un array.

A continuación, implementa una clase de test con JUnit 5 que verifique que el método arroja la excepción esperada cuando se dan las condiciones correspondientes.

## ✨ Funcionalitats
- Junit y excepciones

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution

Creo la clase ClassException con un metodo que llama a una posicion de un array que no existe
En la clase test comprobo que esa excepcion se lanza con assertThrows()