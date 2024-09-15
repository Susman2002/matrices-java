package matricesATS;

import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {
        //como se definen?
        /*una matriz es un arreglo bidimencional es como una tabla de filas y columnas: de igual forma todos los datos son igual del mismo tipo de dato.
         * es como un arreglo de arreglos
         */
        Scanner leer = new Scanner(System.in);
        //primera forma de declarar(datos ya estabecidos)
        int matriz [][], n,m; //aca estamos declarando 3 variables la matriz la n y m.
        System.out.println("ingresa el numero de filas");
        n=leer.nextInt();
        System.out.println("ingresa el numero de columnas");
        m=leer.nextInt();
        matriz = new int [n][m]; //aca inicializamos la matriz ya con los valores que nos dan.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("matriz "+i+" "+j);
                matriz[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        leer.close();
    }
}
