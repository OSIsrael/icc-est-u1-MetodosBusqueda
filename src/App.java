import java.util.Scanner;

import controllers.MetodoBusquedaBinaria;
import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner leer= new Scanner(System.in);
        // metodoBusquedaBinaria.showPersonByCode();
        // MetodosBusqueda metodosBusqueda= new MetodosBusqueda(personas);
        ShowConsole showConsole = new ShowConsole();
        System.out.println("Ingrese la cantidad de personas que desea ingresar");
        int cantidad = leer.nextInt();
        Persona[] personas = new Persona[cantidad];
        MetodoBusquedaBinaria metodoBusquedaBinaria = new MetodoBusquedaBinaria(personas);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Persona " + (i + 1));

            System.out.print("Nombre: ");
            leer.nextLine();
            String nombre = leer.nextLine();

            System.out.print("Edad: ");
            int edad = leer.nextInt();

            personas[i] = new Persona(edad, nombre);
        }

        System.out.println("\nPersonas ingresadas:");
        for (Persona p : personas) {
            System.out.println(p);
        }
        metodoBusquedaBinaria.showPersonByAge();

    }
}
