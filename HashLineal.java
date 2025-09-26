/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author user
 */
public class HashLineal {
    private String[] tabla;
    private int tamaño;

    public HashLineal(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new String[tamaño];
    }

    private int funcionHash(int clave) {
        return clave % tamaño;
    }

    // Inserción con sondeo lineal
    public void insertar(int clave, String valor) {
        int indice = funcionHash(clave);
        while (tabla[indice] != null) { // buscar siguiente disponible
            indice = (indice + 1) % tamaño;
        }
        tabla[indice] = valor;
        System.out.println("Insertado " + valor + " en índice " + indice);
    }

    public void mostrar() {
        System.out.println("\nTabla (Sondeo Lineal):");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("[" + i + "] => " + tabla[i]);
        }
    }
}
