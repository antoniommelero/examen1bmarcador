/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1marcadorjuego;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Antonio
 */
/**
 * Clase de datos de partida para el ejercicio de la Carrera (Modelo A).
 * Contiene los tiempos de llegada de los corredores identificados por su
 * dorsal. Los dorsales ausentes corresponden a corredores que no han finalizado
 * la prueba.
 *
 * INSTRUCCIONES: 1. Descarga este fichero y añádelo a tu proyecto. 2. En tu
 * clase de prueba, llama a DatosCarrera.getDatos() para obtener el Map. 3. Pasa
 * ese Map al método cargarDatos() de tu clase Carrera
 *
 * Uso: Map<Integer, Duration> datos = DatosCarrera.getDatos();
 * mediaMaraton.cargarDatos(datos);
 */
public class DatosMarcador {

    /**
     * Devuelve un Map con las puntuaciones de los jugadores.
     * Clave:  id del jugador (1 - 20)
     * Valor:  puntuación obtenida en la partida
     *
     * Nota: los ids 7 y 13 tienen la misma puntuación (empate)
     * para que el alumno pueda verificar el criterio secundario del Comparator.
     */
    public static Map<Integer, Integer> getDatos() {
        Map<Integer, Integer> datos = new LinkedHashMap<>();

        datos.put(1,  4350);
        datos.put(2,  7820);
        datos.put(3,  1230);
        datos.put(4,  9100);   // candidato a ganador
        datos.put(5,  6540);
        datos.put(6,  3870);
        datos.put(7,  8450);   // empate con id 13 -> gana id 7 por criterio secundario
        datos.put(8,  2910);
        datos.put(9,  5670);
        datos.put(10, 7200);
        datos.put(11, 4890);
        datos.put(12, 1560);
        datos.put(13, 8450);   // empate con id 7  -> pierde id 13 por criterio secundario
        datos.put(14, 6030);
        datos.put(15, 3120);
        datos.put(16, 9050);   // segundo clasificado
        datos.put(17, 7780);
        datos.put(18, 2340);
        datos.put(19, 5010);
        datos.put(20,  980);   // ultimo clasificado

        return datos;
    }
}
