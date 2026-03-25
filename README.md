# examen1bmarcador
Simula la operacion con la lista de puntuaciones de un videojuego
Este ejercicio consiste en modelar el marcador de puntuaciones de un videojuego. Cada jugador está identificado por un id numérico (del 1 al NUM_JUGADORES) y tiene registrada su puntuación. El sistema debe permitir cargar los datos, consultar el ganador y ordenar el marcador.

Los datos de partida se facilitan en un fichero .java independiente que podrás descargar. Dicho fichero contiene un Map\<Integer, Integer\> donde la clave es el id del jugador y el valor es su puntuación. Tú debes crear el método que cargue esos datos en el array para operar sobre él.

**Clases que debes implementar**

***

**Clase Jugador**

***

Crea una clase Jugador con los siguientes atributos privados y sus correspondientes getters:

-   Id (número sin decimales)
-   Puntuación (sin decimales)

Puede ser interesante tener una implementación adecuada de toString en esta clase.

**Clase Marcador**

***

**Constante obligatoria**

NUM_JUGADORES = 20

El array de jugadores tendrá exactamente este tamaño.

**Métodos**

**1. cargarDatos(Map\<Integer, Integer\> datos)**

Recorre el Map recibido y rellena el array de Jugador. El jugador de dorsal 1 se almacena en la primera celda del array (recuerda que se cuentan desde cero) y así de igual forma para el resto.

**2. idGanador()**

Devuelve el id del jugador con la puntuación más alta.

**3. puntuacionGanador()**

Devuelve la puntuación más alta registrada.

**4. ganadorCompleto()**

Devuelve un String con el id y la puntuación del ganador. Ejemplo:

"Ganador: id 5 - 9850 puntos"

**5. puntuacionMedia()**

Calcula y devuelve la media de las puntuaciones de todos los jugadores como valor double.

**6. ordenarPorPuntuacion()**

Ordena el array de mayor a menor puntuación usando Arrays.sort() con un Comparator. Criterio secundario en caso de empate: id ascendente.

**7. mostrarMarcador()**

Devuelve un String formateado con la lista de jugadores y su puntuación (uno por línea).

**Restricciones**

***

-   El tamaño del array debe definirse mediante la constante NUM_JUGADORES.
-   La ordenacion debe realizarse con Arrays.sort() y un Comparator. No se permite ordenacion manual.
-   El Comparator puede implementarse como clase anónima, clase separada o expresión lambda.
-   No es necesario crear una clase principal operativa pero si se deben hacer todas las operaciones que permitan comprobar el correcto funcionamiento de todos los métodos.
