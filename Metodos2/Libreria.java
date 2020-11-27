import java.util.*;

public class Libreria{
    
    private int seleccion, eleccion_libro, cant;
    
    Libros Lib = new Libros();

    public void interfaz(){

        Scanner entrada = new Scanner(System.in);
        Libros Lib = new Libros();
        System.out.println("Seleccione lo que desea hacer");
        System.out.println("1. Consultar libros");
        System.out.println("2. Prestamo");
        System.out.println("3. Devolución");

        seleccion = entrada.nextInt();

        switch (seleccion) {
            case 1 :

                System.out.println("Elije el libro que quieres consultar");
                System.out.println("1. 50 sonvras de grei");
                System.out.println("2. La biblia");
                System.out.println("3. Como practicar yudo con un oso polar");
                System.out.println("4. Libro de ejemplo");
                System.out.println("5. Inserta titulo de libro");
                eleccion_libro = entrada.nextInt();

                switch (eleccion_libro) {
                    case 1:
                        Lib.grey();
                        System.out.println("Titulo: "+Lib.getnombre());
                        System.out.println("Autor: "+Lib.getautor());
                        System.out.println("Ejemplares en posesion: "+Lib.getempleares());
                        System.out.println("Ejemplares prestados: "+Lib.getempleares_pres());
                        break;
                    case 2:
                        Lib.biblia();
                        System.out.println("Titulo: "+Lib.getnombre());
                        System.out.println("Autor: "+Lib.getautor());
                        System.out.println("Ejemplares en posesion: "+Lib.getempleares());
                        System.out.println("Ejemplares prestados: "+Lib.getempleares_pres());
                        break;
                    case 3:
                        Lib.osos();
                        System.out.println("Titulo: "+Lib.getnombre());
                        System.out.println("Autor: "+Lib.getautor());
                        System.out.println("Ejemplares en posesion: "+Lib.getempleares());
                        System.out.println("Ejemplares prestados: "+Lib.getempleares_pres());
                        break;
                    case 4:
                        Lib.ejemplo();
                        System.out.println("Titulo: "+Lib.getnombre());
                        System.out.println("Autor: "+Lib.getautor());
                        System.out.println("Ejemplares en posesion: "+Lib.getempleares());
                        System.out.println("Ejemplares prestados: "+Lib.getempleares_pres());
                        break;
                    case 5:
                        Lib.insertar();
                        System.out.println("Titulo: "+Lib.getnombre());
                        System.out.println("Autor: "+Lib.getautor());
                        System.out.println("Ejemplares en posesion: "+Lib.getempleares());
                        System.out.println("Ejemplares prestados: "+Lib.getempleares_pres());
                        break;
                    default:
                        System.out.println("Elija una opcion valida");
                        break;
                }
                break;
            case 2 :

                System.out.println("Elije el libro que quieres prestar");
                System.out.println("1. 50 sonvras de grei");
                System.out.println("2. La biblia");
                System.out.println("3. Como practicar yudo con un oso polar");
                System.out.println("4. Libro de ejemplo");
                System.out.println("5. Inserta titulo de libro");
                eleccion_libro = entrada.nextInt();

                switch (eleccion_libro) {
                    case 1:
                        Lib.grey();
                        if (Lib.getempleares() == 0){
                            System.out.println("No hay mas libros para prestar");
                        } else {
                        Lib.setempleares(Lib.getempleares()- 1);
                        Lib.setempleares_pres(Lib.getempleares_pres()+1);
                        System.out.println("Se a prestado con exito, quedan : "+Lib.getempleares());
                        }
                        break;
                    case 2:
                        Lib.biblia();
                        if (Lib.getempleares() == 0){
                            System.out.println("No hay mas libros para prestar");
                        } else {
                        Lib.setempleares(Lib.getempleares()- 1);
                        Lib.setempleares_pres(Lib.getempleares_pres()+1);
                        System.out.println("Se a prestado con exito, quedan : "+Lib.getempleares());
                        }
                        break;
                    case 3:
                        Lib.osos();
                        if (Lib.getempleares() == 0){
                            System.out.println("No hay mas libros para prestar");
                        } else {
                        Lib.setempleares(Lib.getempleares()- 1);
                        Lib.setempleares_pres(Lib.getempleares_pres()+1);
                        System.out.println("Se a prestado con exito, quedan : "+Lib.getempleares());
                        }
                        break;
                    case 4:
                        Lib.ejemplo();
                        if (Lib.getempleares() == 0){
                            System.out.println("No hay mas libros para prestar");
                        } else {
                        Lib.setempleares(Lib.getempleares()- 1);
                        Lib.setempleares_pres(Lib.getempleares_pres()+1);
                        System.out.println("Se a prestado con exito, quedan : "+Lib.getempleares());
                        }
                        break;
                    case 5:
                        Lib.insertar();
                        if (Lib.getempleares() == 0){
                            System.out.println("No hay mas libros para prestar");
                        } else {
                        Lib.setempleares(Lib.getempleares()- 1);
                        Lib.setempleares_pres(Lib.getempleares_pres()+1);
                        System.out.println("Se a prestado con exito, quedan : "+Lib.getempleares());
                        }
                        break;
                    default:
                        System.out.println("Elija una opcion valida");
                        break;
                }
                break;
            case 3 :

                System.out.println("Elije el libro que quieres devolver");
                System.out.println("1. 50 sonvras de grei");
                System.out.println("2. La biblia");
                System.out.println("3. Como practicar yudo con un oso polar");
                System.out.println("4. Libro de ejemplo");
                System.out.println("5. Inserta titulo de libro");
                eleccion_libro = entrada.nextInt();

                switch (eleccion_libro) {
                    case 1:
                        Lib.grey();
                        Lib.setempleares(Lib.getempleares()+1);
                        Lib.setempleares_pres(Lib.getempleares_pres() -1);
                        System.out.println("Se a devuelto con exito, quedan : "+Lib.getempleares());
                        break;
                    case 2:
                        Lib.biblia();
                        Lib.setempleares(Lib.getempleares()+1);
                        Lib.setempleares_pres(Lib.getempleares_pres() -1);
                        System.out.println("Se a devuelto con exito, quedan : "+Lib.getempleares());
                        break;
                    case 3:
                        Lib.osos();
                        Lib.setempleares(Lib.getempleares()+1);
                        Lib.setempleares_pres(Lib.getempleares_pres() -1);
                        System.out.println("Se a devuelto con exito, quedan : "+Lib.getempleares());
                        break;
                    case 4:
                        Lib.ejemplo();
                        Lib.setempleares(Lib.getempleares()+1);
                        Lib.setempleares_pres(Lib.getempleares_pres() -1);
                        System.out.println("Se a devuelto con exito, quedan : "+Lib.getempleares());
                        break;
                    case 5:
                        Lib.insertar();
                        Lib.setempleares(Lib.getempleares()+1);
                        Lib.setempleares_pres(Lib.getempleares_pres() -1);
                        System.out.println("Se a devuelto con exito, quedan : "+Lib.getempleares());
                        break;
                    default:
                        System.out.println("Elija una opcion valida");
                        break;
                }
                break;
            default:
                System.out.println("Elija una opcion valida");

                break;
        }
    }
}