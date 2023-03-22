/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 19/03/23           *
 * Fecha Actualización:	20/03/23	  *
 * Descripción: Mètodo burbuja sin    *
 * 				interfaz	          *			   
 **************************************/
package Burbuja;

import java.util.Scanner;

public class Burbuja {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos que desea ordenar: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingrese los elementos a ordenar:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ordenar el arreglo utilizando el método de burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Se intercambia arr[j] y arr[j+1]
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
        //Se imprime el arreglo ordenado
        System.out.println("El arreglo ordenado es:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "-");
        }
        
	}
}
