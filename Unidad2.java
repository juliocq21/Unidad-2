/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2;

import java.util.Hashtable;

/**
 *
 * @author user
 */
public class Unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Hashtable<String, Integer> tabla = new Hashtable<>();

        // Insertar elementos (clave, valor)
        tabla.put("Julio", 25);
        tabla.put("Maria", 30);
        tabla.put("Pedro", 20);

        // Buscar claves en la tabla
        String claveBuscada = "Maria";
        if (tabla.containsKey(claveBuscada)) {
            System.out.println("Encontrado: " + claveBuscada + " → " + tabla.get(claveBuscada));
        } else {
            System.out.println("No se encontró la clave: " + claveBuscada);
        }

        // Probar con otra clave
        claveBuscada = "Ana";
        if (tabla.containsKey(claveBuscada)) {
            System.out.println("Encontrado: " + claveBuscada + " → " + tabla.get(claveBuscada));
        } else {
            System.out.println("No se encontró la clave: " + claveBuscada);
        }
    }
    
}
