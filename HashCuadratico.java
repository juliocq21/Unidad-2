/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author user
 */
public class HashCuadratico {
    private String[] tabla;
    private int tamaño;

    public HashCuadratico(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new String[tamaño];
    }

    private int funcionHash(int clave) {
        return clave % tamaño;
    }

    // Inserción con sondeo cuadrático
    public void insertar(int clave, String valor) {
        int indice = funcionHash(clave);
        int i = 1;
        while (tabla[indice] != null) {
            indice = (indice + i * i) % tamaño;
            i++;
        }
        tabla[indice] = valor;
        System.out.println("Insertado " + valor + " en indice " + indice);
    }

    public void mostrar() {
        System.out.println("\nTabla (Sondeo Cuadratico):");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("[" + i + "] => " + tabla[i]);
        }
    }
}
