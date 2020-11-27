public class Ahorcado {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.imprimir();
        Jugador jugador = new Jugador();
        boolean ganador = false;

        for (int i = 1; i <= tablero.get_Elementos() * 2; i++) {
            String letra = jugador.pedirLetra();
            tablero.verificar(letra);
            tablero.imprimir();
            if (tablero.verificarGanar()) {
                ganador = true;
                break;
            }
        }
        if (ganador) {
            System.out.println("HAZ GANADO!!!");
           
        }else{
            System.out.println("VUELVE A INTENTARLO!!!");
        }
    }

}
//Aquí se corre el juego, en el que manda a llamar los metodos de las otras dos clases, verifica las condiciones de victoria y la impresion del tablero.