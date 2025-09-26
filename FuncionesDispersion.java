/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author user
 */
public class FuncionesDispersion {
    private int tamaño;

    // Constructor
    public FuncionesDispersion(int tamaño) {
        this.tamaño = tamaño;
    }

    // Método 1: División (la más usada)
    public int hashDivision(int clave) {
        return clave % tamaño;
    }

    // Método 2: Multiplicación (usa una constante A)
    public int hashMultiplicacion(int clave) {
        double A = 0.6180339887; // constante entre 0 y 1
        return (int) (tamaño * ((clave * A) % 1));
    }

    // Método 3: Para cadenas (usa ASCII de caracteres)
    public int hashCadena(String texto) {
        int hash = 0;
        for (int i = 0; i < texto.length(); i++) {
            hash = (31 * hash + texto.charAt(i)) % tamaño;
        }
        return hash;
    }
}
