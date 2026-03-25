/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1marcadorjuego;

/**
 *
 * @author Antonio
 */
public class Jugador {
    private int id;
    private int puntuacion;

    public Jugador(int id, int puntuacion) {
        this.id = id;
        this.puntuacion = puntuacion;
    }

    public int getId() { return id; }
    public int getPuntuacion() { return puntuacion; }

    @Override
    public String toString() {
        return "Jugador " + id + " - " + puntuacion + " puntos";
    }
}