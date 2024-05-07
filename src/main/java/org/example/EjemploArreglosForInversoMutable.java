package org.example;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for(int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

//        String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        System.out.println("=== Usando For ===");
        Arrays.sort(productos);

//        arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));

        for(int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
