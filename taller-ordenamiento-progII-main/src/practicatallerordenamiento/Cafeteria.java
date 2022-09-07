/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatallerordenamiento;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Augusto
 */
public class Cafeteria {
    
    Alumnado alumn;
    
    
    public void setAlumn(Alumnado alumn) {
        this.alumn = alumn;
    }
    
    public Alumnado getAlumn() {
        return alumn;
    }

    /**
     * 
     * Método que intercambia dos variables entre arreglos para el objeto alumn
     * 
     * @param p1 posicion del primer elemento
     * @param p2 posición del segundo elemento
     */
    public void cambiar(int p1, int p2) {
        String tempDoc = alumn.getDocumento(p1);
        BigDecimal tempProm = alumn.getPromedio(p1);
        int tempTiquetes = alumn.getNroTiquetes(p1);
        
        alumn.setDocumento(p1, alumn.getDocumento(p2));
        alumn.setPromedio(p1, alumn.getPromedio(p2));
        alumn.setNroTiquetes(p1, alumn.getNroTiquetes(p2));
        
        alumn.setDocumento(p2, tempDoc);
        alumn.setPromedio(p2, tempProm);
        alumn.setNroTiquetes(p2, tempTiquetes);
    }
    
    public int posicionMenor(int inicio) {
        int posMenor;
        int menorElemento;
        posMenor = inicio;
        menorElemento = alumn.getNroTiquetes(inicio);
        
        for (int i = inicio+1; i <= alumn.getCantAlumnos()-1; i++) {
            if (alumn.getNroTiquetes(i) < menorElemento) {
                menorElemento = alumn.getNroTiquetes(i);
                posMenor = i;
            }
        }
        return posMenor;
    }
    
    public void ordenarBurbuja() {
        for (int i = 0; i<=alumn.getCantAlumnos()-1; i++) {
            for (int j = 0; j <= (alumn.getCantAlumnos()-i)-2;j++) {
                if (alumn.getNroTiquetes(j) > alumn.getNroTiquetes(j+1)) {
                    cambiar(j, j+1);
                }
            }
        }
    }
    
    public void ordenarIntercambio() {
        for (int i = 0; i <= alumn.getCantAlumnos() - 1; i++) {
            for (int j = i+1; j <= alumn.getCantAlumnos() - 1; j++) {
                if (alumn.getNroTiquetes(i) > alumn.getNroTiquetes(j)) {
                    cambiar(i, j);
                }
            }
        }
    }
    
    public void ordenarSeleccion() {
        for (int i = 0; i < alumn.getCantAlumnos()-1; i++) {
            cambiar(i, posicionMenor(i));
        }
    }
    
    public void ordenarQuickSort(int primero, int ultimo){
        int i, j, centro;
        int pivote;
        centro = (primero+ultimo)/2;
        pivote = alumn.getNroTiquetes(centro);
        i = primero;
        j = ultimo;
        do {
            while((i <= j) && (alumn.getNroTiquetes(i) < pivote)){
            i = i + 1;
            }
            while((i <= j) && (alumn.getNroTiquetes(j) > pivote)){
            j = j - 1;
            }
            if(i <= j){
                cambiar(i, j);
                i = i + 1;
                j = j - 1;
            }
        }while(i <= j);
        if(primero < j){
            ordenarQuickSort(primero, j);
        }
        if(i < ultimo){
            ordenarQuickSort(i, ultimo);
        }
    }
}
