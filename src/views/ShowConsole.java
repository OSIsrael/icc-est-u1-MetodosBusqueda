package views;

import java.util.Scanner;

public class ShowConsole {
    Scanner leer=new Scanner(System.in);
    public void showMenu(){
        System.out.println("Ingrese el codigo: ");

    }
    public int getCode(){
        System.out.println("Ingrese el codigo: ");
        int code=leer.nextInt();
        System.out.println("Codigo ingresado: "+code);
        return code;
    }
    public void showMessage(String message){
        System.out.println(message);
    }
    
}
