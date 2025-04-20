package views;

import java.util.Scanner;

import models.Persona;

public class ShowConsole {
    Scanner leer=new Scanner(System.in);
    public void showMenu(){
        System.out.println("Ingrese el codigo: ");

    }
    public int getAge(){
        System.out.println("Ingrese la edad: ");
        int code=leer.nextInt();
        System.out.println("Edad ingresado: "+code);
        return code;
    }
    public void ingresarPersona(){
        System.out.println("Ingrese la cantidad de personas que desea ingresar");
        int cantidad=leer.nextInt();
        Persona[] personas = new Persona[cantidad];
        
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
    }
    public String getName(){
        System.out.println("Ingrese su nombre a encontrar: ");
        String name=leer.next();
        System.out.println("Nombre ingresado: "+name);
        name.toLowerCase();
        return name;
    }
    public void showMessage(String message){
        System.out.println(message);
    }
    
}
