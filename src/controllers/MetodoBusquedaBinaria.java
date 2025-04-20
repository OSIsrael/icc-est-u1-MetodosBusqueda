package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodoBusquedaBinaria {
    private Persona[] personas;
    private ShowConsole showConsole;
    public MetodoBusquedaBinaria(Persona[] personas) {
        this.personas = personas;
        this.showConsole = new ShowConsole();
        System.out.println("Clase MBB creada");
        showConsole.showMessage("Metodo de busqueda binaria");
    }
    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = personas.length - 1;
    
        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
    
            // Mostrar todo el arreglo con separadores
            for (int i = 0; i < personas.length; i++) {
                System.out.print(personas[i].getCodigo() + " | ");
            }
            System.out.println();
    
            // Mostrar índices
            System.out.println("bajo=" + bajo + "\talto=" + alto + "\tcentro=" + central + "\tvalorCentro=" + personas[central].getCodigo());
    
            // Mostrar dirección
            if (personas[central].getCodigo() == code) {
                System.out.println("--> ENCONTRADO\n");
                return central;
            } else if (personas[central].getCodigo() < code) {
                System.out.println("--> DERECHA\n");
                bajo = central + 1;
            } else {
                System.out.println("--> IZQUIERDA\n");
                alto = central - 1;
            }
        }
    
        return -1;
    }
    
    public void showPersonByAge() {
        int ageToFinde = showConsole.getAge();
        int indexPerson = findPersonByCode(ageToFinde);
        if (indexPerson == -1) {
            showConsole.showMessage("No ha sido encontrado");
        } else {
            showConsole.showMessage("Persona con edad: " + ageToFinde + " encontrada");
            showConsole.showMessage(personas[indexPerson].toString());
        }
    }
    private int findPersonByName(String name) {
        sortByName(personas);
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            int comparacion=personas[central].getNombre().compareTo(name);
            if (comparacion==0) {
                return central;
            }
            if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }

        return -1;
    }
    public void showPersonByName() {
        boolean condition=true;
        while (condition) {
            String nameToFinde = showConsole.getName();;
            int indexPerson = findPersonByName(nameToFinde);
            if (indexPerson == -1) {
                showConsole.showMessage("No ha sido encontrado");
            } else {
                showConsole.showMessage("Persona con nombre: " + nameToFinde + " encontrada");
                showConsole.showMessage(personas[indexPerson].toString());
            }  
        }
    }
    private void sortByName(Persona[] personas){
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - 1 - i; j++) {
                if (personas[j].getNombre().compareTo(personas[j + 1].getNombre()) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }
    
}
