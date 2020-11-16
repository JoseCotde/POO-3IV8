import java.util.Scanner;

public class metodos{


    Scanner entrada = new Scanner (System.in);

    public void menu();{
        
        char op;

        System.out.println("Cote de la Rosa Jose Carlos 3IV8")
        System.out.println("Selecciona un programa:");
        System.out.println("A.- Calcular edades");
        System.out.println("B.- Area de figuras");
        System.out.println("C.- Llamadas");

        op = entrada.next().charAt(0);


        switch(op){

            case 'A':
                Edad();
                break;

            case 'B':
                Areasfiguras();
                break;  

            case 'C':
                Llamadas();
                break;
        }
    }

    public void Edad();{

        int año, nacimiento, edad = 0;

        System.out.println("inserta el año actual");
        año = entrada.nextInt();
        System.out.println("Inserta tu año de nacimiento");
        nacimiento = entrada.nextInt();
        edad = año - nacimiento;
        System.out.println(edad);
    }

    public void Areasfiguras();{
                    
        int opcion, opcion2 = 0;

        System.out.println("Elija la opcion deseada: ");
        System.out.println("1. Calcular un cuadrado");
        System.out.println("2. Calcular un triangulo");
        System.out.println("3. Calcular un circulo");
        System.out.println("4. Calcular un rectangulo")

        opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                System.out.println("1. Area")
                System.out.println("2. Perímetro")
                opcion2 = entrada.next().charAt(0);

                switch (opcion2){
                    case 1:

                    System.out.println("Introduce el lado de la figura");
                    base = entrada.nextInt();
                    resultado = base * base;
            
                    System.out.println("El área del cuadrado es: "+ resultado);
                    
                    break;

                    case 2:

                    break;
                }
            break;

                case 2:
                
                System.out.println("1. Area")
                System.out.println("2. Perímetro")
                opcion2 = entrada.next().charAt(0);

                switch (opcion2){

                    case 1:
                    System.out.println("Introduce la base");
                    base = entrada.nextInt();

                    System.out.println("Introduce la altura");
                    altura = entrada.nextInt();
            
                    resultado = (base*altura)/2;

                    System.out.println("El área del triangulo es: "+ resultado);
                    break;

                    case 2:

                    break;

                break;

                case 3:

                    System.out.println("1. Area")
                    System.out.println("2. Perímetro")
                    opcion2 = entrada.next().charAt(0);

                    System.out.println("Introduce el radio");
                    base = entrada.nextInt();
            
                    resultado = (base*base)*3.1416;
            
                    System.out.println("El área del circulo es: "+ resultado);
            
                break;
                }

                case 4:
                
                    System.out.println("1. Area")
                    System.out.println("2. Perímetro")
                    opcion2 = entrada.next().charAt(0);
                
                    switch (opcion2) {
                        case 1:
                    
                        break;
                
                        case 2:

                        break;
                    }
                break
            }

    }
    public void Llamadas();{
        System.out.println("ingrese la opcion que desea: ");
        System.out.println("1 hacer una llamada nacional ");
        System.out.println("2 hacer una llamada internacional ");
        System.out.println("3 hacer una llamada a celular ");
        opcion = leer.nextInt();
        if(opcion == 1){
            credito-=.5;
        }else{
            if(opcion == 2){
                credito-=.6;
            }else{
                credito-=.2;
        System.out.println("ingrese su numero de telefono sin dejar espacios:");
        numero = leer.nextLong();
        System.out.println("ingrese el credito con el que cuenta en su telefono:");
        credito = leer.nextInt();
        
        System.out.println("ingrese la opcion que desea: ");
        System.out.println("1 hacer una llamada ");
        System.out.println("2 solicitar saldo ");
        System.out.println("3 Salir del menu ");
        hacer = leer.nextInt();
        while(hacer != 3 && credito > .2){
            switch (hacer) {
                case 1:
                    descontar();
                    break;
                case 2:
                    solicitar();
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            System.out.println("ingrese la opcion que desea: ");
            System.out.println("1 hacer una llamada ");
            System.out.println("2 solicitar saldo ");
            System.out.println("3 Salir del menu ");
            hacer = leer.nextInt();
        }
    }
}