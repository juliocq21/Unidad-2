/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

import java.util.LinkedList;

public class HashEncadenamiento {
    private LinkedList<String>[] tabla;
    private int tamaño;

    // Constructor
    public HashEncadenamiento(int tamaño) {
        this.tamaño = tamaño;
        tabla = new LinkedList[tamaño];

        // Inicializar cada posición con una lista vacía
        for (int i = 0; i < tamaño; i++) {
            tabla[i] = new LinkedList<>();
        }
    }

    // Función hash (división)
    private int funcionHash(int clave) {
        return clave % tamaño;
    }

    // Insertar
    public void insertar(int clave, String valor) {
        int indice = funcionHash(clave);
        tabla[indice].add(valor);
        System.out.println("Insertado " + valor + " en índice " + indice);
    }

    // Buscar
    public boolean buscar(int clave, String valor) {
        int indice = funcionHash(clave);
        return tabla[indice].contains(valor);
    }

    // Mostrar tabla
    public void mostrarTabla() {
        System.out.println("\nContenido de la Tabla con Encadenamiento:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("[" + i + "] => " + tabla[i]);
        }
    }
}
