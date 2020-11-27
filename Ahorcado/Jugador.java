import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Jugador {

       
    public String pedirLetra(){
        String valor = " ";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            System.out.print("Ingrese letra   : ");
            valor = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }
}
//aqui se controla lo que el usuario mete como input al juego y se manejan las excepciones para evitar errores, usando las librerias de java.io (la que me da la excepcion) y .util (para la segunda parte de la excepcion)