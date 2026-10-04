## Ejercicio 6
Provoca una ArrayIndexOutOfBoundsExceptionen una clase cualquiera. Crea una aserción que valide que la excepción es arrojada cuando corresponde.

## Execution:
- He creado un Array en ArrayClass
- He creado un metodo que llama una posicion inexistente
- En la clase de test he verificado la excepciones usando assertThatThrownBy().isInstanceOf().