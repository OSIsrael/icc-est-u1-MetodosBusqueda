package controllers;

import views.ShowConsole;

public class MetodosBusqueda {
    private int[] arreglo;
    private ShowConsole showConsole = new ShowConsole();

    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == busquedaLineal(arreglo, valor)) {
                System.out.println("El elemento esta en: " + i);
                return i;
            }
        }
        return -1;
    }

}
