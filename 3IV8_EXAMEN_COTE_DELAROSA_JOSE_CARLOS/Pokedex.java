//no man re dificil
import java.util.Scanner;

import java.util.*;

class Pokedex {


    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
    
        int opcion,PV,Fuerza,Defensa,ataqueP,ataqueS;
        String Nombre;
        double ID;
        char rep,rep2;

        System.out.println("BIENVENIDO A TU POKEDEX");
        System.out.println("Creador: prof palmera (mejor conocido como Cote de la Rosa Jose Carlos");
        rep = 's';
        do{
            System.out.println("Elije que quieres hacer");
            System.out.println("1.Charmander");
            System.out.println("2.Bulbasaur");
            System.out.println("3.Squirtle");
            System.out.println("4.Pelea pokemon");
            System.out.println("5.Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    do{
                    System.out.println("Charmander");
                    ID = 0001;
                    System.out.println("ID:"+ID);
                    System.out.println("El pokemon inutil");
                    System.out.println("Charmander es el pkemon mas absolutamente inutil de los 3 iniciales");
                    PV = 10;
                    System.out.println("Puntos de vida:"+PV);
                    Fuerza = 3;
                    System.out.println("Fuerza:"+Fuerza);
                    Defensa = 4;
                    System.out.println("Defensa:"+Defensa);
                    System.out.println("Ataque principal: nada");
                    System.out.println("Ataque secundario: nada pero peor");
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;
            
                case 2:
                    rep2 = 's';
                    do{
                    System.out.println("Bulbasaur");
                    ID = 69;
                    System.out.println("ID:"+ID);
                    System.out.println("El pokemon chad");
                    System.out.println("Bulbasaur es el pokemon mas epico de todos los iniciales les gana a todo alto capo");
                    PV = 15;
                    System.out.println("Puntos de vida:"+PV);
                    Fuerza = 6;
                    System.out.println("Fuerza:"+Fuerza);
                    Defensa = 7;
                    System.out.println("Defensa:"+Defensa);
                    System.out.println("Ataque principal: Ser epico");
                    System.out.println("Ataque secundario: Ganar");
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;
                case 3:
                    do{
                    System.out.println("Squirtle");
                    ID = 0420;
                    System.out.println("ID:"+ID);
                    System.out.println("El pokemon xd");
                    System.out.println("Squirtle no importa mucho, esta ahi, para que no elijas a charmander");
                    PV = 15;
                    System.out.println("Puntos de vida:"+PV);
                    Fuerza = 6;
                    System.out.println("Fuerza:"+Fuerza);
                    Defensa = 4;
                    System.out.println("Defensa:"+Defensa);
                    System.out.println("Ataque principal: XDDD");
                    System.out.println("Ataque secundario: xd");
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;

                case 4:
                    do{
                    
                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;
                default:
                    System.out.println("Adios capo");
                    rep = 'n';

            }
        } while (rep == 's');  
    }
}
