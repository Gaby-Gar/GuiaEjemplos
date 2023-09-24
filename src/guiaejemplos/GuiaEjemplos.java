/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaejemplos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */

public class GuiaEjemplos {
    Scanner input = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    
    public void EstructuraIf(){    
        int numero;

        System.out.print("Ingresa un número: ");
        numero = input.nextInt();

        if(numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
    
    public void EstructurSwitch(){
        int numero;

        System.out.print("Ingresa un número: ");
        numero = input.nextInt();

        switch (Integer.signum(numero)) {
        case 1:
            System.out.println("El número es positivo.");
            break;
        case -1:
            System.out.println("El número es negativo.");
            break;
        default:
            System.out.println("El número es cero.");
            break;
        }
    }
    
    public void EstructuraFor(){
        for(int i = 1; i <= 10; i++) {
            System.out.println("El valor de i es: " + i);
        }
    }

    public void While_DoWhile(){
        int numero;
        System.out.print("Ingresa un número positivo: ");
        numero = input.nextInt();
    
        // Ejemplo con while
        System.out.println("Ejemplo con while:");
        int contador1 = 0;
        while (contador1 < numero) {
            System.out.println("El valor del contador es: " + contador1);
            contador1++;
        }

    // Ejemplo con do-while
        System.out.println("Ejemplo con do-while:");
        int contador2 = 0;
        do {
            System.out.println("El valor del contador es: " + contador2);
            contador2++;
        } while (contador2 < numero);
    }
    
    public void JOption(){
        // Lectura de una cadena
        String nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre:");
        JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "!");

        // Lectura de un entero
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad:"));
        JOptionPane.showMessageDialog(null, "Tu edad es: " + edad);

        // Lectura de un número con punto flotante
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu altura en metros:"));
        JOptionPane.showMessageDialog(null, "Tu altura es: " + altura + " metros.");
        
        // Lectura de un carácter
        char sexo = JOptionPane.showInputDialog(null, "Ingresa tu sexo, M o F:").charAt(0);
        JOptionPane.showMessageDialog(null, "Tu sexo es: " + sexo);
        
        // Lectura de un valor booleano
        int dialogResult = JOptionPane.showConfirmDialog(null, "¿Te gusta programar en Java?");
        boolean leGustaJava = false;
        if(dialogResult == JOptionPane.YES_OPTION) {
            leGustaJava = true;
        }
        if(leGustaJava) {
            JOptionPane.showMessageDialog(null, "¡Excelente! Java es un lenguaje muy interesante.");
        } else {
            JOptionPane.showMessageDialog(null, "Oh, eso es una lástima. ¿Qué lenguaje de programación te gusta más?");
        }   
    }
    
    public void Scanner(){
        // Lectura de una cadena
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");

        // Lectura de un entero
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tu edad es: " + edad);

        // Lectura de un valor booleano
        System.out.print("¿Te gusta programar en Java? (true o false): ");
        boolean leGustaJava = scanner.nextBoolean();
        if(leGustaJava) {
            System.out.println("¡Excelente! Java es un lenguaje muy interesante.");
        } else {
            System.out.println("Oh, eso es una lástima. ¿Qué lenguaje de programación te gusta más?");
        }

        // Lectura de un carácter
        System.out.print("Ingresa tu sexo (M o F): ");
        char sexo = scanner.next().charAt(0);
        System.out.println("Tu sexo es: " + sexo);

        // Lectura de un número con punto flotante
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();
        System.out.println("Tu altura es: " + altura + " metros.");
    }
    
    public void Funcion(){
        //argumentos
        int a = 5;
        int b = 7;
        int suma = sumar(a, b); // Llamado a la función sumar() con los parámetros a y b
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
    }

    public static int sumar(int num1, int num2) { // Definicion de la funcion sumar() con dos parámetros
        //Parametros
        int resultado = num1 + num2;
        return resultado;
    }    
    
   
    String nombre;
    int edad;

    // Aquí se define el constructor
    // El constructor debe de llevar el mismo nombre de la clase (persona) 
    public GuiaEjemplos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        //parametros que recibe el constructor 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
            this.edad = edad;
    }
    
    public void Arreglos(){
        // declarar un arreglo de enteros con 5 elementos
        int[] numeros = new int[5];

        // inicializar el arreglo con valores del 1 al 5
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // imprimir los valores del arreglo utilizando un ciclo for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }
    }
            if (cancion1.equalsIgnoreCase(cancion2)) {
                System.out.println("La segunda canción no puede ser igual a la primera, intenta de nuevo.");
            }
    public static void main(String[] args) {        
        //Creacion de objetos  con el nombre del construcotor      
        GuiaEjemplos persona1 = new GuiaEjemplos("Juan", 25); // Se crea el nuevo objeto con el constructor
        GuiaEjemplos persona2 = new GuiaEjemplos("Maria", 30);

        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        System.out.println(persona2.getNombre() + " tiene " + persona2.getEdad() + " años.");
    }
}
