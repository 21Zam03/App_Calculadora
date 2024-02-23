/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.zam.app_Principal;

import com.zam.interfaz.Calculadora;

public class Main {

    public static void main(String[] args) { 
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
        calculadora.setLocationRelativeTo(null);
        calculadora.setTitle("Calculadora ZAM");
    }
}
