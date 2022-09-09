/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatallerordenamiento;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Augusto
 * @class Alumnado
 * Esta clase contiene como atributos, arreglos que se guardan de forma paralela de los datos requeridos en el taller
 * para cada alumno
 */
public class Alumnado {
    private String[] documentos;
    private BigDecimal[] promedios;
    private int[] nroTiquetes;
    private int cantAlumnos;
    
    public Alumnado(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
        documentos = new String[cantAlumnos];
        nroTiquetes = new int[cantAlumnos];
        promedios = new BigDecimal[cantAlumnos];
    }
       
    public void setDocumento(int p, String documento) {
        documentos[p] = documento;
    }
    
    public String getDocumento(int p) {
        return documentos[p];
    }
    
    public void setPromedio(int p, BigDecimal promedio) {
        promedios[p] = promedio;
    }
    
    public BigDecimal getPromedio(int p) {
        return promedios[p];
    }
    
    public void setNroTiquetes(int p, int cant) {
        nroTiquetes[p] = cant;
    }
    
    public int getNroTiquetes(int p) { 
        return nroTiquetes[p];
    }
    
    /**
     * @method que determina y asigna la cantidad de tiquetes de cada estudiante según los siguientes criterios:
     * promedio >= 4.3: 5 tickets
     * promedio >= 3.6: 3 tickets
     * promedio >=3.2: 2 tickets
     * en caso de ser menor, no se le asignan tickets al estudiante
     */
    public void calcularNroTiquetes() {
        int _nroTiquetes;
        for (int i = 0; i < cantAlumnos; i++) {
            if (getPromedio(i).compareTo(new BigDecimal(4.25).setScale(2, RoundingMode.HALF_UP)) >= 0) {
                _nroTiquetes = 5;
            }
            else if (getPromedio(i).compareTo(new BigDecimal(3.55).setScale(2, RoundingMode.HALF_UP)) >= 0) {
                _nroTiquetes = 3;
            }
            else if (getPromedio(i).compareTo(new BigDecimal(3.15).setScale(2, RoundingMode.HALF_UP)) >= 0) {
                _nroTiquetes = 2;
            }
            else {
                _nroTiquetes = 0;
            }
            setNroTiquetes(i, _nroTiquetes);
        }
    }
     
    public int getCantAlumnos() {
        return cantAlumnos;
    }
}
