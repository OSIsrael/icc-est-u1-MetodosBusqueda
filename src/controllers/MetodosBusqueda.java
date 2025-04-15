package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda() {
    }

    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor)
                return i;
        }
        return -1;
    }

    public int findPersonByCode(int code) {

        for (int i = 0; i < people.length; i++) {
            if (people[i].getCodigo() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode() {
        boolean condition=true;
        while (condition) {
            int codeToFinde=showConsole.getCode();
            int indexPerson=findPersonByCode(codeToFinde);
            if (indexPerson>=0) {
                showConsole.showMessage("Persona encontrada");
                showConsole.showMessage(people[indexPerson].toString());
            }
            else{
                showConsole.showMessage("Persona con codigo: "+codeToFinde+" no encontrada");
            }   
        }

    }
}
