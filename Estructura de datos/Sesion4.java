import java.util.Scanner;

import java.util.*;

class Sesion4 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int intcase, intcaseAux, intcaseAux2, opcion;
        char Repmenu, Repcase, respuestaCa;
        double doublecase;
        float floatcase;
        Repmenu = 's';

        do{

            System.out.println("BIENVENIDO A MI TAREA PORFA NO ME REPRUEBE DOSPUNTOS UVE");
            System.out.println("Copiador de codigo profesional (mejor llamado programador) Cote de la Rosa Jose Carlos");
            System.out.println("Seleccione lo que desea hacer");
            System.out.println("1. Descuento segun tu edad");
            System.out.println("2. Numero decimal a binario");
            System.out.println("3. Conversion de grados");
            System.out.println("4. Contar numeros positivos y negativos");
            System.out.println("5. Caja registradora pero sin comprar nada (leer cantidades)");
            System.out.println("6. Calcular figuras geometricas");
            System.out.println("7. Tabla de valores");
            System.out.println("8. Calcular factoriales");
            System.out.println("9. Imprimir cuadrado");
            System.out.println("10. Imprimir patron de asteriscos");
            System.out.println("11. Imprimir diamante");
            System.out.println("12. Calculadora");
            System.out.println("13 Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 :
                
                Repcase = 's';
                do{    
                    System.out.println("Inserte su edad");
                    intcase = entrada.nextInt();
                
                    if (intcase>65){
                        System.out.println("Su descuento es del 40%");
                    }
                    else {
                        if (intcase<21){
                            
                            System.out.println("Sus padres son socios? escriba s para si y n para no");
                            respuestaCa = entrada.next().charAt(0);
                            
                            if (respuestaCa == 's'){
                                System.out.println("Su descuento es del 40%");
                            }
                            else {
                                System.out.println("Su descuento es del 25%");
                            }
                        }
                        else{ System.out.println("No aplica a descuento");}
                    }
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);
                } while (Repcase == 's');
                    break;
                
                case 2 :
                Repcase = 's';
                do{
                    int exp, digito;

                    do{ 
                        System.out.println("Inserte un numero decimal para convertir");
                        intcase = entrada.nextInt();

                    }while(intcase < 0);
                        
                        exp=0;
                        doublecase=0;

                    while(intcase!=0){
                        digito = intcase % 2;           
                        doublecase = doublecase + digito * Math.pow(10, exp);                                                   
                        exp++;
                        intcase = intcase/2;
                    }       
                    System.out.printf("Binario: %.0f %n", doublecase);
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);
                }while (Repcase == 's');
                    break;
                case 3 :
                Repcase = 's';
                do{
                    System.out.println("Elige el tipo de grados que vas a insertar");
                    System.out.println("1.Farenheit");
                    System.out.println("2.Celcius");
                    System.out.println("3.Kelvin");
                    System.out.println("4.Rankine");
                    intcase = entrada.nextInt();
                    switch (intcase) {
                        case 1:
                        System.out.println("Elige el tipo de grados en los que vas a convertir");
                        System.out.println("1.Celcius");
                        System.out.println("2.Kelvin");
                        System.out.println("3.Rankine");
                        intcaseAux = entrada.nextInt();
                        switch (intcaseAux) {
                            case 1:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = (doublecase - 32)*(5/9); 
                            System.out.println("La temperatura en Celsius es: "+doublecase);
                                break;
                            case 2:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = (doublecase - 32) * (5/9) + (273.15);
                            System.out.println("La temperatura en Kelvin es: "+doublecase);
                                break;
                            case 3:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = doublecase + 459.67;
                            System.out.println("La temperatura en Rankin es: "+doublecase);
                                break;
                            default:
                            System.out.println("Elije uno de los numeros por favor");
                                break;
                        }
                            break;
                        case 2:
                        System.out.println("Elige el tipo de grados en los que vas a convertir");
                        System.out.println("1.Farenheit");
                        System.out.println("2.Kelvin");
                        System.out.println("3.Rankine");
                        intcaseAux = entrada.nextInt();
                        switch (intcaseAux) {
                            case 1:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = (doublecase* 9/5) + 32;
                            System.out.println("La temperatura en Farenheit es: "+doublecase);    
                                break;
                            case 2:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = doublecase + 273.15;
                            System.out.println("La temperatura en Kelvin es: "+doublecase);
                                break;
                            case 3:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = (doublecase* 9/5) + 491.67;
                            System.out.println("La temperatura en Rankine es: "+doublecase);
                                break;
                            default:
                            System.out.println("Elije uno de los numeros por favor");
                                break;
                        }
                            break;
                        case 3:
                        System.out.println("Elige el tipo de grados en los que vas a convertir");
                        System.out.println("1.Celcius");
                        System.out.println("2.Farenheit");
                        System.out.println("3.Rankine");
                        intcaseAux = entrada.nextInt();
                        switch (intcaseAux) {
                            case 1:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = doublecase-273.15;
                            System.out.println("La temperatura en Celsius es: "+doublecase);    
                                break;
                            case 2:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = (doublecase-273.15)* 9/5 +35; 
                            System.out.println("La temperatura en Farenheit es: "+doublecase);
                                break;
                            case 3:
                            System.out.println("Inserta la temperatura");
                            doublecase = entrada.nextInt();
                            doublecase = doublecase*1.8;
                            System.out.println("La temperatura en Rankin es: "+doublecase);
                                break;
                            default:
                            System.out.println("Elije uno de los numeros por favor");
                                break;
                        }
                            break;
                        case 4:
                        System.out.println("Elige el tipo de grados en los que vas a convertir");
                        System.out.println("1.Celcius");
                        System.out.println("2.Kelvin");
                        System.out.println("3.Farenheit");
                        intcaseAux = entrada.nextInt();
                            switch (intcaseAux) {
                                case 1:
                                System.out.println("Inserta la temperatura");
                                doublecase = entrada.nextInt();
                                doublecase = (doublecase - 491.67)* 5/9;
                                System.out.println("La temperatura en Celsius es: "+doublecase);        
                                    break;
                                case 2:
                                System.out.println("Inserta la temperatura");
                                doublecase = entrada.nextInt();
                                doublecase = doublecase* 5/9;
                                System.out.println("La temperatura en Kelvin es: "+doublecase);
                                    break;
                                case 3:
                                System.out.println("Inserta la temperatura");
                                doublecase = entrada.nextInt();
                                doublecase = doublecase-459.67;
                                System.out.println("La temperatura en Farenheit es: "+doublecase);
                                    break;
                                default:
                                System.out.println("Elije uno de los numeros por favor");
                                    break;
                            }
                            break;
                        default:
                        System.out.println("Elije uno de los números por favor");    
                            break;
                    }
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);
                }while (Repcase == 's');
                    break;
                case 4 :
                Repcase = 's';                
                do{ int cont1 = 0, cont2 = 0, aux;
                    int n;
                    System.out.println("Ingrese la cantidad de numeros: ");
                    n = entrada.nextInt();
                    for(int i = 1; i <= n; ++i){
                        System.out.print("Ingrese el siguiente numero: ");
                        aux  = entrada.nextInt();
                        System.out.println();
                        if(aux < 0){
                            cont1++;
                        }else{
                            cont2++;
                        }
                    }
                    System.out.println("Esta es la cantidad de numeros negativos: " + cont1);
                    System.out.println("Esta es la cantidad de numeros positivos: " + cont2);                                   
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');
                    break;
                case 5 :
                do{                                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;
                case 6 :
                int base, altura, decicion;
                double resultado;
                do{ 
                    System.out.println("Elija la opcion deseada: ");
                    System.out.println("1. Calcular un cuadrado");
                    System.out.println("2. Calcular un triangulo");
                    System.out.println("3. Calcular un circulo");
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
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;
                case 7 :
                do{                                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;
                case 8 :
                do{                                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;
                case 9 :
                do{                                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;
                case 10 :
                do{                                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;
                case 11 :
                do{                                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;
                case 12 :
                do{                                    
                    System.out.println("si quieres reiniciar, pulsa s, si quieres salir, pulsa n ");
                    Repcase = entrada.next().charAt(0);    
                }while(Repcase == 's');

                    break;

                default:
                Repmenu = 'n';
            }
            System.out.println("si quieres volver al menu, pulsa s, si quieres salir, pulsa n");
            Repmenu = entrada.next().charAt(0);
        } while (Repmenu == 's');





    }

}