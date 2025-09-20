/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

public class HashFunction {
    public static int simpleHash(String key, int size) {
        return Math.abs(key.hashCode()) % size;
    }
}