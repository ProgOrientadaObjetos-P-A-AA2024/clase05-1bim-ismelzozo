/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class Ejemplo4 {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Fenix", "nombramiento");
        Profesor p2 = new Profesor("Richi", "contrato");
        // crear un arreglo de objetos de tipo Calificacion
        //  crea un arreglo de tipo unidimensional osea de tipo estatico
        Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computación", p1);
        Calificacion c2 = new Calificacion(9, "Electrónica", p2);
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - Profesor(%s - %s )\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
                    objetoCalificacion.obtenerProfesor().obtenerTipo());
        }
        
    }
}
