package org.example;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";


        System.out.println("=== Usando For ===");
        Arrays.sort(productos);
        for(int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }


        System.out.println("=== Usando ForEach ===");
        for(String prod: productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("=== Usando While ===");
        int i = 0;
        while (i < total) {
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("=== Usando DoWhile ===");
        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);
        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int l = 0; l < totalNumeros; l++) {
            numeros[l] = l*3;
        }

        for(int l = 0; l < totalNumeros; l++) {
            System.out.println("numeros["+ l + "] = " + numeros[l]);
        }

    }
}
