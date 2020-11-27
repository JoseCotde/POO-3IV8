public class Tablero {

    private String[] palabra_victoria = {"J", "A", "V", "A"};
    private String[] palabra_Adivinada;

    public Tablero() {
        palabra_Adivinada = new String[palabra_victoria.length];
        limpiar();
    }

    public void limpiar() {
        for (int i = 0; i < palabra_Adivinada.length; i++) {
            palabra_Adivinada[i] = "";
        }
    }

    public void imprimir() {
        for (int i = 0; i < palabra_Adivinada.length; i++) {
            if (palabra_Adivinada[i].equals("")) {
                System.out.print("_");
            } else {
                System.out.print(palabra_Adivinada[i]);
            }

        }
        System.out.println("");
    }

    public void verificar(String letra) {
        for (int i = 0; i < palabra_victoria.length; i++) {
            if (palabra_victoria[i].equalsIgnoreCase(letra)) {
                palabra_Adivinada[i] = letra;
            }
        }
    }

    public int get_Elementos() {
        return palabra_victoria.length;
    }

    public boolean verificarGanar() {
        boolean ganar = true;
        for (int i = 0; i < palabra_Adivinada.length; i++) {
            if (palabra_Adivinada[i].equals("")) {
                ganar = false;

            }

        }
        return ganar;

    }

}
//se controla la frase con la que se gana, se guarda el imput y se hacen las operaciones logicas para comprobar si ganaste
//la frase es un array de strings