## Ejercicio 3
Crea un arrayList contenedor de varios tipos de objetos (créalos también). Escribe una aserción para verificar el orden de los objetos en ArrayList según han sido insertados.

- Verifica ahora que la lista anterior contiene los objetos en cualquier orden.
- Verifica que en la lista anterior uno de los objetos se ha añadido sólo una vez. Deja uno de los elementos sin añadir, y verifica que la lista no contiene éste último.

## Execution:
- he creado una clase objeto Book
- he creado una clase test donde he validado el primer punto con un .containsExactly();
- con .onlyContainsOnce() he verificado que solo hay una copia de ese elemento 
- y con .doesNotContain() que no exista en el arrayList el objeto que no hemos metido
