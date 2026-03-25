/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b1marcadorjuego;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Antonio
 */
public class B1MarcadorJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marcador marcador = new Marcador();
        Map<Integer, Integer> datos = DatosMarcador.getDatos();
        marcador.cargarDatos(datos);

        System.out.println("Marcador inicial");
        System.out.print(marcador.mostrarMarcador());

        System.out.println("Id ganador: " + marcador.idGanador());
        System.out.println("Puntuación ganador: " + marcador.puntuacionGanador());
        System.out.println(marcador.ganadorCompleto());
        System.out.printf("Puntuación media: %.2f%n", marcador.puntuacionMedia());

        marcador.ordenarPorPuntuacion();
        System.out.println("\nMarcador ordenado");
        System.out.print(marcador.mostrarMarcador());
    }
    
}
