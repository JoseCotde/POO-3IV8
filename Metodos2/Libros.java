public class Libros{

    private String nombre,autor;
    private int empleares, empleares_pres;


    public int getempleares(){
        return empleares;
    }

    public void setempleares(int empleares){
        this.empleares = empleares;
    }

    public int getempleares_pres(){
        return empleares_pres;
    }

    public void setempleares_pres(int empleares_pres){
        this.empleares_pres = empleares_pres;
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public String getautor(){
        return autor;
    }

    public void setautor(String autor){
        this.autor = autor;
    }

    public void grey(){

        this.nombre = "50 sonvras de grei";
        this.autor = "Señora con daddy issues";
        this.empleares = 69 ;
        this.empleares_pres = 0 ;
    }

    public void biblia(){

        this.nombre = "biblia";
        this.autor = "jesus el robot del futuro";
        this.empleares = 6 ;
        this.empleares_pres = 0 ;
    }

    public void osos(){

        this.nombre = "Como practicar yudo con oso polar";
        this.autor = " Bear Grills y Frank de la JG";
        this.empleares = 30;
        this.empleares_pres = 0;
    }

    public void ejemplo(){

        this.nombre = "Libro de ejemplo";
        this.autor = "Autor de ejemplo";
        this.empleares = 1;
        this.empleares_pres = 0 ;       
    }

    public void insertar(){

        this.nombre = "Inserta titulo de libro" ;
        this.autor = "Inserta autor del libro" ;
        this.empleares = 20 ;
        this.empleares_pres = 0 ; 
    }
}