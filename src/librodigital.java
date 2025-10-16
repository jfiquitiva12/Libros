public class librodigital extends libro{

    protected double tamaño;
    protected String disponible;


   public librodigital(){
   }


    public librodigital(String codigo, String titulo, String autor, double precio, int cantidadejemplares, double tamaño, String disponible) {
        super(codigo, titulo, autor, precio, cantidadejemplares);
        this.tamaño = tamaño;
        this.disponible = disponible;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamano) {
       this.tamaño = tamano;
    }

    public String getDisponible (String disponible){
       return disponible;
    }
    public void setDisponible(String disponible) {
       this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "librodigital{" +
                "tamano=" + tamaño +
                ", disponible=" + disponible +
                "";
    }



    public void prestar() {
        if (disponible == "no disponible") {
            System.out.println("No se puede prestar, el libro no está disponible");
        } else if (cantidadejemplares <= 0) {
            System.out.println(" No se puede prestar, no hay libros disponibles ");
        } else {
            cantidadejemplares--;
            System.out.println("Libro prestado correctamente ");
            if (cantidadejemplares == 0) {
                disponible = "no disponible";
            }
        }
    }

    public void devolver() {
        if (cantidadejemplares >= 2) {
            System.out.println("No se pueden devolver más de dos libros");
        } else {
            cantidadejemplares++;
            disponible = "disponible";
            System.out.println("Libro devuelto correctamente");
        }
    }




}
