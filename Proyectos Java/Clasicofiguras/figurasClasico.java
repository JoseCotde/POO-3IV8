import java.util.Scanner;

import java.util.*;

class figurasClasico {


    public static void main(String[] args){



        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion, decicion;
        double resultado;
        char letra;

        letra = 's' ;

        do {

        System.out.println("Elija la opcion deseada: ");
        System.out.println("1. Calcular el area de un cuadrado");
        System.out.println("2. Calcular el area de un triangulo");
        System.out.println("3. Calcular el area de un circulo");
        System.out.println("4. Salir");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:

            System.out.println("Introduce el lado de la figura");
            base = entrada.nextInt();
            resultado = base * base;
            
            System.out.println("El área del cuadrado es: "+ resultado);
            
            break;

            case 2:

            System.out.println("Introduce la base");
            base = entrada.nextInt();

            System.out.println("Introduce la altura");
            altura = entrada.nextInt();
            
            resultado = (base*altura)/2;

            System.out.println("El área del triangulo es: "+ resultado);

            break;

            case 3:

            System.out.println("Introduce el radio");
            base = entrada.nextInt();
            
            resultado = (base*base)*3.1416;
            
            System.out.println("El área del circulo es: "+ resultado);

            break;

            default:
            System.out.println("Abueno entonces pa que abres el programa crack");
           
        }
        System.out.println("si quieres repetir, pulsa s ");
            letra = entrada.next().charAt(0);
        } while (letra == 's');{

            
        }

    }
}