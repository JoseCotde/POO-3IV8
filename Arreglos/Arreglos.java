import java.util.*;
import java.util.Arrays; 

class Arreglos{

    public static void main(String[] args){
        
        Scanner entrada  = new Scanner(System.in);
        int opc = 0;
        Arreglos arr = new Arreglos();        
        
        System.out.println("Seleccione lo que quiere hacer: ");
        arr.opces();
        opc = entrada.nextInt();
        while(opc < 0 || opc > 5){
            System.out.println("La opcion es incorrecta, ingrese otra ");
            arr.opces();
            opc = entrada.nextInt();
        }
        while(opc != 5){
            switch (opc) {
                case 1:
                    arr.promedio();
                    break;
                case 2:
                    arr.Pares();
                    break;
                case 3:
                    arr.Asig();
                    break;
                case 4:
                    arr.matrices();
                    break;
            }
            System.out.println("Seleccione la opcion que quiere repetir: ");
            arr.opces();
            opc = entrada.nextInt();
            while(opc < 0 || opc > 5){
                System.out.println("La opcion que eligio es incorrecta, ingrese otra ");
                arr.opces();
                opc = entrada.nextInt();
            }
        }
        System.out.println("Adios ");
    }
    public void promedio(){
        
        Scanner entrada  = new Scanner(System.in);
        double arre[] = new double[12];
        
        System.out.println("Ingrese los 10 numeros para obtener los promedios");
        for(int i = 1; i <= 10; ++i){
            arre[i] = entrada.nextDouble();
        }
        double neg = 0, pos = 0, contadorn = 0, contadorp = 0, promedio;
        for(int i = 1; i <= 10; ++i){
            if(arre[i] < 0){
                neg+= arre[i];
                contadorn++;
            }
        }
        for(int i = 1; i <= 10; ++i){
            if(arre[i] > 0){
                pos+= arre[i];
                contadorp++;
            }
        }
        promedio = pos / contador;
        System.out.println("Este es el promedio de numeros positivos: " + promedio);
        promedio = nega / contadorn;
        System.out.println("Este es el promedio de numeros negativos: " + promedio);
    }
    public void Pares(){
        
        Scanner entrada  = new Scanner(System.in);
        double arre[] = new double[12];
        
        System.out.println("Ingrese los 10 digitos para obtener los promedios de los lugares pares: ");
        for(int i = 1; i <= 10; ++i){
            arre[i] = entrada.nextDouble();
        }
        int suma = 0, promedio = 0;
        for(int i = 1; i <= 10; i+= 2){
            suma+= arre[i];
        }
        promedio = suma / 5;
        System.out.println("Este es el promedio de los numeros pares: " + promedio);
    }
    public void Asig(){
        
        Scanner entrada  = new Scanner(System.in);
        double arre[] = new double[10];
        
        System.out.println("Ingrese las 10 calificaciones: ");
        for(int i = 0; i < 10; ++i){
            arre[i] = entrada.nextDouble();
        }
        Arrays.sort(arre);
        System.out.println("Estas son las 10 calificaciones: ");
        
        double promedio, suma = 0;
        for(int i = 0; i < 10; ++i){
            System.out.println(arre[i] + " ");
            suma+= arre[i];
        }
        promedio = suma / 10;
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion mas alta: " + arre[9]);
        System.out.println("Calificacion mas baja: " + arre[0]);
        int aprob = 0, repr = 0, sup = 0;
        for(int i = 0; i < 10; ++i){
            if(arre[i] > promedio){
                sup++;
            }
            if(arre[i] > 5.9){
                aprob++;
            }else{
                repr++;
            }
        }
        System.out.println("Calificaciones encima del promedio: " + sup);
        System.out.println("Alumnos aprobados: " + aprob);
        System.out.println("Alumnos reprobados: " + repr);
    }
    public void matrices(){
        
        Scanner entrada  = new Scanner(System.in);
        double matr[][] = new double[5][5];
        
        System.out.println("Ingrese los valores de la matriz A: ");
        for(int i = 1; i <= 3; ++i){
            for(int j = 1; j <= 3; ++j){
                matr[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("Ingrese los valores de la matriz B: ");
        for(int i = 1; i <= 3; ++i){
            for(int j = 1; j <= 3; ++j){
                matr[i][j]+= entrada.nextDouble();
            }
        }
        System.out.println("La suma es igual a: ");
        for(int i = 1; i <= 3; ++i){
            for(int j = 1; j <= 3; ++j){
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void opces(){
        
        System.out.println("1.- Calcular el promedio de una lista de 10 numeros");
        System.out.println("2.- Calcular el promedio de 10 numeros en lugares pares de una lista");
        System.out.println("3.- 10 calificaciones");
        System.out.println("4.- Sumar 2 matrices de 3x3");
        System.out.println("5.- Salir");
    }
}
