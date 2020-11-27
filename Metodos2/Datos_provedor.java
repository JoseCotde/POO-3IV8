import java.util.*;

public class Datos_provedor{
    Provedor persona = new Provedor();

    public void  pedirDatos(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del provedor: ");
        persona.setNombre(entrada.nextLine());

        System.out.println("Ingrese los datos de los 10 productos: ");
        for(int i = 0; i < 10; ++i){
            System.out.println("Ingrese el siguiente nombre: ");
            persona.setProducto(entrada.next(), i);

            System.out.println("Ingrese el costo del producto: ");
            persona.setCosto(entrada.nextInt(), i);

            System.out.println("Ingrese la cantidad en el inventario del producto: ");
            persona.setInventario(entrada.nextInt(), i);
        }
    }

    public void Calcular(){
        Scanner entrada = new Scanner(System.in);

        String productoMayor, productoMenor = persona.getProducto(0);
        int max = persona.getCosto(0);
        int min = persona.getCosto(0);
        int total = persona.getCosto(0);
        int costoTotal = persona.getCosto(0);
        
        for(int i = 0; i < 10; ++i){
            System.out.println("Producto: " + persona.getProducto(i));
            System.out.println("Costo del producto: " + persona.getCosto(i));
            System.out.println("Cantidad en el inventario: " + persona.getInventario(i));
            if(max < persona.getCosto(i)){
                max = persona.getCosto(i);
                productoMayor = persona.getProducto(i);
            }
            if(min > persona.getCosto(i)){
                min = persona.getCosto(i);
                productoMenor = persona.getProducto(i);
            }
            total+= persona.getCosto(i);
            costoTotal+= persona.getCosto(i) * persona.getInventario(i);
        }
    }
}