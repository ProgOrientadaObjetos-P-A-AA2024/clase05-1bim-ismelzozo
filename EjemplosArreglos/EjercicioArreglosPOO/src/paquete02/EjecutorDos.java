/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;
/**
 *
 * @author User
 */
public class EjecutorDos {
    public static void main(String[] args) {
        double [] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Casi";
        LibretaCalificacion l = new LibretaCalificacion(nombreEstudiante, notas);
        l.establecerPromedio();
        // si no se ejecuta esta linea no podria sacar el promedio de las notas designadas 
        // por lo tanto el resultado seria 0 lo cual marcaria como una nota mas baja que seria 
        // regular 
        l.establecerPromedioCualitativo();
        // al no poner esta linea al imprimir en pantalla el resultado no seria ni regular a sobresaliente 
        // por lo cual arrojaria null
        System.out.printf("\n%s\n", l);
    }
}
