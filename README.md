# Trees in java

- https://www.baeldung.com/java-binary-tree
- https://www.dropbox.com/scl/fo/b43pdbqcij4qdik5bnvfo/AKSrlh1x4spFu-Y24FrycVU?rlkey=z636mwbe03wr0yb5fmsc3ny4f&dl=0
- https://www.baeldung.com/java-print-binary-tree-diagram


# Estrcuturas (apuntes y katas)

- https://www.it.uc3m.es/java/2012-13/units/pilas-colas/guides/2/guide_es_solution.html
- https://www.codewars.com/kata/55d17ddd6d7868493e000074/train/java
- https://learning.oreilly.com/library/view/grokking-algorithms-second/9781633438538/OEBPS/Text/07.html#heading_id_9 (GROKKING ALGORITHMS)

# Un ejercicio

Nos vamos a centrar en la definición de la interfaz de árbol binario (BTree) en Java. A modo de resumen, sin entrar en detalle antes de la POO, una interfaz en Java es una lista de métodos y, a veces, constantes que todas las clases que más tarde implementen esta interfaz deben incluir. En este caso, la interfaz BTree incluye un conjunto de métodos útiles para crear e insertar información y recorrer el árbol (pasar por el árbol accediendo a la información almacenada).

Vamos a revisar el código proporcionado. El archivo BTree.java define la interfaz (pendiente pero entendible). El archivo BTreeException.java define una clase Excepción que es usada por los métodos para indicar errores (es lo siguiente que veremos después de POO pero también es entendible). El archivo DummyTree.java es una clase que implementa la interfaz, con métodos dummy (no proporcionan la funcionalidad real, sólo imprimen la información de depuración en la pantalla). Finalmente, el archivo Test.java contiene un método principal para probar este ejercicio.

Primero, estudiemos el código y, una vez que estemos familiarizados con los métodos, deberás completar el Test.java con el código para construir el árbol de la  figura que también puedes encontrar en este repositorio. Primero crea todos los nodos (recuerda que los nodos son árboles), luego conéctalos apropiadamente y luego haz llamadas a los métodos para imprimir el árbol y obtener sus propiedades (tamaño y altura). 
