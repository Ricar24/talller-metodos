/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatallerordenamiento;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Augusto
 */
public class Generador {
    
    public static String generarNombre() {
        String[] nombres = {"Carlos", "Juan", "Alberto", "Camilo", "Roberto", "Miguel", "Luis", "Andres", "Antonio"};
        String[] apellidos = {"Gonzalez", "Orozco", "Rodriguez", "Suarez", "Diaz", "Castro", "Martínez"};
        
        return nombres[(int)(Math.random()*nombres.length)] +" "+ apellidos[(int)(Math.random()*apellidos.length)];
        }
    
    public static String generarDocumento() {
        return "1" + String.valueOf((int)(Math.random()*299999999+100000000));
    }
    
    public static BigDecimal generarPromedio() {
        Random r = new Random();
        BigDecimal promedio = new BigDecimal(r.nextDouble(3,5));
        promedio.setScale(1, RoundingMode.HALF_UP);
        return promedio;
    }
}
