/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1marcadorjuego;

/**
 *
 * @author Antonio
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Marcador {

    public static final int NUM_JUGADORES = 20;
    private Jugador[] jugadores = new Jugador[NUM_JUGADORES];

    // 1. Carga los datos del Map en el array
    public void cargarDatos(Map<Integer, Integer> datos) {
        for (Map.Entry<Integer, Integer> entrada : datos.entrySet()) {
            int indice = entrada.getKey() - 1;
            jugadores[indice] = new Jugador(entrada.getKey(), entrada.getValue());
        }
    }

    // localiza el jugador con la puntación más alta
//    private Jugador buscaGanador(){
//        if (jugadores.length == 0){
//            return null;
//        }
//        Jugador ganador = jugadores[0];
//        for (Jugador j : jugadores) {
//            if (j.getPuntuacion() > ganador.getPuntuacion()) {
//                ganador = j;
//            }
//        }
//        return ganador;
//    }
    // busqueda más avanzada con stream
    private Jugador buscaGanador() {
        return Arrays.stream(jugadores)
                .max(Comparator.comparingInt(Jugador::getPuntuacion))
                .orElse(null);
    }

    // 2. Id del jugador con mayor puntuación
    public int idGanador() {
        Jugador ganador = buscaGanador();
        return ganador.getId();
    }

    // 3. Puntuación más alta
    public int puntuacionGanador() {
        Jugador ganador = buscaGanador();
        return ganador.getPuntuacion();
    }

    // 4. Ganador completo
    public String ganadorCompleto() {
        Jugador ganador = buscaGanador();
        return "Ganador: " + ganador;
    }

    // 5. Puntuación media double
//    public double puntuacionMedia() {
//        int total = 0;
//        for (Jugador j : jugadores) {
//            total += j.getPuntuacion();
//        }
//        return (double) total / NUM_JUGADORES;
//    }
    // 5. puntuacionMedia() más avanzada con stream + mapToInt + average() 
    public double puntuacionMedia() {
        return Arrays.stream(jugadores)
                .mapToInt(Jugador::getPuntuacion)
                .average()
                .orElse(0.0);
    }

    // 6. Ordenar de mayor a menor puntuación, criterio secundario id ascendente
    public void ordenarPorPuntuacion() {
        Arrays.sort(jugadores,
                Comparator.comparingInt(Jugador::getPuntuacion).reversed()
                        .thenComparingInt(Jugador::getId)
        );
    }

    // 7. Mostrar marcador completo
//    public String mostrarMarcador() {
//        StringBuilder sb = new StringBuilder();
//        for (Jugador j : jugadores) {
//            sb.append(j.toString()).append("\n");
//        }
//        return sb.toString();
//    }
    // alternativa con uso de stream
    public String mostrarMarcador() {
        return Arrays.stream(jugadores)
                .map(Jugador::toString)
                .collect(Collectors.joining("\n"));
    }
}
