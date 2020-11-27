import java.util.*;

public class Menu{
    
    private int op;

    public int getop(){
        return op;
    }

    public void setop(int op){
        this.op = op;
    }

    Sueldo s = new Sueldo();
    Libreria lib = new Libreria();
    Datos_provedor prov = new Datos_provedor();

    public void opciones(){

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Seleccione lo que desea hacer");
        System.out.println("1. Calcular sueldo");
        System.out.println("2. Proveedores");
        System.out.println("3. Gestor de biblioteca");

        this.op = entrada.nextInt();

        
        switch (this.op) {
            case 1:

                s.identificador();

                break;

            case 2:

                prov.pedirDatos();
                prov.Calcular();
                
                break;

            case 3:
                
                lib.interfaz();
                break;

            default:
                
                System.out.println("Elija una opcion valida");
            
                break;
        }
    }

    
}