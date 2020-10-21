import java.util.Scanner;

class sumadenumeros{

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        int num1, num2,num3;

        System.out.println("Escribe el primer numero:");
        num1 = leer.nextInt();
        System.out.println("Escribe el segundo numero:");
        num2 = leer.nextInt();
        num3 = num1 + num2;
        System.out.println("El resultado es: " + num3);




    }
}

